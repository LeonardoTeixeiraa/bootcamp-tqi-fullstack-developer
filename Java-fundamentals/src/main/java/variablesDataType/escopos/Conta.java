/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variablesDataType.escopos;

/**
 *
 * @author leonardo-teixeira
 */
public class Conta {
    // Variavelá da classe Conta

    double saldo = 10.0;

    public void sacar(double valor) {
        //variavel local de metodo
         if (valor > saldo) {
        System.out.println("Saldo insuficiente!");
        } else {
        saldo -= valor;
    }

    }

    public void imprimirSaldo() {
        //disponivel em toda classe
        System.out.println(saldo);
        //somente o metodo sacar conhece a variavel novoSaldo
//            System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        //variavel local para o metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
        }
        //escopo de fluxo, x e valorCalculado não sao acessiveis fora da estrutura de repeticao for
        return valorMontante;
    }
    
    public void imprimirDividaExponencial(Conta conta){
        System.out.println(conta.calcularDividaExponencial());
    }

}
