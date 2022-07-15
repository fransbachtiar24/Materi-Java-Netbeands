package pquiz1;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        System.out.println("1. Lihat Data Brand");
        System.out.println("2. Tambah Data Brand");
        System.out.println("==========");
        
        Brand brand = new Brand();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pilih 1/2 : ");
        
        Integer menu = scanner.nextInt();
        
        if(menu == 1) {
            System.out.println(brand.getData());
            System.out.println("SELESAI");
        } else if(menu == 2) {
            Scanner scanner2 = new Scanner(System.in);
            
            System.out.print("Masukkan nama Brand 2 : ");
            String nama = scanner2.nextLine();
            
            brand.setData(nama);
            
            System.out.print("Masukkan nama Brand 3 : ");
            nama = scanner2.nextLine();
            
            brand.setData(nama);
            
            System.out.println("==========");
            System.out.println("Daftar semua brand : " + brand.getData());
            
            System.out.println("SELESAI");
        }
    }
    
}
