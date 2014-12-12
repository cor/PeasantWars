import java.awt.EventQueue;
import javax.swing.*;


/**
 * The Application class is the entry point of the game
 */
public class Application extends JFrame {

    /**
     * The main Application initializer
     */
    public Application() {
        initUI();
    }

    /**
     * Initialize the UI
     */
    private void initUI() {

        // UI Initialization

        // Add a new instance of the Game to the Application's JFrame and configure it
        add(new Game());
        setSize(600, 600);
        setTitle("PCMasterRace");

        // Quit the program when the window is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // center the window on the screen
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }

        });
    }
}
