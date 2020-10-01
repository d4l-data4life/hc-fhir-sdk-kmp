gen-kotlin:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_kotlin_models
