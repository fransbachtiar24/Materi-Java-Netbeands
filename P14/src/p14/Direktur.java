/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14;

/**
 *
 * @author user
 */
public class Direktur extends Karyawan{
    private Double tunjangan;
    
    void setTunjanganDefault(Double tunjangan){
        this.setNikDefault("Default"); // subclass bisa mengakses default super class
        this.setNikProtected("Protected"); // subclass bisa mengakses protected super class
        this.setNikPublic("Public");// subclass bisa mengakses public super class
    }
    
    protected void setTunjanganProtected(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public void setTunjanganPublic(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    
//    @Override
//    public String getPesan(){
//        return "Selamat Siang";
//    }
    
}
