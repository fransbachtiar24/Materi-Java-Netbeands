
package pkg2024240041;

import java.util.Scanner;


public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Penjualan penjualan = new Penjualan();
        Barang barang = new Barang();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Nama barang : ");
        String nama = scanner.nextLine();
        barang.setNama(nama);
        
        System.out.print("Harga barang : ");
        Double harga1 = scanner.nextDouble();
        barang.setHarga(harga1);
        
        System.out.print("Jumlah barang : ");
        Double jumlahBarang = scanner.nextDouble();
        penjualan.setJumlahbarang(jumlahBarang);
        
        double totalharga = harga1 * jumlahBarang;
        
        
        if(totalharga <= 100000.0){
            penjualan.setPajak(0.05);
            
        }else if(totalharga > 100000.0){
            penjualan.setPajak(0.1);
        }
        
        double totalbayar = totalharga + (totalharga * penjualan.getPajak()); 
        
        System.out.println("=======================");
        System.out.println("Total Harga = " + totalharga);
        System.out.println("Pajak       = " + penjualan.getPajak());
        System.out.println("Total Bayar = " + totalbayar);
        
        
        
        
        
        
    }
    
}
