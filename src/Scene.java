import javax.swing.*;
import java.awt.*;

/**
 *
 * Created by cor on 12-12-14.
 */
public class Scene {

    private Dimension resolution;
    private Dimension tileSize; // a tenth of the resolution since the level is 10*10 tiles

    public static int[][] map = new int[10][10]; // a 2D array containing the level data

    public Scene() {
        this.resolution = new Dimension(600, 600);
        // set the tile size to 1/10th of the resolution
        this.tileSize = new Dimension(this.resolution.width / 10, this.resolution.height / 10);


        map[2][4] = 1; // example data

    }

    public Scene(Dimension resolution) {
        this.resolution = resolution;
        this.tileSize = new Dimension(this.resolution.width / 10, this.resolution.height / 10);

        for (int i = 1; i < 9; i += 2){

            for (int j = 1; j < 9; j += 2){
                map[i][j] = 1;
            }
        }

        map[2][5] = 2;
    }

    public void draw(Graphics2D g2d) {

        // iterate over vertical rows
        for (int x = 0; x < 10; x++) {

            //iterate through vertical row
            for (int y = 0; y < 10; y++) {

                // check the integer at the position and set the color accordingly
                if (map[x][y] == 0) {
                    g2d.setColor(new Color(122, 83, 43));
                    g2d.fillRect(x * tileSize.width, y * tileSize.height, tileSize.width, tileSize.height);
                } else if (map[x][y] == 1) {
                    g2d.setColor(new Color(0, 0, 0));
                    g2d.fillRect(x * tileSize.width, y * tileSize.height, tileSize.width, tileSize.height);
                } else if (map[x][y] == 2) {
                    g2d.setColor(new Color(122, 83, 43));
                    g2d.fillRect(x * tileSize.width, y * tileSize.height, tileSize.width, tileSize.height);
                    Image Peasant = new ImageIcon("images/Peasant.png").getImage();
                    g2d.drawImage(Peasant, tileSize.width * x, y * tileSize.height, 60, 60, null);
                }
            }
        }

    }
}
