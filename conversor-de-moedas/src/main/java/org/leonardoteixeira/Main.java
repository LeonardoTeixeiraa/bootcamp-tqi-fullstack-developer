package org.leonardoteixeira;

import org.leonardoteixeira.service.ConversorService;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String menu = """
                ================================
                Informe o tipo de conversão
                1) BRL => USD
                2) USD => BRL
                3) EUR => BRL
                4) BRL => EUR
                5) EUR => USD
                6) USD => EUR
                \n
                Informe uma opção:
                """;

        System.out.println(menu);
        var op = sc.nextInt();
        System.out.println("Informe o valor para câmbio: ");
        var valor = sc.nextDouble();
        ConversorService service = new ConversorService();
        service.obterTaxaDeCambio(op);
        double resultado = service.realizarCambio(valor);
        System.out.println("valor de cambio: " + resultado);
    }
}