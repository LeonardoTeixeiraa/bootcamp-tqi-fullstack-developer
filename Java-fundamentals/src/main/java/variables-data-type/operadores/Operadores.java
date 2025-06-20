/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author leonardo-teixeira
 */
public class Operadores {
    public static void main (String[] args){
//        Exemplo de operador ternario
        int num1 = 5;
        int num2 = 6;
        
//      verifica se a condicao e true, se for resultado = verdadeiro, senao resultado = falso
        String resultado = num1 == num2 ? "verdadeiro" : "falso";
        
        System.out.println(resultado);
        
//        Exemplo de operador relacional

        String nomeUm = "Leonardo";
        String nomeDois = new String ("Leonardo");
        
//        O metodo equals compara Strings e objetos e retorna verdadeiro caso os valores sejam iguais
        System.out.println(nomeUm.equals(nomeDois));
        
//        Exemplo de operador Unario
        boolean varUm = true;
        boolean varDois = false;
        
        resultado = !varUm == varDois ? "diferentes" : "iguais";
        
        System.out.println("Os valores de var1 e var2 de acordo com a condicao sao " + resultado);  
        
//        Exemplo de operadores logicos
        boolean condicao1 =  true;
        boolean condicao2 = false;
        
//        Verifica se as dua    s condicoes sao verdadeiras
         if(condicao1 && condicao2){
             System.out.println("As duas condicoes sao verdadeiras");
         }
//         Verifica se uma das condicoes e verdadeira
            if(condicao1 || condicao2){
                System.out.println("Uma das condicoes sao verdadeiras");
            }
         
        
    }
}
