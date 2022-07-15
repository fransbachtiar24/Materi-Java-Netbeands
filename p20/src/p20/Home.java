/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p20;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author computer
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jframe = new JFrame("Aplikasi MDP");
        
        JLabel labelNama = new JLabel("Username");
        labelNama.setBounds(30, 30, 100, 40);
        
        JTextField tfNama = new JTextField();
        tfNama.setBounds(130, 40, 150, 25);
        
        JLabel labelAlamat = new JLabel();
        labelAlamat.setText("Password");
        labelAlamat.setBounds(30, 60, 100, 40);
        
        JPasswordField tfPass = new JPasswordField();
        tfPass.setBounds(130, 70, 150, 25);
        
        JLabel labelLevel = new JLabel("Level");
        labelLevel.setBounds(30, 90, 100, 40);
        
        String[] levelList = {"Dosen", "Mahasiswa"};
        JComboBox cbLevel = new JComboBox(levelList);
        cbLevel.setBounds(130, 100, 150, 25);
        
        JButton btnLogin = new JButton();
        btnLogin.setText("Login");
        btnLogin.setBounds(130, 140, 75, 25);
        btnLogin.setBackground(Color.YELLOW);
        
        JButton btnRegister = new JButton();
        btnRegister.setText("Daftar");
        btnRegister.setBounds(205, 140, 75, 25);
        btnRegister.setBackground(Color.RED);
        
        jframe.add(labelNama);
        jframe.add(labelAlamat);
        jframe.add(tfNama);
        jframe.add(tfPass);
        jframe.add(btnLogin);
        jframe.add(btnRegister);
        jframe.add(cbLevel);
        jframe.add(labelLevel);
        
        jframe.setLayout(null);
        jframe.setSize(350, 225);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
