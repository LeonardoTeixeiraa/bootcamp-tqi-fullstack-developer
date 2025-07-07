package dataStructure.generics2;

import java.util.ArrayList;
import java.util.List;

public class Caixa<T> {

    //inicializar o array caixa
    private final List<T> ferramentas;

    //Construtor para instânciar uma nova caixa
    public Caixa() {
        this.ferramentas = new ArrayList<>();
    }

    //Colocar as ferramentas na caixa
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //Mostrar a Lista de Ferramentas
    public void mostrarFerramenta() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}
