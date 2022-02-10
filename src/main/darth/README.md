# Darth
Darth is a package for getting the information of his invasion attack to Alderaan.

Darth imports Swapi for getting the response from swapi.

## Usage
The package has one public static method getDarthVaderInvasionInfo.
It returns the starships Darth Vader has, the crew of Death Star which is invading along with Darth Vader, and whether Leia is on planet Alderaan.
```java
JSONObject info = Darth.getDarthVaderInvasionInfo();
```
The method returns the following:
```bash
{"isLeiaOnPlanet":true,"starships":[{"name":"TIE Advanced x1","model":"Twin Ion Engine Advanced x1","class":"Starfighter"}],"crew":"342,953"}
```
