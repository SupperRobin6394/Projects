package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H13Opdracht extends Applet
{
	public void init()
	{
		setSize(500, 500);
	}
	public void paint(Graphics g)
	{
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				tekenboom(g, i * 80 + 20 *(j % 2),(j + 5) * 40);
			}
		}
	}
	void tekenboom(Graphics g, int x, int y)
	{
		g.setColor(new Color(51, 25, 0));
		g.fillRect(x, y, 20, 40);
		g.setColor(Color.green);
		g.fillOval(x - 20, y - 30, 60, 40);
	}
}