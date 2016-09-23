package H4;

/**
 * Created by Robin on 20/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H46 extends Applet
{
    public void init()
    {
        this.setSize(500, 500);
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.gray);
        g.fillRect(120,130,10,150);
        g.fillRoundRect(100,10,50,120,20,20);
        g.setColor(Color.red);
        g.fillArc(110, 20,31,31,0,360);
        g.setColor(Color.orange);
        g.fillArc(110, 52,31,31,0,360);
        g.setColor(Color.green);
        g.fillArc(110, 85,31,31,0,360);
    }
}