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
public abstract class Karyawan {
    private String nik = null;
    
    void setNikDefault(String nik){
        this.nik = nik; // bisa mengakses private
        this.setNikPublic(nik); // bisa mengakses public
    }
    
    protected void setNikProtected(String nik){ // # setNikProtected(String)
        this.setNikDefault(nik); // bisa mengakses default
    }
    
    public void setNikPublic(String nik){
        this.setNikProtected(nik); // bisa mengakses protected
    }
    
    public final String getPesan(){
        return "Selamat Pagi";
    }
}


