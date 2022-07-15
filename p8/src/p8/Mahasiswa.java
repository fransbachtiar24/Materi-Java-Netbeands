/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8;

/**
 *
 * @author aziha
 */
public class Mahasiswa {
    private String prodi;
    private String nama;
    public Mahasiswa(){
        this.prodi="MI";
    }
    public Mahasiswa(String prodi) {
        this.prodi = prodi;  
    }
    public Mahasiswa(Integer prodi) {
        if(prodi == 24){
            this.prodi = "SI";
        }
        else if(prodi == 25){
                this.prodi = "TI";       
        }  
    }
    public String getProdi() {
        return this.prodi;
    }
   
    public String getNama() {
        return nama;
    }
     public void getNama(String nama) {
        this.nama = nama;
    }
    public void setData(String prodi) {
        this.prodi = prodi;
    }
    public void setData(String prodi, String nama) {
        this.prodi = prodi;
        this.nama = nama;
    }
    
    
}
