/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author Oscar
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consumo obj1=new Consumo();
        
        obj1.setLitros(50);
        obj1.setPgas(1.57);
        
        Consumo obj2=new Consumo(100,50,50,2);       
        System.out.println("Consumo= "+ obj2.consumoMedio(100,50));
        obj2.setLitros(20);
        System.out.println("Velocidad Media= "+ obj2.getVmed());
              
    }
      
}
