package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
public class H117 extends Applet
{
    public void init()
	{
        setSize(1000,1000);
    }
    public void paint(Graphics g)
	{
        int Counter = 0;
        int x = 500;
        int y = 300;
        int width = 10;
        int height = 10;
        while(Counter <= 50)
        {
            g.drawOval(x, y, width, height);
            width += 10;
            x -= 5;
            y -= 5;
            height += 10;
            Counter++;
        }
    }
}
