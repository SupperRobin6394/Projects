package H12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H121 extends Applet
{
    int[] Numbers = {1, 2, 3, 4, 5, 10, 1, 50, 25};
    public void init()
	{
        setSize(275, 200);
    }
    public void paint(Graphics g)
	{
        int x = getWidth();
        int y = getHeight();
        double gem = 0.0;
        for (int Counter = 0; Counter < Numbers.length; Counter++)
		{
            g.drawString("" + Numbers[Counter], x / 2, (y / 2 - 15 * Numbers.length / 2) + 15 * Counter);
            gem += Numbers[Counter];
        }
        gem /= Numbers.length;
        g.drawString("Het gemiddelde is " + gem, x / 2 - 50, (y / 2 + 15 * Numbers.length / 2) + 10);
    }
}