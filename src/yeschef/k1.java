
package yeschef;
import javax.swing.*;


public class k1  {
    public ImageIcon[] im = new ImageIcon[6];
    public int x;
    public int count = 0;

    k1(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource("k"+(i+1)+".png"));
	}
    }
   
}
