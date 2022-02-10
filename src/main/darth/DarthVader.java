package src.main.darth;

import org.json.*;

import src.main.swapi.Swapi;

/*
Criteria:
- Creates API that returns
    {
        "starship":{
            "name":"",
            "class":"",
            "model":""
        },
        "crew":"",
        "isLeiaOnPlanet":boolean
    }
*Notes:
- People: Darth Vader, Leia Organa
- Planet: Alderaan
- Starships: Death Star

Logic:
- if no starships were found, set the value for starship as an empty object {}
- if there is no crew on board the death star, set the crew value to 0
- if princess Leia is on the planet, then set truel else false
*/

public class DarthVader {
    private static JSONObject getObj(String endpoint, String toSearch) throws Exception {
        JSONArray arr = Swapi.getArr(endpoint);

        for (int i = 0; i < arr.length(); ++i) {
            JSONObject ele = arr.getJSONObject(i);
            String name = ele.getString("name");
            if (name.equals(toSearch)) {
                return ele;
            }
        }
        return null;
    }
    private static JSONArray getArrObj(String endpoint, String toSearch, String key) throws Exception {
        JSONObject obj = getObj(endpoint, toSearch);
        return (obj != null) ? obj.getJSONArray(key) : new JSONArray();
    }

    private static String getCrew(String endpoint, String toSearch) throws Exception {
        JSONObject obj = getObj(endpoint, toSearch);
        return (obj != null) ? obj.getString("crew") : "0";
    }

    private static boolean isLeia(String endpoint) throws Exception {
        JSONObject obj = Swapi.getObject(endpoint);
        String name = obj.getString("name");
        return name.equals("Leia Organa") ? true : false;
    }

    public static JSONObject getDarthVaderInvasionInfo() throws Exception {
        JSONArray darthVaderStarships = getArrObj("people", "Darth Vader", "starships");
        JSONArray starships = new JSONArray();

        for (int i = 0; i < darthVaderStarships.length(); ++i) {
            String ele = darthVaderStarships.getString(i);
            JSONObject starship = Swapi.getObject(ele);

            JSONObject jo = new JSONObject();
            jo.put("name", starship.getString("name"));
            jo.put("class", starship.getString("starship_class"));
            jo.put("model", starship.getString("model"));

            starships.put(jo);
        }

        String crew = getCrew("starships", "Death Star");

        JSONArray alderRes = getArrObj("planets", "Alderaan", "residents");
        boolean isOnPlanet = false;

        for (int i = 0; i < alderRes.length() && !isOnPlanet; ++i) {
            String ele = alderRes.getString(i);
            isOnPlanet = isLeia(ele);
        }

        JSONObject ret = new JSONObject();
        ret.put("starships", starships);
        ret.put("crew", crew);
        ret.put("isLeiaOnPlanet", isOnPlanet);
        return ret;
    }
}
