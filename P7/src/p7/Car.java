/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

/**
 *
 * @author user
 */
public class Car {
    private String warna = "White";
    
    // encapsulation
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warnaBaru){
        warna = warnaBaru;
    }
    public void resetWarna(){
        warna = "White";
    }
}
