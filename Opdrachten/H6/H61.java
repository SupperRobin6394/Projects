package H6;

/**
 * Created by Robin on 29-09-16.
 */

import java.awt.*;
import java.applet.*;

public class H61 extends Applet
{
    double A;
    int B;
    double Result;

    public void init()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
        A = 113;
        B = 4;
        Result = A / B;
    }
    public void paint(Graphics g)
	{
        g.drawString("Everyone gtes €" + Result, 20, 20);
    }
}