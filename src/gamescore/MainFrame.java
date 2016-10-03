package gamescore;

import javax.swing.JFrame;

/**
 *
 * @author vanrooijen
 */
public class MainFrame extends JFrame {
    
    public MainFrame() {
        initMainFrame();
    }
    
    private void initMainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PanelMain());
        setBounds(300, 100, 230, 380);
        setVisible(true);
    }
}
