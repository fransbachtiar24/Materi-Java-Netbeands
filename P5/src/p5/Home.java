/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

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
        Bicycle mtb = new Bicycle();
        // attribute
        System.out.println(mtb.speed);
        Integer kecepatan = mtb.speed;
        System.out.println(kecepatan);
        
        // void
        mtb.method1();

        // return
        System.out.println(mtb.method2());
        Integer kecepatan2 = mtb.method2();
        System.out.println(mtb.method3());
    }
}
