/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 *
 * @author achmad-pc
 */
public class JGender extends JPanel {

    public JGender() {
        JRadioButton rbMale = new JRadioButton();
        JRadioButton rbFemale = new JRadioButton();
        
        rbMale.setText("Male");
        rbMale.setSize(50,30);
        
        rbFemale.setText("Female");
        rbFemale.setSize(50, 30);
        
        this.add(rbMale);
        this.add(rbFemale);
        this.setSize(200, 40);
        
        
        
    }
    
    
}
