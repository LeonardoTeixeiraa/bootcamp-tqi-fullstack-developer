package creditCardSimulator;

import creditCardSimulator.model.CreditCard;
import creditCardSimulator.model.Product;
import creditCardSimulator.service.CreditCardService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();
        CreditCardService cardService = new CreditCardService(creditCard);

        System.out.println("Informe o saldo Limite do cartão: ");
        creditCard.setSaldo(sc.nextDouble());
        sc.nextLine();

        while (creditCard.getSaldo() > 0) {
            String nomeProduto;
            double valorProduto;

            System.out.println("Informe o nome do produto e o valor: ");
            System.out.println("Nome: ");
            nomeProduto = sc.nextLine();
            System.out.println("Valor(R$): ");
            valorProduto = sc.nextDouble();
            sc.nextLine();
            Product product = new Product(nomeProduto, valorProduto);
            cardService.buy(product);

            if (creditCard.getSaldo() <= 0) {
                System.out.println("\nLimite de compra atingido!");
                break;
            }
        }
        cardService.showCreditCardStatment();
        sc.close();
    }
}
