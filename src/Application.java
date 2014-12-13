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

    private Game game;
    private void initUI() {

        // UI Initialization

        // Add a new instance of the Game to the Application's JFrame and configure it
        game = new Game();
        add(game);
        setTitle("PCMasterRace");

        // Quit the program when the window is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // center the window on the screen
        setLocationRelativeTo(null);

        // disable window resizing
        setResizable(false);

        addKeyListener(game.inputManager);

        // set the JFrame to the correct size (specified by the Game JPanel)
        pack();
    }

    public static void main(String[] args) {

        // create an instance of the application and make it visible
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
                ex.requestFocus();
                ex.setLocationRelativeTo(null);
            }

        });
    }

}
