import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


/**
 * The Game class is the JPanel where the game takes place.
 */
public class Game extends JPanel {

    private Scene scene;

    public Game() {

        // set the size of the JPanel
        setPreferredSize(new Dimension(600, 600));

        scene = new Scene(new Dimension(600, 600));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        scene.draw(g);
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

