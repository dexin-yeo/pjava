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

## Additional Libraries used
org.json
