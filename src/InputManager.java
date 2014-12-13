
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cor on 13-12-14.
 */
public class InputManager implements KeyListener {

    // booleans containing key data
    public boolean up = false;
    public boolean down = false;
    public boolean right = false;
    public boolean left = false;


    // it's required to override keyTyped because we're implementing KeyListener
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        //update key data
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) { up = true; }
        if (key == KeyEvent.VK_DOWN) { down = true; }
        if (key == KeyEvent.VK_RIGHT) { right = true; }
        if (key == KeyEvent.VK_LEFT) { left = true; }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        //update key data
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) { up = false; }
        if (key == KeyEvent.VK_DOWN) { down = false; }
        if (key == KeyEvent.VK_RIGHT) { right = false; }
        if (key == KeyEvent.VK_LEFT) { left = false; }
    }
}
