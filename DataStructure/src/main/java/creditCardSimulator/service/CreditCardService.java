package creditCardSimulator.service;

import creditCardSimulator.model.CreditCard;
import creditCardSimulator.model.Product;

import java.util.*;

public class CreditCardService {
    CreditCard creditCard = new CreditCard();
    List<Product> productList = new ArrayList<>();

    //Função para fazer compra
    void buy(Product product){
        productList.add(product);
        double saldoDisponivel = creditCard.getSaldo()- product.getValue();
        creditCard.setSaldo(saldoDisponivel);
    }

    void sortListByValue(){
        productList.sort(Comparator.comparingDouble(Product::getValue));
    }

    void showCreditCardStatment(){
        System.out.println("=======FATURA DO CARTÃO=======");
        for (Product p)
    }


}
