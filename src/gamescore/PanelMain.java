package gamescore;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * Holding the Table and AddScore panel
 * @author vanrooijen
 */
public class PanelMain extends JPanel {
    
    PanelTable panelTable = new PanelTable();
    
    public PanelMain() {
        initPanelMain();
    }
 
    private void initPanelMain() {
        setLayout(null);
        setBackground(Color.WHITE);
        
        add(panelTable);
        add(new PanelAddScore(panelTable));
    }
}