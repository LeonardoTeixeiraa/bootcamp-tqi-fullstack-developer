package dataStructure.generics2;

public class Furadeira {
    public void setMarcaFuradeira(String marcaFuradeira) {
        this.marcaFuradeira = marcaFuradeira;
    }

    private String marcaFuradeira;

    public Furadeira(String marca) {
        this.marcaFuradeira = marca;
    }

    @Override
    public String toString(){
        return "Furadeira - marca: " + marcaFuradeira;
    }

}
