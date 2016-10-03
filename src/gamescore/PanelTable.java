package gamescore;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vanrooijen
 */
public class PanelTable extends JPanel {
    
    private ArrayList<Score> scores = new ArrayList<>();
    
    JTable table;
    DefaultTableModel model;
    Object rowData[] = new Object[2];
    
    public PanelTable() {
        initPanelTable();
    }
    
    private void initPanelTable() {
        setBounds(20, 20, 180, 200);
        
        FillScores fillScores = new FillScores();
        scores = fillScores.getData();
        
        setBackground(Color.LIGHT_GRAY);
        
        Vector<String> columnNames = new Vector<>();
        columnNames.addElement("User");
        columnNames.addElement("Score");
        
        table = new JTable();
        table.setBackground(Color.red);

        model = (DefaultTableModel) table.getModel();
        model.addColumn(columnNames.get(0));
        model.addColumn(columnNames.get(1));

        drawTable();

        add(table);
    }
    
    public void drawTable() {
        model.setRowCount(0);
        for(int i = 0; i < scores.size(); i++) {
            rowData[0] = scores.get(i).user.getName();
            rowData[1] = scores.get(i).score;
            
            model.addRow(rowData);
        }
        table.setModel(model);
    }
    
    public void addScore(String user, int score) {
        Score newScore = new Score(new User(user), score);
        scores.add(newScore);
        
        //System.out.println(scores.size());
        
        drawTable();
    }
}
