/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p9;

import java.util.ArrayList;

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
        Team team = new Team();
        team.setName("MU");
        
        Player player1 = new Player();
        player1.setName("Ronaldo");
        
        Player player2 = new Player();
        player2.setName("Mbappe");
        
        ArrayList<Player> p = new ArrayList();
        p.add(player1);
        p.add(player2);
        
        team.setPlayer(p);
        System.out.println(team.getPlayer().get(1).getName());
        
         
                
    }
    
}
