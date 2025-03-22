    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaSmartTv;

/**
 *
 * @author leonardo-teixeira
 */
public class Usuario {
    public static void main (String[] args) throws  Exception{
        
        SmartTv smartTv =  new SmartTv();
        
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(14);
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        
        
        
    }
}
