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


    public void draw(Graphics2D g2d) {

        g2d.setColor(new Color(75, 207, 60));
        g2d.fillOval(position.x, position.y, size.width, size.height);
        g2d.setColor(Color.black);
        g2d.drawOval(position.x, position.y, size.width, size.height);
    }

}
