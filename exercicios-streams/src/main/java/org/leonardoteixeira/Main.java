package org.leonardoteixeira;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex1
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        IntSummaryStatistics est = numeros.stream().collect(Collectors.summarizingInt(Integer::intValue));
        int maxNumber = est.getMax();
        System.out.println("Array recebido: " + numeros);
        System.out.println("Max Value: " + maxNumber);

        //Ex2
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> groupingStrings = palavras
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("\nValores agrupados pelo tamanho da string:");
        System.out.println(groupingStrings);

        //Ex4
            List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);
            var sumOfSquares = listaNumeros.stream()
                    .filter(n -> n % 2 == 0 )
                    .mapToInt(n -> n*n)
                    .sum();

            System.out.println("Soma dos quadrados: " + sumOfSquares);

        //Ex5
        //separar pares de impares
        Map<Boolean, List<Integer>> resultado = listaNumeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> numerosPares = resultado.get(true);
        List<Integer> numerosImpares = resultado.get(false);

        System.out.println("\nLista Completa: " + listaNumeros);
        System.out.println("Numeros Pares: " + numerosPares);
        System.out.println("Numeros Impares: " + numerosImpares);



    }
}