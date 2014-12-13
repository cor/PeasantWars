import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


/**
 * The Game class is the JPanel where the game takes place.
 */
public class Game extends JPanel {

    private Scene scene;
    private Player player;

    public Game() {

        // set the size of the JPanel
        setPreferredSize(new Dimension(600, 600));

        // configure game objects
        scene = new Scene(new Dimension(600, 600));
        player = new Player();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //enable antialiassing
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        scene.draw(g2d);
        player.draw(g2d);
    }

    private void drawStuff(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.fillRect(50, 50, 100, 100);


        // experiment with drawing stuff
        for (int i = 0; i < 10; i++) {

            g2d.drawLine(0, i * 60, 600, i * 60);
        }
    }
}

