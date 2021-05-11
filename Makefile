generate-fhir:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_kotlin_models

generate-fhir-stu3:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_kotlin_stu3_models

generate-fhir-r4:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_kotlin_r4_models
