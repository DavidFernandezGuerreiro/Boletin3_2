/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;

/**
 *
 * @author dfernandezguerreiro
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
    public Satelite(){
        meridiano=paralelo=distanciaTerra=0;
    }
    public void setSatelite (double p, double m, double d){
        meridiano=m;
        paralelo=p;
        distanciaTerra=d;
    }
    
    public void verPosicion(){
        System.out.println("o Satelite atopase no paralelo "+paralelo+" meridiano "+meridiano+" a unha distancia da terra "+distanciaTerra);
    }
}
