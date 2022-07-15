/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p8;

/**
 *
 * @author aziha
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println(mahasiswa.getProdi());
        
        Mahasiswa mahasiswa1 = new Mahasiswa("TI");
        System.out.println(mahasiswa1.getProdi());
        
        Mahasiswa mahasiswa2 = new Mahasiswa(24);
        System.out.println(mahasiswa2.getProdi());
        
        mahasiswa2.setData("MJ");
        System.out.println(mahasiswa2.getProdi());
           
        mahasiswa2.setData("AK","Reza");
        System.out.println(mahasiswa2.getProdi());
        System.out.println(mahasiswa2.getNama());
    }
    
}
