
package yeschef;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.geom.Rectangle2D;

public class Selectstage extends JPanel {
    private ImageIcon wallpaper = new ImageIcon(this.getClass().getResource("Day.jpg"));
    private ImageIcon EasyB = new ImageIcon(this.getClass().getResource("easyb.png"));
    private ImageIcon MedB = new ImageIcon(this.getClass().getResource("mediumb.png"));
    private ImageIcon HardB = new ImageIcon(this.getClass().getResource("hardb.png"));
    private ImageIcon Backb = new ImageIcon(this.getClass().getResource("back.png"));
    
    public JButton BackButton = new JButton(Backb);
    public JButton EasyButton = new JButton(EasyB);
    public JButton MedButton = new JButton(MedB);
    public JButton HardButton = new JButton(HardB);
    
    

    Selectstage(){
        setLayout(null);
        EasyButton.setBounds(140, 420, 230, 122);
        EasyButton.setBorderPainted(false);
        EasyButton.setBorder(null);
        EasyButton.setOpaque(false);
        EasyButton.setContentAreaFilled(false);
        add(EasyButton);
        
        MedButton.setBounds(460, 420, 230, 122);
        MedButton.setBorderPainted(false);
        MedButton.setBorder(null);
        MedButton.setOpaque(false);
        MedButton.setContentAreaFilled(false);
        add(MedButton);
        
        HardButton.setBounds(840, 420, 234, 122);
        HardButton.setBorderPainted(false);
        HardButton.setBorder(null);
        HardButton.setOpaque(false);
        HardButton.setContentAreaFilled(false);
        add(HardButton);
        
        setLayout(null);
        BackButton.setBounds(10, 10, 50, 50);
        BackButton.setBorderPainted(false);
        BackButton.setBorder(null);
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false);
        add(BackButton);
    }
     
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(wallpaper.getImage(), 0, 0, 1200, 665, this);
    
    }
}
