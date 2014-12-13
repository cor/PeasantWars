import java.awt.*;

/**
 * Player class
 */
public class Player {

    public Dimension size;
    public Point position;

    /**
     * The default initializer
     */
    public Player() {
        position = new Point(200, 200);
        size = new Dimension(60, 60);
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

        g2d.setColor(new Color(75, 207, 60));
        g2d.fillOval(position.x, position.y, size.width, size.height);
        g2d.setColor(Color.black);
        g2d.drawOval(position.x, position.y, size.width, size.height);
    }

    /**
     * Update the player
     * @param inputManager the game's input manager
     */
    public void update(InputManager inputManager) {

        // move the player
        if (inputManager.up) {
            this.move(Direction.NORTH, 1);
        }

        if (inputManager.down) {
            this.move(Direction.SOUTH, 1);
        }

        if (inputManager.left) {
            this.move(Direction.WEST, 1);
        }

        if (inputManager.right) {
            this.move(Direction.EAST, 1);
        }
    }


}
