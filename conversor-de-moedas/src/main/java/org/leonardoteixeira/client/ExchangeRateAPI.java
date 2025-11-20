package org.leonardoteixeira.client;

import com.google.gson.Gson;
import org.leonardoteixeira.config.ApiConfig;
import org.leonardoteixeira.dto.ConversorDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {
    private final Gson gson = new Gson();
    private final String API_KEY = ApiConfig.getKey();

    public ConversorDTO buscaValorMoedas(String baseCode, String targetCode) throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/"+ API_KEY +"/pair/"+ baseCode +"/" + targetCode;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response =
                HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        return gson.fromJson(json, ConversorDTO.class);
    }
}
