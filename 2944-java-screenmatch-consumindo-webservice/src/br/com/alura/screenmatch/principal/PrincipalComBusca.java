package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um filme para busca: ");
        var busca = sc.nextLine();

        String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        String endereco = "https://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=922fe93b";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println("Titulo diretamente do JSON: \n"+ json);
        System.out.println("-------------------------------------------");
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println("Titulo do DTO:");
        System.out.println(tituloOmdb);
        System.out.println("-------------------------------------------");
        System.out.println("TituloDTO convertido para a classe Titulo: ");
        Titulo titulo = new Titulo(tituloOmdb);
        System.out.println(titulo);


    }
}
