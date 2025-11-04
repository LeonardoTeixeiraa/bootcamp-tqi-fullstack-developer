package learningSortList.sortingObjectList;

public class Titulo implements Comparable<Titulo> {
    private final String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
