import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
        setTitle("PCMasterRace");

        // Quit the program when the window is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // center the window on the screen
        setLocationRelativeTo(null);

        // disable window resizing
        setResizable(false);

        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);

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

    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
    }
}
