/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Steve
 */
public class GameCharacter {

    private int xPosition;
    private int yPosition;
    private int health;

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        if (xPosition < 1) {
            System.out.println("You cannot move that way");
        } else {
            this.xPosition = xPosition;
        }
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        if (yPosition < 1) {
            System.out.println("You cannot move that way");
        } else {
            this.yPosition = yPosition;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Your dead");
        } else {
            this.health = health;
        }
    }

    public GameCharacter(int xPosition, int yPosition, int health) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.health = health;
    }
}
