package learningSortList;

/*Crie uma lista de números inteiros e utilize o método
Collections.sort para ordená-la em ordem crescente e decrescente.
Em seguida, imprima as listas ordenadas.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(80);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(0);

        System.out.println("Lista desordenada(Original): " + numbers);
        Collections.sort(numbers);
        System.out.println("Lista ordenada crescente: " + numbers);

        Collections.sort(numbers,
                Collections.reverseOrder());
        System.out.println("Lista ordenada decrescente: " + numbers);
    }
}
