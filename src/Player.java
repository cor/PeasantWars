import javax.swing.*;
import java.awt.*;

/**
 * Player class
 */
public class Player {

    public Dimension size;
    public Point position;

    public int moveSpeed;

    /**
     * The default initializer
     */
    public Player() {
        position = new Point(200, 200);
        size = new Dimension(60, 60);
        moveSpeed = 5;
    }

    /**
     * Move the player
     * @param direction the direction to move the player in
     * @param distance the distance for the player to walk
     */
    public void move(Direction direction, int distance){
        switch (direction) {
            case NORTH:
                position.y -= distance;
                break;
            case EAST:
                position.x += distance;
                break;
            case SOUTH:
                position.y += distance;
                break;
            case WEST:
                position.x -= distance;
                break;
        }
    }

    /**
     * Draw the player
     * @param g2d the Graphics2D object to draw the player to
     */
    public void draw(Graphics2D g2d) {
        Image Peasant = new ImageIcon("images/Peasant.png").getImage();
        g2d.drawImage(Peasant, position.x, position.y, 100, 100, null);
    }

    /**
     * Update the player
     * @param inputManager the game's input manager
     */
    public void update(InputManager inputManager) {

        // move the player
        if (inputManager.up) {
            this.move(Direction.NORTH, moveSpeed);
        }

        if (inputManager.down) {
            this.move(Direction.SOUTH, moveSpeed);
        }

        if (inputManager.left) {
            this.move(Direction.WEST, moveSpeed);
        }

        if (inputManager.right) {
            this.move(Direction.EAST, moveSpeed);
        }
    }


}
