
package yeschef;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stage3 extends JPanel implements ActionListener{
    
    k1 k = new k1();

    private final ImageIcon wallpaper = new ImageIcon(this.getClass().getResource("Stage3.png"));
    private final ImageIcon Backb = new ImageIcon(this.getClass().getResource("back.png"));
    private final ImageIcon Pancakeb = new ImageIcon(this.getClass().getResource("pancake.png"));
    private final ImageIcon Drinkb = new ImageIcon(this.getClass().getResource("drink3.png"));
    private final ImageIcon M1b = new ImageIcon(this.getClass().getResource("cho.png"));
    private final ImageIcon M2b = new ImageIcon(this.getClass().getResource("s1.png"));
    private final ImageIcon b = new ImageIcon(this.getClass().getResource("p.png"));
    private final ImageIcon b1 = new ImageIcon(this.getClass().getResource("p1.png"));
    private final ImageIcon dorange = new ImageIcon(this.getClass().getResource("green.png"));
    private final ImageIcon pm1 = new ImageIcon(this.getClass().getResource("pm1.png"));
    private final ImageIcon pm2 = new ImageIcon(this.getClass().getResource("pm2.png"));
    private final ImageIcon end = new ImageIcon(this.getClass().getResource("night.jpg"));
    private final ImageIcon ow = new ImageIcon(this.getClass().getResource("op2.png"));
    private final ImageIcon os = new ImageIcon(this.getClass().getResource("op1.png"));
    private final ImageIcon od = new ImageIcon(this.getClass().getResource("od3.png"));
    private final ImageIcon oo = new ImageIcon(this.getClass().getResource("o3.png"));
    
    JButton BackButton = new JButton(Backb);
    JButton PancakeButton = new JButton(Pancakeb);
    JButton DrinkButton = new JButton(Drinkb);
    
    JButton M1Button = new JButton(M1b);
    JButton M2Button = new JButton(M2b);
    
    JButton d1Button = new JButton(b);
    JButton d2Button = new JButton(b);
    JButton d3Button = new JButton(b);
    JButton d4Button = new JButton(b);
    
    JButton o1Button = new JButton(dorange);
    JButton o2Button = new JButton(dorange);
    JButton o3Button = new JButton(dorange);
    
    JButton bd1Button = new JButton(b1);
    JButton bd2Button = new JButton(b1);
    JButton bd3Button = new JButton(b1);
    JButton bd4Button = new JButton(b1);
    
    JButton p11 = new JButton(pm1);
    JButton p12 = new JButton(pm1);
    JButton p13 = new JButton(pm1);
    JButton p14 = new JButton(pm1);
    
    JButton p21 = new JButton(pm2);
    JButton p22 = new JButton(pm2);
    JButton p23 = new JButton(pm2);
    JButton p24 = new JButton(pm2);
    
    int  times;
    int score;
    int cos;
    int randomc = (int)(Math.random() * (2 - 0 + 0) + 0);
    
    
   
    boolean om1 = false;
    boolean om2 = false;
    boolean odd = false;
    boolean o = false;
        
    boolean dm1 = false;
    boolean dm2 = false;
    boolean ddc = false;
    boolean dd = false;

    boolean checkdrink1 =false;
    boolean checkdrink2 =false;
    boolean checkdrink3 =false;
    
    boolean cookdone1 =false;
    boolean cookdone2 =false;
    boolean cookdone3 =false;
    boolean cookdone4 =false;
    
    boolean checkpan1 = false;
    boolean checkpan2 = false;
    boolean checkpan3 = false;
    boolean checkpan4 = false;
    
    boolean checkm11 = false;
    boolean checkm12 = false;
    boolean checkm13 = false;
    boolean checkm14 = false;
    
    boolean checkm21 = false;
    boolean checkm22 = false;
    boolean checkm23 = false;
    boolean checkm24 = false;
    
    boolean checkm1 = false;
    boolean checkm2 = false;
    boolean checkm3 = false;
    boolean checkm4 = false;
    
    int checkperson = 0;
    
    int timepan=5;
    int checktimepan1 = timepan;
    int checktimepan2 = timepan;
    int checktimepan3 = timepan;
    int checktimepan4 = timepan;
    
   int timebonus = 10;
    boolean checkbonus = false;
    boolean pass = false;
    
    
    Thread timecount = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    times--;
                    
                    if(checkpan1==true && checktimepan1 > 0){
                        checktimepan1--;
                    }
                    
                    if(checkpan2==true && checktimepan2 > 0){
                        checktimepan2--;
                    }
                    
                    if(checkpan3==true && checktimepan3 > 0){
                        checktimepan3--;
                    }
                    
                    if(checkpan4==true && checktimepan4 > 0){
                        checktimepan4--;
                    }
                     if(timebonus>0){
                        timebonus--;
                        checkbonus=true;
                    }
                    else{
                        checkbonus=false;
                    }
                    
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                }
                repaint();
                     
            }
        }
    });
    
    public Stage3() {

        setLayout(null);
        BackButton.setBounds(10, 10, 50, 50);
        BackButton.setBorderPainted(false);
        BackButton.setBorder(null);
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false);
        add(BackButton);
        
        setLayout(null);
        PancakeButton.setBounds(10, 490, 295, 167);
        PancakeButton.setBorderPainted(false);
        PancakeButton.setBorder(null);
        PancakeButton.setOpaque(false);
        PancakeButton.setContentAreaFilled(false);
        add(PancakeButton);
        PancakeButton.addActionListener(this);
        
        setLayout(null);
        DrinkButton.setBounds(930, 443, 212, 226);
        DrinkButton.setBorderPainted(false);
        DrinkButton.setBorder(null);
        DrinkButton.setOpaque(false);
        DrinkButton.setContentAreaFilled(false);
        add(DrinkButton);
        DrinkButton.addActionListener(this);
        
        setLayout(null);
        M1Button.setBounds(350, 490, 226, 168);
        M1Button.setBorderPainted(false);
        M1Button.setBorder(null);
        M1Button.setOpaque(false);
        M1Button.setContentAreaFilled(false);
        add(M1Button);
        M1Button.addActionListener(this);
        
        setLayout(null);
        M2Button.setBounds(640, 490, 226, 168);
        M2Button.setBorderPainted(false);
        M2Button.setBorder(null);
        M2Button.setOpaque(false);
        M2Button.setContentAreaFilled(false);
        add(M2Button);
        M2Button.addActionListener(this);
        
        timecount.start();
        
        
   
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(wallpaper.getImage(), 0, 0, 1200, 665, this);
 
        g.setColor(Color.WHITE);
       g.fillRect(970, 0, 1200, 110);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Time : "+times,1040,35);
        
        
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Score : "+score,1040,70);
        
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tohama",Font.BOLD,25));
        g.drawString("Bonus runout: "+timebonus,980,95);
        
        g.setColor(Color.WHITE);
        g.setFont(new Font("Tohama",Font.BOLD,10));
        g.drawString(""+checktimepan1, 175, 350);
        g.drawString(""+checktimepan2, 325, 350);
        g.drawString(""+checktimepan3, 220, 280);
        g.drawString(""+checktimepan4, 375, 280);
        
        if(cos > 0){
            randomc = (int)(Math.random() * (6  - 0 + 0) + 0);
            System.out.println(randomc);
            if(randomc == 0) {
                checkperson = 1;
            }
            else if(randomc == 1) {
                checkperson = 2;              
            }
            else if(randomc == 2) {
                checkperson = 3;
            }
            else if(randomc == 3) {
                checkperson = 4;
            }
            else if(randomc == 5) {
                checkperson = 6;
            }
           
            cos = 0;   
        }
        
        if(checkperson == 1){
            g.drawImage(ow.getImage(),650,35,90,70,this);
            g.drawImage(k.im[0].getImage(),500,35,200,200,this);
            om2=true;           
        }
        else if(checkperson == 2){
            g.drawImage(os.getImage(),450,35,90,70,this);
            g.drawImage(k.im[1].getImage(),500,35,200,200,this);
            om1=true;     
        }
        else if(checkperson == 3){
            g.drawImage(od.getImage(),650,35,90,120,this);
            g.drawImage(k.im[2].getImage(),500,35,200,200,this);
            odd=true; 
        }
        else if(checkperson == 4){
            g.drawImage(oo.getImage(),450,35,90,70,this);
            g.drawImage(k.im[3].getImage(),500,35,200,200,this);
            o=true; 
        }
        else if(checkperson == 5){
            g.drawImage(oo.getImage(),450,35,90,70,this);
            g.drawImage(k.im[4].getImage(),500,35,200,200,this);
            om1=true; 
        }
        else if(checkperson == 6){
            g.drawImage(oo.getImage(),450,35,90,70,this);
            g.drawImage(k.im[5].getImage(),500,35,200,200,this);
            o=true; 
        }
        
        if(odd==true){
            if(ddc==true){
                score+=10;
                timebonus=10;
                cos=1;  
                ddc=false;
                odd=false;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50);
            }
            else if(dm2==true){
                dm2=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dm1==true){
                dm1=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dd==true){
                dd=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
        }
       
        if(om2==true){
            if(dm2==true){
                score+=10;
                cos=1; 
                dm2=false;
                om2=false;
                timebonus=10;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50); 
            }
           else if(ddc==true){
                ddc=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dm1==true){
                dm1=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dd==true){
                dd=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }           
        }
        
        if(om1==true){
            if(dm1==true){
                score+=10;
                cos=1;
                dm1=false;
                om1=false;
                timebonus=10;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50);
            }
            else if(ddc==true){
                ddc=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dm2==true){
                dm2=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dd==true){
                dd=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }           
        }
        
         if(o==true){
             if(dd==true){
                score+=10;
                cos=1;
                o=false;
                dd=false;
                timebonus=10;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50);
             }
            else if(dm2==true){
                dm2=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dm1==true){
                dm1=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(ddc==true){
                ddc=false;
                timebonus=0;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
        }
           if(pass==true&&checkbonus==true){
            score+=10;           
            g.setColor(Color.PINK);
            g.setFont(new Font("Tohama",Font.BOLD,25));
            g.drawString("Bonus++", 800, 100);
            pass=false;
            checkbonus=false;
         }
         
         
        if(times <= 0){
            g.drawImage(end.getImage(), 0, 0, 1200, 665, this);
            
            g.setColor(Color.WHITE);
            g.fillRect(400, 440, 400, 90);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Tohama",Font.BOLD,50));
            g.drawString("Score : "+score,490,500);
            timecount.stop();
            this.removeAll();
        }
        
        
    } 

    public void actionPerformed(ActionEvent e) {
        ///////////put pancake on pan//////////////
        if(times > 0){
            if(e.getSource() == this.PancakeButton){
                if(checkpan1==false){
                    setLayout(null);
                    d1Button.setBounds(40, 300, 136, 86);
                    d1Button.setBorderPainted(false);
                    d1Button.setBorder(null);
                    d1Button.setOpaque(false);
                    d1Button.setContentAreaFilled(false);
                    add(d1Button);
                    d1Button.addActionListener(this);
                    checkpan1=true;
                }
                else if(checkpan2==false){
                    setLayout(null);
                    d2Button.setBounds(190, 300, 136, 86);
                    d2Button.setBorderPainted(false);
                    d2Button.setBorder(null);
                    d2Button.setOpaque(false);
                    d2Button.setContentAreaFilled(false);
                    add(d2Button);
                    d2Button.addActionListener(this);
                    checkpan2=true;
                }
                else if(checkpan3==false){
                    setLayout(null);
                    d3Button.setBounds(90, 240, 136, 86);
                    d3Button.setBorderPainted(false);
                    d3Button.setBorder(null);
                    d3Button.setOpaque(false);
                    d3Button.setContentAreaFilled(false);
                    add(d3Button);
                    d3Button.addActionListener(this);
                    checkpan3=true;
                }
                else if(checkpan4==false){
                    setLayout(null);
                    d4Button.setBounds(230, 240, 136, 86);
                    d4Button.setBorderPainted(false);
                    d4Button.setBorder(null);
                    d4Button.setOpaque(false);
                    d4Button.setContentAreaFilled(false);
                    add(d4Button);
                    d4Button.addActionListener(this);
                    checkpan4=true;
                }
            }
           ///////////////////////////////////////////////////////////////
           ////////////////cookdone //////////////////////
            else if(e.getSource() == this.d1Button){
                if(checktimepan1<=0&&checkm1==false&&checkm11==false&&checkm21==false){
                    remove(d1Button);
                    setLayout(null);
                    bd1Button.setBounds(430, 310, 152, 106);
                    bd1Button.setBorderPainted(false);
                    bd1Button.setBorder(null);
                    bd1Button.setOpaque(false);
                    bd1Button.setContentAreaFilled(false);
                    add(bd1Button);
                    bd1Button.addActionListener(this);
                    checkpan1=false;
                    cookdone1=true; 
                    checkm1=true;
                    checktimepan1=timepan;
                }
                
            }
            else if(e.getSource() == this.d2Button){
                if(checktimepan2<=0&&checkm2==false&&checkm12==false&&checkm22==false){
                    remove(d2Button);
                    setLayout(null);
                    bd2Button.setBounds(630, 310, 152, 106);
                    bd2Button.setBorderPainted(false);
                    bd2Button.setBorder(null);
                    bd2Button.setOpaque(false);
                    bd2Button.setContentAreaFilled(false);
                    add(bd2Button);
                    bd2Button.addActionListener(this);                   
                    checkpan2=false;
                    cookdone2=true;
                    checkm2=true;
                    checktimepan2=timepan;
                }   
            }
            else if(e.getSource() == this.d3Button){
                if(checktimepan3<=0&&checkm3==false&&checkm13==false&&checkm23==false){
                    remove(d3Button); 
                    setLayout(null);
                    bd3Button.setBounds(450, 220, 152, 106);
                    bd3Button.setBorderPainted(false);
                    bd3Button.setBorder(null);
                    bd3Button.setOpaque(false);
                    bd3Button.setContentAreaFilled(false);
                    add(bd3Button);
                    bd3Button.addActionListener(this);
                    checkpan3=false;
                    cookdone3=true;
                    checkm3=true;
                    checktimepan3=timepan;
                }
                
            }
            else if(e.getSource() == this.d4Button){
                if(checktimepan4<=0&&checkm4==false&&checkm14==false&&checkm24==false){
                    remove(d4Button); 
                    setLayout(null);
                    bd4Button.setBounds(610, 220, 152, 106);
                    bd4Button.setBorderPainted(false);
                    bd4Button.setBorder(null);
                    bd4Button.setOpaque(false);
                    bd4Button.setContentAreaFilled(false);
                    add(bd4Button);
                    bd4Button.addActionListener(this);
                    checkpan4=false;
                    cookdone4=true;
                    checkm4=true;
                    checktimepan4=timepan;
                }
                
            }
            //////////////////////////////////////
            ////////////////Menu cho //////////////////////
            else if(e.getSource() == this.M1Button){

                if(cookdone1 ==true){
                    remove(bd1Button); 
                    setLayout(null);
                    p11.setBounds(420, 290, 177, 146);
                    p11.setBorderPainted(false);
                    p11.setBorder(null);
                    p11.setOpaque(false);
                    p11.setContentAreaFilled(false);
                    add(p11);
                    p11.addActionListener(this);
                    cookdone1 = false;
                    checkm11=true;
                }
                else if(cookdone2 ==true){
                    remove(bd2Button);
                    setLayout(null);
                    p12.setBounds(610, 290, 177, 146);
                    p12.setBorderPainted(false);
                    p12.setBorder(null);
                    p12.setOpaque(false);
                    p12.setContentAreaFilled(false);
                    add(p12);
                    p12.addActionListener(this);
                    checkm12=true;
                    cookdone2 = false;
                }
                else if(cookdone3 ==true){
                    remove(bd3Button); 
                    setLayout(null);
                    p13.setBounds(392, 200, 177, 146);
                    p13.setBorderPainted(false);
                    p13.setBorder(null);
                    p13.setOpaque(false);
                    p13.setContentAreaFilled(false);
                    add(p13);
                    p13.addActionListener(this);
                    checkm13=true;
                    cookdone3 = false;
                }
                else if(cookdone4 ==true){
                    remove(bd4Button); 
                    setLayout(null);
                    p14.setBounds(600, 200, 177, 146);
                    p14.setBorderPainted(false);
                    p14.setBorder(null);
                    p14.setOpaque(false);
                    p14.setContentAreaFilled(false);
                    add(p14);
                    p14.addActionListener(this);
                    checkm14=true;
                    cookdone4 = false;
                }    
            }
            ///////////////////////////////////////////////
            /////////////put sw //////////////////////
            else if(e.getSource() == this.M2Button){

                if(cookdone1 ==true){
                    remove(bd1Button); 
                    setLayout(null);
                    p21.setBounds(370, 290, 177, 146);
                    p21.setBorderPainted(false);
                    p21.setBorder(null);
                    p21.setOpaque(false);
                    p21.setContentAreaFilled(false);
                    add(p21);
                    p21.addActionListener(this);
                    checkm21=true;
                    cookdone1 = false;
                }
                else if(cookdone2 ==true){
                    remove(bd2Button);
                    setLayout(null);
                    p22.setBounds(610, 290, 177, 146);
                    p22.setBorderPainted(false);
                    p22.setBorder(null);
                    p22.setOpaque(false);
                    p22.setContentAreaFilled(false);
                    add(p22);
                    p22.addActionListener(this);
                    checkm22=true;
                    cookdone2 = false;
                }
                else if(cookdone3 ==true){
                    remove(bd3Button); 
                    setLayout(null);
                    p23.setBounds(392, 220, 177, 146);
                    p23.setBorderPainted(false);
                    p23.setBorder(null);
                    p23.setOpaque(false);
                    p23.setContentAreaFilled(false);
                    add(p23);
                    p23.addActionListener(this);
                    checkm23=true;
                    cookdone3 = false;
                }
                else if(cookdone4 ==true){
                    remove(bd4Button); 
                    setLayout(null);
                    p24.setBounds(600, 220, 177, 146);
                    p24.setBorderPainted(false);
                    p24.setBorder(null);
                    p24.setOpaque(false);
                    p24.setContentAreaFilled(false);
                    add(p24);
                    p24.addActionListener(this);
                    cookdone4 = false;
                    checkm24=true;
                }    
            }
            //////
            else if(e.getSource() == this.DrinkButton){
                if(checkdrink1 ==false){
                    setLayout(null);
                    o1Button.setBounds(1050, 200, 112, 194);
                    o1Button.setBorderPainted(false);
                    o1Button.setBorder(null);
                    o1Button.setOpaque(false);
                    o1Button.setContentAreaFilled(false);
                    add(o1Button);
                    o1Button.addActionListener(this);        
                    checkdrink1 =true;
                }
                else if(checkdrink2 ==false){
                    setLayout(null);
                    o2Button.setBounds(950, 170, 112, 194);
                    o2Button.setBorderPainted(false);
                    o2Button.setBorder(null);
                    o2Button.setOpaque(false);
                    o2Button.setContentAreaFilled(false);
                    add(o2Button);
                    o2Button.addActionListener(this);
                    
                    checkdrink2=true;
                }
                else if(checkdrink3 ==false){
                    setLayout(null);
                    o3Button.setBounds(850, 150, 112, 194);
                    o3Button.setBorderPainted(false);
                    o3Button.setBorder(null);
                    o3Button.setOpaque(false);
                    o3Button.setContentAreaFilled(false);
                    add(o3Button);
                    o3Button.addActionListener(this);
                    checkdrink3=true;
                }
            }
            else if(e.getSource() == this.bd1Button){
                remove(bd1Button);
                checkm1=false;
                dd=true;
                cookdone1=false;
            }
            else if(e.getSource() == this.bd2Button){
                remove(bd2Button);
                dd=true;
                checkm2=false;
                cookdone2=false;
            }
            else if(e.getSource() == this.bd3Button){
                remove(bd3Button);
                dd=true;
                checkm3=false;
                cookdone3=false;
            }
            else if(e.getSource() == this.bd4Button){
                remove(bd4Button);
                dd=true;
                checkm4=false;
                cookdone4=false;
            }
            else if(e.getSource() == this.p11){
                remove(p11);
                dm1=true;
                checkm1=false;
                checkm11=false;
                
            }
            else if(e.getSource() == this.p12){
                remove(p12);
                dm1=true;
                checkm2=false;
                checkm12=false;
            }
            else if(e.getSource() == this.p13){
                remove(p13);
                dm1=true;
                checkm3=false;
                checkm13=false;
            }
            else if(e.getSource() == this.p14){
                remove(p14);
                dm1=true;
                checkm4=false;
                checkm14=false;
            }
            else if(e.getSource() == this.p21){
                remove(p21);
                dm2=true;
                checkm1=false;
                checkm21=false;
            }
            else if(e.getSource() == this.p22){
                remove(p22);
                dm2=true;
                checkm2=false;
                checkm22=false;
            }
            else if(e.getSource() == this.p23){
                remove(p23);
                dm2=true;
                checkm3=false;
                checkm23=false;
            }
            else if(e.getSource() == this.p24){
                remove(p24);
                dm2=true;
                checkm4=false;
                checkm24=false;
            }
            else if(e.getSource() == this.o1Button){
                remove(o1Button);
                ddc=true;
                checkdrink1=false;
                
            }
            else if(e.getSource() == this.o2Button){
                remove(o2Button);
                ddc=true;
                checkdrink2=false;
            }
            else if(e.getSource() == this.o3Button){
                remove(o3Button);
                ddc=true;
                checkdrink3=false;
            }          
        }
        this.repaint();     
    }   
}