package dataStructure.generics2;

public class Martelo{
    int qtdMartelo;

    @Override
    public String toString(){
        return "Martelo - quantidade: " + qtdMartelo;
    }

    public Martelo(int qtdMartelo){
        this.qtdMartelo = qtdMartelo;
    }

}
