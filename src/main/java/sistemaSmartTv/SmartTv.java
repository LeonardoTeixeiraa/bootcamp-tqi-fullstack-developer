/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaSmartTv;

/**
 *
 * @author leonardo-teixeira
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligada =  true;
    }
    public void desligar(){
        ligada =  false;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }
    
    public void mudarCanal (int canal){
        this.canal = canal ;
    }

}