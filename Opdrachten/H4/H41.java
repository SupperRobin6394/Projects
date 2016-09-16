package H4;

/**
 * Created by Robin on 16/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H41 extends Applet
{
    public void init()
    {
        this.setSize(500, 500);
        setBackground(Color.white);

    }
    public void paint(Graphics g)
    {
        g.drawLine(250, 50, 450, 450);
        g.drawLine(250, 50, 50, 450);
        g.drawLine(50, 450, 450, 450);
    }
}