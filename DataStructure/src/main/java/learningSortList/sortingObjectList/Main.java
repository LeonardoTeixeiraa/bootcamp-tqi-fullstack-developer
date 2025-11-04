package learningSortList.sortingObjectList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Titulo> listaDeTitulos = new ArrayList<>();

        Titulo theWalkingDead = new Titulo("The Walking Dead");
        listaDeTitulos.add(theWalkingDead);
        Titulo lost = new Titulo("Lost");
        listaDeTitulos.add(lost);
        Titulo breakingBad = new Titulo("Breaking Bad");
        listaDeTitulos.add(breakingBad);

        System.out.println("Lista de Títulos desordenada: " + listaDeTitulos);
        Collections.sort(listaDeTitulos);

        System.out.println("\nLista de Titulos ordenada: " + listaDeTitulos);
    }
}
