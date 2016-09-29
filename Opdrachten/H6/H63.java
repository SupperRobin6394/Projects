package H6;

/**
 * Created by Robin on 29-09-16.
 */

import java.awt.*;
import java.applet.*;

public class H63 extends Applet
{
    int Value1;
    int Value2;
    int Result;

    public void init()
	{
		Value1 = 56;
        Value2 = 42;
        Result = Value1 + Value2;
    }
    public void paint(Graphics g)
	{
         g.drawString("Addition: -" + Result, 50, 60);
    }
}