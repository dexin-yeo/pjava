# pjava
This assignment is on Darth Vader invasion based on swapi.

## Build
```bash
make build
```

## Test
```bash
make test
```

## Information
The api to get Darth Vader information is in DarthVader.java function getDarthVaderInvasionInfo()

As it is possible to have more than one starship, starship is stored as array instead.

The api returns the following
```bash
{"isLeiaOnPlanet":true,"starships":[{"name":"TIE Advanced x1","model":"Twin Ion Engine Advanced x1","class":"Starfighter"}],"crew":"342,953"}
```

## Criteria
- no starship found
  - empty array returned
- no crew found
  - "0" returned
- Leia not on planet
  - false returned    

## Usage
1. Build the all the java files in directory. All the class files would be stored in "bin" folder
```bash
make build
```
2. Run the api to get the Darth Vader invasion info. Where the example main entry method is located in test folder "DarthTest.java"
```bash
java -cp "libs/*.jar:bin/." src.test.DarthTest
```

## Examples
Getting the list of planets available. Where an array of objects (information of that planet) are returned. 
```java
import src.main.swapi.*;

public class Example1 {
	public static void main(String[] args) throws Exception {
		JSONArray planets = Swapi.getArr("planets");
	}
}
```

Getting the information on Leia Organa.
```java
import src.main.swapi.*;

public class Example2 {
	public static void main(String[] args) throws Exception {
		JSONObject leia = Swapi.getObject("https://swapi.dev/api/people/5/");
	}
}
```

New packages for different logic could be added/created by importing swapi package. Where ideally, only endpoints (people, films, starships, vehicles, species, planets) are required. Whereby the full url for each individual can be retrieved from the results.

## Additional Libraries used
org.json
