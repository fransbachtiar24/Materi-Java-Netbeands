/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p17;

/**
 *
 * @author mhdha
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop laptop = laptopFactory.createLaptop(LaptopType.MULTIMEDIA);
        laptop.runTest();
    }
    
}
