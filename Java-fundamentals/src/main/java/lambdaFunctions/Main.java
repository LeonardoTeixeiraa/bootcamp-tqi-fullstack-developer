package lambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Instância arrays dinâmicos
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();


        //Adiciona elementos ao array numeros
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

//        Primeiro exemplo utilizando um Consumer
        //Implementa um consumer com lambda function para dobrar os valores
        //        Consumer<Integer> dobrar = (valor) -> {dobro.add(valor*2);};
        //Realiza a operação de dobrar os valores do array numeros
        //        numeros.forEach(dobrar);

//        Segundo exemplo utilizando lambda functions diretamente no método foreach
        numeros.forEach((valor) -> {
            dobro.add(valor * 2);
//            Verifica se os valores são pares ou impares
            if (valor % 2 == 0) {
                par.add(valor);
            } else {
                impar.add(valor);
            }
        });

        //Exibe os arrays
        System.out.println(numeros);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}
