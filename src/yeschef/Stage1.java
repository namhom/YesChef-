
package yeschef;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stage1 extends JPanel implements ActionListener{
    
    k1 k = new k1();

    private final ImageIcon wallpaper = new ImageIcon(this.getClass().getResource("Stage1.png"));
    private final ImageIcon Backb = new ImageIcon(this.getClass().getResource("back.png"));
    private final ImageIcon Donutb = new ImageIcon(this.getClass().getResource("donut.png"));
    private final ImageIcon Drinkb = new ImageIcon(this.getClass().getResource("drink.png"));
    private final ImageIcon S1b = new ImageIcon(this.getClass().getResource("s1.png"));
    private final ImageIcon S2b = new ImageIcon(this.getClass().getResource("s2.png"));
    private final ImageIcon d = new ImageIcon(this.getClass().getResource("d.png"));
    private final ImageIcon d1 = new ImageIcon(this.getClass().getResource("d1.png"));
    private final ImageIcon dred = new ImageIcon(this.getClass().getResource("red.png"));
    private final ImageIcon ds = new ImageIcon(this.getClass().getResource("ds.png"));
    private final ImageIcon dw = new ImageIcon(this.getClass().getResource("dw.png"));
    private final ImageIcon end = new ImageIcon(this.getClass().getResource("night.jpg"));
    private final ImageIcon ow = new ImageIcon(this.getClass().getResource("ow.png"));
    private final ImageIcon os = new ImageIcon(this.getClass().getResource("os.png"));
    private final ImageIcon od = new ImageIcon(this.getClass().getResource("od.png"));
    private final ImageIcon oo = new ImageIcon(this.getClass().getResource("o.png"));
    
    JButton BackButton = new JButton(Backb);
    JButton DonutButton = new JButton(Donutb);
    JButton DrinkButton = new JButton(Drinkb);
    /////Menu/////
    JButton M1Button = new JButton(S1b);
    JButton M2Button = new JButton(S2b);
    /////donut on pan/////
    JButton d1Button = new JButton(d);
    JButton d2Button = new JButton(d);
    JButton d3Button = new JButton(d);
    JButton d4Button = new JButton(d);
    /////drink/////
    JButton r1Button = new JButton(dred);
    JButton r2Button = new JButton(dred);
    JButton r3Button = new JButton(dred);
    ////donut done/////
    JButton dd1Button = new JButton(d1);
    JButton dd2Button = new JButton(d1);
    JButton dd3Button = new JButton(d1);
    JButton dd4Button = new JButton(d1);
    ////donut with M1////
    JButton ds1 = new JButton(ds);
    JButton ds2 = new JButton(ds);
    JButton ds3 = new JButton(ds);
    JButton ds4 = new JButton(ds);
    ////donut with M2////
    JButton dw1 = new JButton(dw);
    JButton dw2 = new JButton(dw);
    JButton dw3 = new JButton(dw);
    JButton dw4 = new JButton(dw);
    
    int times;
    int score;
    int cos;
    int randomc;
    
    
   ////check oder ////
    boolean oss = false; // donut sw
    boolean oww = false; //donut W
    boolean odd = false; //drink
    boolean o = false;     //donut
    ///check make
    boolean dsc = false;
    boolean dwc = false;
    boolean ddc = false;
    boolean dd = false; //donut
    /////check drink
    boolean checkdrink1 =false;
    boolean checkdrink2 =false;
    boolean checkdrink3 =false;
    ////check donutdone
    boolean cookdone1 =false;
    boolean cookdone2 =false;
    boolean cookdone3 =false;
    boolean cookdone4 =false;
    ////check pan
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
    
    int timebonus = 10;
    boolean checkbonus = false;
    boolean pass = false;
    
    int checkperson = 0;
    
    int timepan=3;
    int checktimepan1 = timepan;
    int checktimepan2 = timepan;
    int checktimepan3 = timepan;
    int checktimepan4 = timepan;
 
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
    
    public Stage1() {

        setLayout(null);
        BackButton.setBounds(10, 10, 50, 50);
        BackButton.setBorderPainted(false);
        BackButton.setBorder(null);
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false);
        add(BackButton);
        
        setLayout(null);
        DonutButton.setBounds(10, 490, 295, 167);
        DonutButton.setBorderPainted(false);
        DonutButton.setBorder(null);
        DonutButton.setOpaque(false);
        DonutButton.setContentAreaFilled(false);
        add(DonutButton);
        DonutButton.addActionListener(this);
        
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
            oww=true;           
        }
        else if(checkperson == 2){
            g.drawImage(os.getImage(),450,35,90,70,this);
            g.drawImage(k.im[1].getImage(),500,35,200,200,this);
            oss=true;     
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
            oss=true; 
        }
        else if(checkperson == 6){
            g.drawImage(oo.getImage(),450,35,90,70,this);
            g.drawImage(k.im[5].getImage(),500,35,200,200,this);
            o=true; 
        }
        
        if(odd==true){
            if(ddc==true){
                pass=true;
                timebonus=10;
                score+=10;
                cos=1;  
                ddc=false;
                odd=false;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50);
            }
            else if(dwc==true){
                timebonus=0;                
                dwc=false;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dsc==true){
                timebonus=0;   
                dsc=false;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dd==true){
                timebonus=0;   
                dd=false;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
        }
       
        if(oww==true){
            if(dwc==true){
                pass=true;
                score+=10;
                cos=1; 
                timebonus=10;
                dwc=false;
                oww=false;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50); 
            }
           else if(ddc==true){
               timebonus=0;   
                ddc=false;
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dsc==true){
                dsc=false;
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
        
        if(oss==true){
            if(dsc==true){
                pass=true;
                score+=10;
                cos=1;
                timebonus=10;
                dsc=false;
                oss=false;
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
            else if(dwc==true){
                dwc=false;
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
                pass=true;
                score+=10;
                cos=1;
                timebonus=10;
                o=false;
                dd=false;
                g.setColor(Color.GREEN);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Score++", 800, 50);
             }
            else if(dwc==true){
                dwc=false;
                timebonus=0;   
                g.setColor(Color.RED);
                g.setFont(new Font("Tohama",Font.BOLD,25));
                g.drawString("Wrong", 800, 50);  
            }
            else if(dsc==true){
                dsc=false;
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
        ///////////put donut on pan//////////////
        if(times > 0){
            if(e.getSource() == this.DonutButton){
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
                    dd1Button.setBounds(430, 310, 152, 106);
                    dd1Button.setBorderPainted(false);
                    dd1Button.setBorder(null);
                    dd1Button.setOpaque(false);
                    dd1Button.setContentAreaFilled(false);
                    add(dd1Button);
                    dd1Button.addActionListener(this);
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
                    dd2Button.setBounds(630, 310, 152, 106);
                    dd2Button.setBorderPainted(false);
                    dd2Button.setBorder(null);
                    dd2Button.setOpaque(false);
                    dd2Button.setContentAreaFilled(false);
                    add(dd2Button);
                    dd2Button.addActionListener(this);                   
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
                    dd3Button.setBounds(450, 220, 152, 106);
                    dd3Button.setBorderPainted(false);
                    dd3Button.setBorder(null);
                    dd3Button.setOpaque(false);
                    dd3Button.setContentAreaFilled(false);
                    add(dd3Button);
                    dd3Button.addActionListener(this);
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
                    dd4Button.setBounds(610, 220, 152, 106);
                    dd4Button.setBorderPainted(false);
                    dd4Button.setBorder(null);
                    dd4Button.setOpaque(false);
                    dd4Button.setContentAreaFilled(false);
                    add(dd4Button);
                    dd4Button.addActionListener(this);
                    checkpan4=false;
                    cookdone4=true;
                    checkm4=true;
                    checktimepan4=timepan;
                }
                
            }
            //////////////////////////////////////
            ////////////////put Strawberry //////////////////////
            else if(e.getSource() == this.M1Button){
                if(cookdone1 ==true){
                    remove(dd1Button); 
                    setLayout(null);
                    ds1.setBounds(430, 310, 152, 106);
                    ds1.setBorderPainted(false);
                    ds1.setBorder(null);
                    ds1.setOpaque(false);
                    ds1.setContentAreaFilled(false);
                    add(ds1);
                    ds1.addActionListener(this);
                    cookdone1 = false;
                    checkm11=true;
                }
                else if(cookdone2 ==true){
                    remove(dd2Button);
                    setLayout(null);
                    ds2.setBounds(630, 310, 152, 106);
                    ds2.setBorderPainted(false);
                    ds2.setBorder(null);
                    ds2.setOpaque(false);
                    ds2.setContentAreaFilled(false);
                    add(ds2);
                    ds2.addActionListener(this);
                    checkm12=true;
                    cookdone2 = false;
                }
                else if(cookdone3 ==true){
                    remove(dd3Button); 
                    setLayout(null);
                    ds3.setBounds(450, 220, 152, 106);
                    ds3.setBorderPainted(false);
                    ds3.setBorder(null);
                    ds3.setOpaque(false);
                    ds3.setContentAreaFilled(false);
                    add(ds3);
                    ds3.addActionListener(this);
                    checkm13=true;
                    cookdone3 = false;
                }
                else if(cookdone4 ==true){
                    remove(dd4Button); 
                    setLayout(null);
                    ds4.setBounds(610, 220, 152, 106);
                    ds4.setBorderPainted(false);
                    ds4.setBorder(null);
                    ds4.setOpaque(false);
                    ds4.setContentAreaFilled(false);
                    add(ds4);
                    ds4.addActionListener(this);
                    cookdone4 = false;
                    checkm14=true;
                }    
            }
            ///////////////////////////////////////////////
            /////////////put white //////////////////////
            else if(e.getSource() == this.M2Button){

                if(cookdone1 ==true){
                    remove(dd1Button); 
                    setLayout(null);
                    dw1.setBounds(430, 310, 152, 106);
                    dw1.setBorderPainted(false);
                    dw1.setBorder(null);
                    dw1.setOpaque(false);
                    dw1.setContentAreaFilled(false);
                    add(dw1);
                    dw1.addActionListener(this);
                    cookdone1 = false;
                    checkm21=true;
                }
                else if(cookdone2 ==true){
                    remove(dd2Button);
                    setLayout(null);
                    dw2.setBounds(630, 310, 152, 106);
                    dw2.setBorderPainted(false);
                    dw2.setBorder(null);
                    dw2.setOpaque(false);
                    dw2.setContentAreaFilled(false);
                    add(dw2);
                    dw2.addActionListener(this);
                    checkm22=true;
                    cookdone2 = false;
                }
                else if(cookdone3 ==true){
                    remove(dd3Button); 
                    setLayout(null);
                    dw3.setBounds(450, 220, 152, 106);
                    dw3.setBorderPainted(false);
                    dw3.setBorder(null);
                    dw3.setOpaque(false);
                    dw3.setContentAreaFilled(false);
                    add(dw3);
                    dw3.addActionListener(this);
                    checkm23=true;
                    cookdone3 = false;
                }
                else if(cookdone4 ==true){
                    remove(dd4Button); 
                    setLayout(null);
                    dw4.setBounds(610, 220, 152, 106);
                    dw4.setBorderPainted(false);
                    dw4.setBorder(null);
                    dw4.setOpaque(false);
                    dw4.setContentAreaFilled(false);
                    add(dw4);
                    dw4.addActionListener(this);
                    cookdone4 = false;
                    checkm24=true;
                }    
            }
            //////
            else if(e.getSource() == this.DrinkButton){
                if(checkdrink1 ==false){
                    setLayout(null);
                    r1Button.setBounds(1050, 200, 112, 194);
                    r1Button.setBorderPainted(false);
                    r1Button.setBorder(null);
                    r1Button.setOpaque(false);
                    r1Button.setContentAreaFilled(false);
                    add(r1Button);
                    r1Button.addActionListener(this);        
                    checkdrink1 =true;
                }
                else if(checkdrink2 ==false){
                    setLayout(null);
                    r2Button.setBounds(950, 170, 112, 194);
                    r2Button.setBorderPainted(false);
                    r2Button.setBorder(null);
                    r2Button.setOpaque(false);
                    r2Button.setContentAreaFilled(false);
                    add(r2Button);
                    r2Button.addActionListener(this);
                    
                    checkdrink2=true;
                }
                else if(checkdrink3 ==false){
                    setLayout(null);
                    r3Button.setBounds(850, 150, 112, 194);
                    r3Button.setBorderPainted(false);
                    r3Button.setBorder(null);
                    r3Button.setOpaque(false);
                    r3Button.setContentAreaFilled(false);
                    add(r3Button);
                    r3Button.addActionListener(this);
                    checkdrink3=true;
                }
            }
            else if(e.getSource() == this.dd1Button){
                remove(dd1Button);
                dd=true;               
                cookdone1=false;
                checkm1=false;
            }
            else if(e.getSource() == this.dd2Button){
                remove(dd2Button);
                dd=true;
                checkm2=false;
                cookdone2=false;
            }
            else if(e.getSource() == this.dd3Button){
                remove(dd3Button);
                dd=true;
                checkm3=false;
                cookdone3=false;
            }
            else if(e.getSource() == this.dd4Button){
                remove(dd4Button);
                dd=true;
                checkm4=false;
                cookdone4=false;
            }
            else if(e.getSource() == this.ds1){
                remove(ds1);
                checkm1=false;
                dsc=true;
               checkm11=false;
                
            }
            else if(e.getSource() == this.ds2){
                remove(ds2);
                checkm2=false;
                dsc=true;
                checkm12=false;
            }
            else if(e.getSource() == this.ds3){
                remove(ds3);
                dsc=true;
                checkm3=false;
                checkm13=false;
            }
            else if(e.getSource() == this.ds4){
                remove(ds4);
                dsc=true;
                checkm4=false;
                checkm14=false;
            }
            else if(e.getSource() == this.dw1){
                remove(dw1);
                dwc=true;
                checkm1=false;
                checkm21=false;
            }
            else if(e.getSource() == this.dw2){
                remove(dw2);
                dwc=true;
                checkm2=false;
                checkm22=false;
            }
            else if(e.getSource() == this.dw3){
                remove(dw3);
                dwc=true;
                checkm3=false;
                checkm23=false;
            }
            else if(e.getSource() == this.dw4){
                remove(dw4);
                dwc=true;
                checkm4=false;
                checkm24=false;
            }
            else if(e.getSource() == this.r1Button){
                remove(r1Button);
                ddc=true;
                checkdrink1=false;
                
            }
            else if(e.getSource() == this.r2Button){
                remove(r2Button);
                ddc=true;
                checkdrink2=false;
            }
            else if(e.getSource() == this.r3Button){
                remove(r3Button);
                ddc=true;
                checkdrink3=false;
            }          
        }
        this.repaint();     
    }   
}