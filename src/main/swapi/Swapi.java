package src.main.swapi;

import org.json.*;

import src.main.request.Request;

public class Swapi {
    final static String url = "https://swapi.dev/api/";

    public static JSONArray getArr(String endpoint) throws Exception {
        String resp = Request.getRes(Swapi.url + endpoint);

        JSONObject obj = new JSONObject(resp);
        return obj.getJSONArray("results");
    }
    
    public static JSONObject getObject(String url) throws Exception {
        String resp = Request.getRes(url);
        return new JSONObject(resp);
    }
}