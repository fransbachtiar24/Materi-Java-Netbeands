/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p19;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
//        Mahasiswa mahasiswa = new Mahasiswa();
        JFrame jframe = new JFrame("Aplikasi MDP");
        jframe.setLayout(null);
        
        jframe.setTitle("Aplikasi Absensi");
        jframe.setSize(400, 300);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lnama = new JLabel("Nama");
        lnama.setBounds(30, 30, 50, 40);
        
        JLabel lalamat = new JLabel();
        lalamat.setText("Alamat");
        lalamat.setLocation(30, 60);
        lalamat.setSize(50, 40);

        jframe.add(lnama);
        jframe.add(lalamat);

        
    }
    
}
