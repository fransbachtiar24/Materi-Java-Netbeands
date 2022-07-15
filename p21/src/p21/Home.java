/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p21;

import gui.JGender;
import gui.JTombol;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

/**
 *
 * @author achmad-pc
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JTombol jtombol = new JTombol();
        jtombol.setLocation(30, 40);
        
        JGender jgender = new JGender();
        jgender.setLocation(30, 60);
        
   
        
        JFrame jframe = new JFrame("Aplikasi Absensi");
        jframe.add(jtombol);
        jframe.add(jgender);
        
        jframe.setSize(300,300);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(3);
        
        
        
        
    }
    
}
