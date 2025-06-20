/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variablesDataType.escopos;

/**
 *
 * @author leonardo-teixeira
 */
public class Usuario {
    public static void main (String[] args){
        Conta conta = new Conta();
        
        conta.sacar(5);
        conta.calcularDividaExponencial();
        conta.imprimirSaldo();
        conta.imprimirDividaExponencial(conta);
    }
}
