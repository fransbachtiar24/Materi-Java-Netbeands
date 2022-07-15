/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.util.Scanner;

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
        Car almazRs = new Car();
        System.out.println(almazRs.getWarna());
        
        almazRs.setWarna("Blue");
        System.out.println(almazRs.getWarna());
        
        almazRs.setWarna("Black");
        System.out.println(almazRs.getWarna());
        
        almazRs.resetWarna();
        System.out.println(almazRs.getWarna());

        Scanner scanner = new Scanner(System.in);
        almazRs.setWarna(scanner.nextLine());
        System.out.println("Warna anda : "+ almazRs.getWarna());

    }
    
}
