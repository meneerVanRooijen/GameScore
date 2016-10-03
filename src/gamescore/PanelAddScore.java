package gamescore;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author vanrooijen
 */
public class PanelAddScore extends JPanel {
 
    JTextField tfPlayer = new JTextField();
    JTextField tfScore = new JTextField();
    
    PanelTable panelTable;
    
    public PanelAddScore(PanelTable pnlTable) {
        panelTable = pnlTable;
        initPanelAddScore();
    }
    
    private void initPanelAddScore() {
        setLayout(null);
        setBackground(Color.GRAY);
        setBounds(20, 225, 180, 100);
        
        JLabel labelPlayer = new JLabel("Speler");
        JLabel labelScore = new JLabel("Score");

        JButton buttonAdd = new JButton("Toevoegen score");
        
        labelPlayer.setBounds(10, 10, 50, 20);
        labelScore.setBounds(10, 30, 50, 20);
        tfPlayer.setBounds(50, 10, 120, 20);
        tfScore.setBounds(50, 30, 120, 20);
        buttonAdd.setBounds(10, 60, 160, 30);
        
        buttonAdd.addActionListener(new ButtonAddHAndler());
        
        add(labelPlayer);
        add(labelScore);
        add(tfPlayer);
        add(tfScore);
        add(buttonAdd);
    }
    
    class ButtonAddHAndler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           String player = tfPlayer.getText();
           int score = Integer.valueOf(tfScore.getText());
           
           panelTable.addScore(player, score);
           
//           System.out.println(player);
//           System.out.println(score);
        }
    } 
}