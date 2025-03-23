/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBanco;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author leonardo-teixeira
 */
public class ContaTerminal {
    
    //Metodos construtores Getters e Setters
    private  double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
        this.saldo = saldo;
        }else{
            System.out.println("\nSaldo invalido! Por favor, insira um valor positivo\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    private String nome;
    private int numeroConta;
    private String agencia;
    
    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta=  new ContaTerminal();
        
        //Cadastrando informacoes do usuario
        System.out.println("Informe o seu nome: ");
        conta.setNome(scanner.next());
        
        System.out.println("Informe o numero da agencia: ");
        conta.setAgencia(scanner.next());
        
        System.out.println("Informe o numero da conta: ");
        conta.setNumeroConta(scanner.nextInt());
        
        System.out.println("Informe o saldo disponivel: ");
        conta.setSaldo(scanner.nextDouble());
        
        //Exibindo informacoes cadastradas
        System.out.println(
            "Olá " + conta.getNome().concat(", obrigado por criar uma conta em nosso banco, ") +
            "sua agência é " + conta.getAgencia() + 
            ", conta " + conta.getNumeroConta()+ 
            " e seu saldo " + conta.getSaldo() + " já está disponível para saque."
        );

        scanner.close(); 
    }
}


