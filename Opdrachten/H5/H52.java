package H5;

/**
 * Created by Robin on 27/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H52 extends Applet
{
	int gewicht1;
	int gewicht2;
	int gewicht3;
	public void init()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
		gewicht1 = 390;
		gewicht2 = 220;
		gewicht3 = 300;
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(110, 31, gewicht1, 20);
		g.setColor(Color.green);
		g.fillRect(110, 51, gewicht2, 20);
		g.setColor(Color.blue);
		g.fillRect(110, 71, gewicht3, 20);
	}
}