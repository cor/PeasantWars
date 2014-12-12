import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;


/**
 * The Game class is the JPanel where the game takes place.
 */
public class Game extends JPanel {


    public Game() {

        // set the size of the JPanel
        setPreferredSize(new Dimension(600, 600));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawStuff(g);
    }

    private void drawStuff(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;


        // experiment with drawing stuff
        for (int i = 0; i < 10; i++) {

            g2d.drawLine(0, i * 60, 600, i * 60);
        }

    }

}

