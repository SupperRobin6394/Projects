package H4;

/**
 * Created by Robin on 20/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H42 extends Applet
{
    public void init()
    {
        this.setSize(500, 500);
        setBackground(Color.white);

    }
    public void paint(Graphics g)
    {
        g.drawRect(100, 150, 200, 200); // body
        g.drawLine(200, 50, 100, 150); // dak 1
        g.drawLine(200, 50, 300, 150); // dak 2
        g.drawRect(125, 190, 50, 50); // Raam
        g.drawRect(225, 275, 50, 75); // Deur
    }
}