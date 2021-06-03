import com.github.gradle.node.yarn.task.YarnTask

plugins {
    // https://github.com/node-gradle/gradle-node-plugin
    id("com.github.node-gradle.node") version "3.1.0"
}

// https://github.com/node-gradle/gradle-node-plugin/blob/master/docs/node.md
node {
    // https://nodejs.org
    version.set("14.17.0")

    // https://yarnpkg.com/package/yarn
    yarnVersion.set("1.22.10")

    download.set(true)
}

// Add required dependencies here
val yarnInstall by tasks.registering(YarnTask::class) {
    description = "Installs dependencies to the project"

    yarnCommand.set(listOf("add"))

    args.set(
        setOf(
            "@antora/cli@2.3.4",
            "@antora/site-generator-default@2.3.4",
            "@asciidoctor/core@2.2.4",
            // https://github.com/Mogztter/asciidoctor-kroki
            "asciidoctor-kroki@0.12.0",
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
    yarnCommand.set(listOf("outdated"))
}

val yarnUpgrade by tasks.registering(YarnTask::class) {
    description = "Upgrades dependencies"
    yarnCommand.set(listOf("upgrade"))
}


val buildDocs by tasks.registering(YarnTask::class) {
    dependsOn(yarnInstall)

    description = "Executes Antora to build the site"

    yarnCommand.set(listOf("run"))

    inputs.files(project.fileTree("modules"), "antora.yml", "site-local.yml")
    outputs.dir("${project.buildDir}/public/")

    args.set(setOf(
        "antora",
        "--html-url-extension-style=indexify",
        "--attribute", "project-version=${project.version}",
        "site.yml"
    ))
}


val serveDocs by tasks.registering(YarnTask::class) {
    dependsOn(yarnInstall)

    description = "Serves the build site"

    yarnCommand.set(listOf("run"))

    args.set(setOf(
        "live-server",
        "build/public",
        "--ignore=_"
    ))
}

