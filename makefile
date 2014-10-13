

all:
	mkdir -p bin/
	javac -d bin/ source/*.java
	cd bin && java Main
