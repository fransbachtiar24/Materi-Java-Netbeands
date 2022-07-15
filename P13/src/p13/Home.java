/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p13;

import mdp.Direktur;

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
        Direktur direktur = new Direktur("Andri");
        direktur.setNik("101057");
        direktur.setGajiPokok(10000000.0);
        direktur.setTunjangan(20000000.0);
        System.out.println("=================");
        System.out.println(direktur.getNik());
        System.out.println(direktur.getNama());
        System.out.println(direktur.getGajiPokok());
        System.out.println(direktur.getTunjangan());
        System.out.println(direktur.getTotal());
        
    }
    
}
