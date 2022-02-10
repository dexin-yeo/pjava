
build:
	find -name "*.java" > sources.txt && javac -cp libs/json-20211205.jar -d bin @sources.txt

test:
	java -cp "libs/json-20211205.jar:bin/." src.test.RequestTest
	java -cp "libs/json-20211205.jar:bin/." src.test.SwapiTest
	java -cp "libs/json-20211205.jar:bin/." src.test.DarthTest
