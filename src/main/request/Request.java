package src.main.request;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Request {
    public static String getRes(String url) throws Exception {
        // create the client and get the response
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> resp = client.send(req, BodyHandlers.ofString());

        return resp.body().toString();
    }
}
