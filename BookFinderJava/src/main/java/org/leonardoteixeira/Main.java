package org.leonardoteixeira;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.net.URLEncoder.encode;

public class Main {
        public static void main(String[] args) throws IOException, InterruptedException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual livro você deseja encontrar? ");
            var busca = sc.nextLine();

            String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

            String urlBody = "https://www.googleapis.com/books/v1/volumes?q=" + buscaCodificada;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlBody))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
            sc.close();
        }
}