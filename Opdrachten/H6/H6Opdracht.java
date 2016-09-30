package H6;

import java.awt.*;
import java.applet.Applet;

/**
 * Created by Robin on 30-09-16.
 */


public class H6Opdracht extends Applet
{
    double Value1;
    double Value2;
    double Value3;
    double Total;
    int Average;
    double AverageEnd;

    public void init()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
        Value1 = 5.9;
        Value2 = 6.3;
        Value3 = 6.9;
        Total = (Value1 + Value2 + Value3) / 3;
        Average = (int) (Total * 10);
        AverageEnd = (double) Average / 10;
    }
    public void paint(Graphics g)
	{
        g.drawString("Average= " + AverageEnd, 50, 50);
    }
}
