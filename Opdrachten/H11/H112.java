package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H112 extends Applet
{
    public void paint(Graphics g)
	{
        int x = 0;
        for(int Counter = 10; Counter <= 20; Counter++)
		{
            x += 20;
            g.drawString("" + Counter, x, 100);
        }
    }
}
