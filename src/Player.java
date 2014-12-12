import java.awt.*;

/**
 * Player class
 */
public class Player {

    public Dimension size;
    public Point position;

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


    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(position.x, position.y, size.width, size.height);
    }

}
