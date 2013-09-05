/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Steve
 * 
 * 
 * I know there is no game loop and no way to move the character
 * that will be implemented over the weekend
 * this is just to get started.
 */
public class Game {
    
  
    
    public void startGame(){
    
    GameWorld world = new GameWorld(12,12,7);    
    GameCharacter jim = new GameCharacter(1,1,5);
    GUI gui = new GUI(jim,world);
    
    gui.statusUpdate();
    
  }
    
    
    
}
