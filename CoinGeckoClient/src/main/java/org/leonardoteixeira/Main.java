package org.leonardoteixeira;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID da criptomoeda (ex: bitcoin, ethereum): ");
        String coinId = sc.nextLine().trim().toLowerCase(); // Garante minúsculas para o ID

        System.out.print("Digite a moeda de comparação (ex: usd, brl, eur): ");
        String vsCurrency = sc.nextLine().trim().toLowerCase();

        // 1. Codificar a URL para segurança e construir o corpo da URL
        String encodedCoinId = URLEncoder.encode(coinId, StandardCharsets.UTF_8);
        String encodedVsCurrency = URLEncoder.encode(vsCurrency, StandardCharsets.UTF_8);

        // API CoinGecko Simple Price
        String urlBody = String.format(
                "https://api.coingecko.com/api/v3/simple/price?ids=%s&vs_currencies=%s",
                encodedCoinId,
                encodedVsCurrency
        );

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlBody))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        sc.close();
    }
}