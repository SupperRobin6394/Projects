package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H114 extends Applet
{
    public void paint(Graphics g)
	{
        int x = 50;
        int y = 50;
		for(int Counter = 3; Counter < 33; Counter += 3)
		{
            g.drawString("" + Counter, x, y);
            x += 20;
        }
    }
}
