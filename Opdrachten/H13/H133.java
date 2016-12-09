package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H133 extends Applet
{
	Color ColorRed = new Color(255, 81, 76);
	public void init()
	{
		setSize(600, 400);
	}
	public void paint(Graphics g)
	{
		g.drawString("" + wall, 225, 325);
		g.drawString("" + wall2, 220, 350);
		g.drawString("" + wall3, 250, 375);
		for(int i = 0; i < 25; i++) 
		{
			for(int j = 0; j < 25; j++)
			{
				CreateWall(g, i * 22 + 10 *(j % 2), j * 12);
			}
		}
	}
	void CreateWall(Graphics g, int x1, int y1)
	{
		g.setColor(ColorRed);
		g.fillRect(x1, y1, 20, 10);
	}
}
