package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */

public class H115 extends Applet
{
    public void paint(Graphics g) 
	{
        int y = 0;
        int x = 0;
        for(int Counter = 1; Counter <= 5; Counter++)
		{
            y += 20;
            x += 20;
            g.drawRect(x,y,20,20);
        }
    }
}
