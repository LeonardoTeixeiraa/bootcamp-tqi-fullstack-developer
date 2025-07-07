package dataStructure.generics2;

public class Main {
    public static void main(String[] args) {
        Caixa<Object> caixa = new Caixa<>();
        caixa.adicionarFerramenta(new ChaveDeFenda(3));
        caixa.adicionarFerramenta(new Furadeira("Makita"));
        caixa.adicionarFerramenta(new Martelo(1));

        System.out.println("Ferramentas na Caixa");
        caixa.mostrarFerramenta();
    }

}
