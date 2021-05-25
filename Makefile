generate-fhir:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	./generateFhir.main.kts fhir4

generate-fhir-stu3:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	./generateFhir.main.kts fhir3

generate-fhir-r4:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	./generateFhir.main.kts fhir4
