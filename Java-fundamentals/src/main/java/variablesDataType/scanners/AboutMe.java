/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variablesDataType.scanners;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leonardo-teixeira
 */
//Exemplo de algoritmo  para aprendizado implementando a Classe Scanner 
public class AboutMe {
    public static void main(String[] args) {
        // criando o objeto Scanner
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);
  
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        //Imprimindo os dados do usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura e " +  altura + " cm");
        
    }
}
