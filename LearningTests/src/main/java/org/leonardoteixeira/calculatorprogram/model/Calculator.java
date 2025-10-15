package org.leonardoteixeira.calculatorprogram.model;

import java.util.Arrays;

public class Calculator {
    public double sum(double... numbers){
        return Arrays.stream(numbers).sum();
    }
    public double squareRooot(Double number){
        if (number < 0){
            throw new IllegalArgumentException("Não exite raiz quadrada real para números negativos");
        }
        return Math.sqrt(number);
    }

    public boolean isOdd(int number){
        return number % 2 != 0;
    }

    public int div(int numerator, int divisor){
        if (divisor == 0){
            throw new IllegalArgumentException("O divisor não pode ser zero");
        }
        return numerator/divisor;
    }
}
