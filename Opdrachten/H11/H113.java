package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H113 extends Applet
{
    public void paint(Graphics g)
	{
        int x = 50;
        int y = 30;
        int z = 1;
        for(int Counter = 1; Counter < 30; Counter += z)
		{
            g.drawString("" + Counter, x, y);
            x += 20;
            z++;
        }
    }
}

