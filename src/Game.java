import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


/**
 * The Game class is the JPanel where the game takes place.
 */
public class Game extends JPanel {

    // game objects
    private Scene scene;
    private Player player;

    // animation
    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 16;

    // input
    public InputManager inputManager = new InputManager();

    // JPanel
    private Dimension size = new Dimension(540,540);



    public Game() {
        initGame();
    }


    private void initGame() {
        // set the size of the JPanel
        setPreferredSize(size);

        // configure game objects
        scene = new Scene(size);
        player = new Player();

        //configure timer for animation
        timer = new Timer();
        timer.scheduleAtFixedRate(new Tick(), INITIAL_DELAY, PERIOD_INTERVAL);


        // configure input
        addKeyListener(inputManager);

    }

    private void update() {
        player.update(inputManager);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //enable anti-aliasing
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        scene.draw(g2d);
        player.draw(g2d);
    }

    private class Tick extends TimerTask {

        // main game loop, gets called approximately 60 times per second
        @Override
        public void run() {
            update();
            repaint();
        }
    }

}

