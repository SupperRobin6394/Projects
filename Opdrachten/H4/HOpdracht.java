package H4;

/**
 * Created by Robin on 20/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class HOpdracht extends Applet
{
    public void init()
    {
        this.setSize(800, 500);
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        g.drawLine(100, 50,  300, 50);
        g.drawRect(100, 100, 200, 100);
        g.drawRoundRect(100, 225, 200, 100, 30, 30);
        g.setColor(Color.magenta);
        g.fillRect(315, 100, 200, 100);
        g.fillArc(560, 100, 200, 100, 20, 45);
        g.setColor(Color.black);
        g.drawString("Line",180,70);
        g.drawString("Rectangle",170,215);
        g.drawString("Roundrect",140,340);
        g.drawString("Filled rectangle with oval",320,215);
        g.drawString("Wrapped oval",580,215);
        g.drawString("Filled oval",370,340);
        g.drawString("Circle",635,340);
        g.drawOval(560, 100, 200, 100);
        g.drawOval(315, 100, 200, 100);
        g.drawOval(600, 225, 100, 100);
        g.setColor(Color.magenta);
        g.fillOval(315, 225, 200, 100);

    }
}
