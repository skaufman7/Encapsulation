/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class GUI {
    
    Scanner keyboard = new Scanner(System.in);
    private boolean dead = false;
    private GameCharacter jim;
    private GameWorld world;

    public GUI(GameCharacter jim, GameWorld world) {
        this.jim = jim;
        this.world = world;
    }
    
    public void statusUpdate(){
        System.out.println("x "+jim.getxPosition());
        System.out.println("y "+jim.getyPosition());
        System.out.println("health "+jim.getHealth());
        System.out.println("bombs left"+ world.getBombs());
        
}
    
    
}
