package H4;

/**
 * Created by Robin on 20/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H47 extends Applet
{
    public void init()
    {
        this.setSize(500, 500);
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        g.drawRect(100,100,100,100);
        g.setColor(Color.black);
        g.fillArc(110,110,10,10,0,360);
        g.fillArc(180,180,10,10,0,360);
        g.fillArc(180,110,10,10,0,360);
        g.fillArc(110,180,10,10,0,360);
    }
}