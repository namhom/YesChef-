    package yeschef;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class maingame extends JFrame implements ActionListener{

    Selectstage select = new Selectstage();
    Startgame enterGame = new Startgame();
    Stage1 enterStage1 = new Stage1();
    Stage2 enterStage2 = new Stage2();
    Stage3 enterStage3 = new Stage3();
    
    
    public maingame(){
        this.setSize(1200,700);
        this.add(enterGame);
        enterGame.requestFocusInWindow();
        enterGame.StartButton.addActionListener(this);
        select.BackButton.addActionListener(this);
        select.EasyButton.addActionListener(this);
        select.MedButton.addActionListener(this);
        select.HardButton.addActionListener(this);
        enterStage1.BackButton.addActionListener(this);
        enterStage2.BackButton.addActionListener(this);
        enterStage3.BackButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==enterGame.StartButton){
            this.setLocationRelativeTo(null);
            this.remove(enterGame);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(select);
            select.requestFocusInWindow();
        }
        else if(e.getSource() == select.EasyButton){
            this.setLocationRelativeTo(null);
            this.remove(select);
            this.setSize(1200,700);
            this.setTitle("Stage1");
            this.add(enterStage1);
            enterStage1.requestFocusInWindow();
            enterStage1.cos = 1;
            enterStage1.times = 50;
        }
        else if(e.getSource() == select.MedButton){
            this.setLocationRelativeTo(null);
            this.remove(select);
            this.setSize(1200,700);
            this.setTitle("Stage2");
            this.add(enterStage2);
            enterStage2.requestFocusInWindow();
            enterStage2.cos = 1;
            enterStage2.times = 40;
        }
        else if(e.getSource() == select.HardButton){
            this.setLocationRelativeTo(null);
            this.remove(select);
            this.setSize(1200,700);
            this.setTitle("Stage3");
            this.add(enterStage3);
            enterStage3.requestFocusInWindow();
            enterStage3.cos = 1;
            enterStage3.times = 30;
        }
        else if(e.getSource() == select.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(select);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(this.enterGame);
            this.requestFocusInWindow();
        }
        else if(e.getSource() == enterStage1.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(enterStage1);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(select);
            select.requestFocusInWindow();
            enterStage1.times = 0;
            enterStage1.score=0;
  
        }
        else if(e.getSource() == enterStage2.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(enterStage2);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(select);
            select.requestFocusInWindow();
            enterStage2.times = 0;
            enterStage2.score=0;
        }
        else if(e.getSource() == enterStage3.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(enterStage3);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(select);
            select.requestFocusInWindow();
            enterStage3.times = 0;
            enterStage3.score=0;
        }
        this.validate();
        this.repaint();
    }
    
    public static void main(String[] args){
        JFrame gui = new maingame();
        gui.setSize(1200,700);
        gui.setVisible(true);
        gui.setTitle("YesChef!");
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
    }

    
}
