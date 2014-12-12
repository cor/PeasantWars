import java.awt.*;

/**
 *
 * Created by cor on 12-12-14.
 */
public class Scene {

    private Dimension resolution;
    private Dimension tileSize; // a tenth of the resolution since the level is 10*10 tiles

    public int[][] map = new int[10][10]; // a 2D array containing the level data

    public Scene() {
        this.resolution = new Dimension(600, 600);
        // set the tile size to 1/10th of the resolution
        this.tileSize = new Dimension(this.resolution.width / 10, this.resolution.height / 10);


        map[2][4] = 1; // example data
    }

    public Scene(Dimension resolution) {
        this.resolution = resolution;
        this.tileSize = new Dimension(this.resolution.width / 10, this.resolution.height / 10);
        map[2][4] = 1;
    }

    public void draw(Graphics g) {

        // iterate over vertical rows
        for (int x = 0; x < 10; x++) {

            //iterate through vertical row
            for (int y = 0; y < 10; y++) {

                // check the integer at the position and set the color accordingly
                if (map[x][y] == 0) {
                    g.setColor(Color.blue);
                } else if (map[x][y] == 1) {
                    g.setColor(Color.red);
                }

                // draw the rectangle at the correct position
                g.fillRect(x * tileSize.width, y * tileSize.height, tileSize.width, tileSize.height);
            }
        }

    }



}
