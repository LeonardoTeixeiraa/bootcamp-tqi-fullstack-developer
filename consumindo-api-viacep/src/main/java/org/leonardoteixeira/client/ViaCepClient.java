package org.leonardoteixeira.client;

import com.google.gson.Gson;
import org.leonardoteixeira.dto.EnderecoDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepClient {

    private final Gson gson = new Gson();

    public EnderecoDTO buscarCep(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response =
                HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        if (json.contains("\"erro\": true")) {
            throw new IllegalArgumentException("CEP inexistente.");
        }

        return gson.fromJson(json, EnderecoDTO.class);
    }

}
