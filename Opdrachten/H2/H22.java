package H2;

/**
 * Created by Robin on 16/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H22 extends Applet
{
    public void init()
    {
        setBackground(Color.white);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString("Robin", 50, 60);
        g.setColor(Color.red);
        g.drawString("Knapen", 50, 70);
    }
}
