//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-13
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class Experiment13 extends Applet{
    public void paint(Graphics g){
        //For triangle
        g.setColor(Color.blue);
        int a[]={125,100,150};
        int b[]={100,160,160};
        g.fillPolygon(a, b, 3);
        g.setColor(Color.black);
        g.drawPolygon(a, b, 3);
        //for smaller rectangle
        g.setColor(Color.pink);
        g.fillRect(100,160,50,100);
        g.setColor(Color.black);
        g.drawRect(100,160,50,100);
        //for bigger rectangle
        g.setColor(Color.green);
        g.fillRect(150,160,150,100);
        g.setColor(Color.black);
        g.drawRect(150,160,150,100);
        //for  polygon 
        g.setColor(Color.yellow);
        int x[]={125,275,300,150};
        int y[]={100,100,160,160};
        g.fillPolygon(x,y,4);
        g.setColor(Color.black);
        g.drawPolygon(x,y,4);
        //for smallest rectangle
        g.setColor(Color.black);
        g.fillRect(115,210,20,50);
        g.setColor(Color.black);
        g.drawRect(115,210,20,50);
        //for oval
        g.setColor(Color.red);
        g.fillOval(225,180,25,60);
        g.setColor(Color.black);
        g.drawOval(225,180,25,60);
        // for name to display
        g.setColor(Color.black);
        Font f = new Font("Impact",Font.BOLD,25);
        g.setFont(f);
        String s = getParameter("name");
        g.drawString(s,180,130);
    }
}
