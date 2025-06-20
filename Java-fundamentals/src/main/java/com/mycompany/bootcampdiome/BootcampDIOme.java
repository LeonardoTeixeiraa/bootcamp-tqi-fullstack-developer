/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bootcampdiome;

/**
 *
 * @author leonardo-teixeira
 */
public class BootcampDIOme {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         String nome = "Leonardo";
         String sobrenome = "Teixeira";
         
         System.out.println(nomeCompleto(nome, sobrenome));
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
