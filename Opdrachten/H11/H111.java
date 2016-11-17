package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */

public class H111 extends Applet
{
    public void paint(Graphics g)
	{
        int y = 0;
        for(int Counter = 1; Counter <= 10; Counter++)
		{
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + Counter, 305, y );
        }
    }
}