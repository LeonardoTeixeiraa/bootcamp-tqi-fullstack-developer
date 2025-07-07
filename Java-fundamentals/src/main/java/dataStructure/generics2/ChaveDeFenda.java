package dataStructure.generics2;

public class ChaveDeFenda {

    public void setQtdChaves(int qtdChaves) {
        this.qtdChaves = qtdChaves;
    }

    int qtdChaves;

    public ChaveDeFenda(int qtdChaves){
        this.qtdChaves = qtdChaves;
    }

    @Override
    public String toString(){
        return "Chave de fendas - quantidade: " + qtdChaves;
    }

}
