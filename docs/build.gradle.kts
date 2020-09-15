import com.moowork.gradle.node.yarn.YarnTask

plugins {
    // https://github.com/node-gradle/gradle-node-plugin
    id("com.github.node-gradle.node") version "2.2.4"
}

// https://github.com/node-gradle/gradle-node-plugin/blob/master/docs/node.md
node {
    // https://nodejs.org
    version = "14.8.0"

    // https://yarnpkg.com/package/yarn
    yarnVersion = "1.22.4"

    download = true
}

// Add required dependencies here
val yarnInstall by tasks.registering(YarnTask::class) {
    description = "Installs dependencies to the project"

    setYarnCommand("add")

    setArgs(
        setOf(
            "@antora/cli@2.3.3",
            "@antora/site-generator-default@2.3.3",
            "@asciidoctor/core@2.2.0",
            // https://github.com/Mogztter/asciidoctor-kroki
            "asciidoctor-kroki@0.9.2",
            // https://github.com/tapio/live-server
            "live-server@1.2.1",
            "broken-link-checker@0.7.8",

            // other 3rd dependencies
            "mkdirp@1.0.4"
        )
    )
}

val yarnOutdated by tasks.registering(YarnTask::class) {
    description = "Checks for outdated yarn dependencies"
    setYarnCommand("outdated")
}

val yarnUpgrade by tasks.registering(YarnTask::class) {
    description = "Upgrades dependencies"
    setYarnCommand("upgrade")
}


val buildDocs by tasks.registering(YarnTask::class) {
    dependsOn(yarnInstall)

    description = "Executes Antora to build the site"

    setYarnCommand("run")

    inputs.files(project.fileTree("modules"), "antora.yml", "site-local.yml")
    outputs.dir("${project.buildDir}/public/")

    args = setOf(
        "antora",
        "--html-url-extension-style=indexify",
        "--attribute", "project-version=${project.version}",
        "site.yml"
    )
}


val serveDocs by tasks.registering(YarnTask::class) {
    dependsOn(yarnInstall)

    description = "Serves the build site"

    setYarnCommand("run")

    args = setOf(
        "live-server",
        "build/public",
        "--ignore=_"
    )
}

