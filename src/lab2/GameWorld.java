/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Steve
 */
public class GameWorld {
    
    private int maxXPos;
    private int MaxYPos;
    private int bombs;

    public GameWorld(int maxXPos, int MaxYPos, int bombs) {
        this.maxXPos = maxXPos;
        this.MaxYPos = MaxYPos;
        if(bombs<1 || bombs>10){
            System.out.println("Number of bombs must be between 1 an 10"
                    + " using the default of 3");
            this.bombs = 3;
        }
        else{
        this.bombs = bombs;
        }
    }
 

 

    public int getBombs() {
        return bombs;
    }

    public void setBombs(int bombs) {
       /**Should randomly put bombs on cords */
    }

    public int getMaxXPos() {
        return maxXPos;
    }

    public void setMaxXPos(int maxXPos) {
        this.maxXPos = maxXPos;
    }

    public int getMaxYPos() {
        return MaxYPos;
    }

    public void setMaxYPos(int MaxYPos) {
        this.MaxYPos = MaxYPos;
    }
    
    
    
}
