# Swapi
Swapi is a package that is based on the response gotten from the swapi website.

## Usage
There are two methods available in this package.

### getArr
getArr is a method for getting the results array of of different endpoints available in swapi.
- people
- films
- starships
- vehicles
- species
- planets

The root url for swapi is hardcoded in this package, hence, the above only the above endpoints are needed.
```java
// gets the results array from people endpoint
JSONArray results = Swapi.getArr("people");
```

### getObject
getObject is a method for getting the individual object from the response, whereby it takes in the full url to the object as parameter.
```java
// gets the object of Leia
JSONObject obj = Swapi.getObject("https://swapi.dev/api/people/5/")
```
