package src.test;

import src.main.swapi.*;
import org.json.*;

public class SwapiTest {
    public static void main(String[] args) throws Exception {
        System.out.println(Swapi.getArr("people"));
        System.out.println(Swapi.getObject("https://swapi.dev/api/starships/13/"));
    }
}
