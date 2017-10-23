/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;
import java.util.Scanner;


/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Satelite sat1=new Satelite();
        Scanner sc=new Scanner (System.in);
        
      /*  System.out.println("Escribe el paralelo : ");
        double p=sc.nextDouble();
        
        System.out.println("Escribe el meridiano : ");
        double m=sc.nextDouble();
        
        System.out.println("Escribe la distancia a Tierra : ");
        double d=sc.nextDouble();*/
      
        System.out.println("Escribe los parametros");
      
        sat1.setSatelite(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        
        sat1.verPosicion();
        
    }
    
}
