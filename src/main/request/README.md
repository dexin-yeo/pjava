# Request
Request is a package for making a http request and get the response in string.

## Usage
The class method "getRes" takes in a string parameters containing the full url to make the http request on and returns the response in string.

```java
// gets the entire response of the url given
String response = Request.getRes("https://swapi.dev/api/people");
```
