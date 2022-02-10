package src.test;

import src.main.request.*;

public class RequestTest {
    public static void main(String[] args) throws Exception {
        System.out.println(Request.getRes("https://swapi.dev/api/people"));
    }
}
