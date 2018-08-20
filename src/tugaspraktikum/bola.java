/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

/**
 *
 * @author ASUS
 */
public class bola {
     public int JariJari;
   public double phi = 3.14;
   
   public int getJariJari(){
       return JariJari;
   }
   
   public double getphi(){
       return phi;
   }
   public void setJariJari(int newJariJari){
       JariJari = newJariJari;
   }
   public void setphi(double newphi){
       phi = newphi;
   }
   public void setShowdiameter(){
       int diameter;
       diameter = 2*JariJari; 
       
   }
    public void setShowLuaspermukaan() {
        double l;
        l =4*Math.PI*JariJari;
        System.out.println("Luas permukaan = "+l+"cm");
    }
    public void setShowVolume(){
        double V;
        V = (4*Math.PI*JariJari*JariJari)/3;
        System.out.println("Luas Volume = "+V+"cm");
    }
   

}
