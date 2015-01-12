import java.awt.*;

/**
 * Created by Leon on 12/13/14.
 */
public class Collisions {

    boolean TopCollision;
    boolean BottomCollision;
    boolean RightCollision;
    boolean LeftCollision;

    int x;
    int y;

    public Collisions(Player player) {
        TopCollision = checkCollision(player);
        BottomCollision = checkCollision(player);
        RightCollision = checkCollision(player);
        LeftCollision = checkCollision(player);
    }

    private boolean checkCollision(Player player) {
        x = player.position.x;
        y = player.position.y;

        return true;
    }
}
