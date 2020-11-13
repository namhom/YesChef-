    package yeschef;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startgame extends JPanel{
    private ImageIcon wallpaper = new ImageIcon(this.getClass().getResource("background.png"));
    private ImageIcon starts = new ImageIcon(this.getClass().getResource("startb.png"));
    public JButton StartButton = new JButton(starts);
    
    
    public Startgame(){
        setLayout(null);
        StartButton.setBounds(140, 420, 450, 150);
        StartButton.setBorderPainted(false);
        StartButton.setBorder(null);
        StartButton.setOpaque(false);
        StartButton.setContentAreaFilled(false);
        add(StartButton);
        
    }
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(wallpaper.getImage(), 0, 0, 1200, 665, this);

    }
}
