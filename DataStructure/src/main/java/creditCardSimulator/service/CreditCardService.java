package creditCardSimulator.service;

import creditCardSimulator.model.CreditCard;
import creditCardSimulator.model.Product;

import java.util.*;

public class CreditCardService {
    CreditCard creditCard = new CreditCard();
    List<Product> productList = new ArrayList<>();

    public CreditCardService(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    //Função para fazer compra
    public void buy(Product product){
        if (product.getValue() <= creditCard.getSaldo()) {
            productList.add(product);
            double saldoDisponivel = creditCard.getSaldo() - product.getValue();
            creditCard.setSaldo(saldoDisponivel);
            System.out.println("Compra realizada: " + product.getName() + " - R$ " + product.getValue());
        } else {
            System.out.println("Compra negada! Limite insuficiente para " + product.getName());
        }
    }

    public void sortListByValue(){
        productList.sort(Comparator.comparingDouble(Product::getValue));
    }

   public void showCreditCardStatment(){
        System.out.println("=======FATURA DO CARTÃO=======");
        for (Product p : productList){
            System.out.printf("%-20s R$ %.2f%n", p.getName(), p.getValue());
        }
    }


}
