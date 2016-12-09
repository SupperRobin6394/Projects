package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H132 extends Applet
{
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{
		DrawTriangle(g, 10, 80, 20, 40, 30, 60);
	}
	void DrawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
	}
}