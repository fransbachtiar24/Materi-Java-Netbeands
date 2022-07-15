/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14;

import kampus.Ob;

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
        direktur.setTunjanganDefault(10.0); // object bisa mengakses default
        direktur.setTunjanganProtected(20.0); // object bisa mengakses protected
        direktur.setTunjanganPublic(30.0); // object bisa mengakses public
        System.out.println(direktur.getPesan()); 
        // Jika tidak ada Override = Selamat Pagi
        // jika ada override = Selamat siang
        
        Ob ob = new Ob();
        ob.setLemburPublic(10000.0);
        
        System.out.println(Marketing.m1()); // 10.0
    }
    
}