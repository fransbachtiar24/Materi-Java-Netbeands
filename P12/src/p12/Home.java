/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12;

/**
 *
 * @author user
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direktur direktur = new Direktur();
        direktur.setNik("101057");
        System.out.println(direktur.getNik());
        System.out.println(direktur.getTotal());
        
        Ob ob = new Ob();
        System.out.println(ob.getTotal());
        
        Persegi persegi = new Persegi();
        persegi.setSisi(4.0);
        System.out.println("Sisi : "+ persegi.getSisi());
        System.out.println("Luas : "+ persegi.getLuas());
    }
    
}
