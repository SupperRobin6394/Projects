package H5;

/**
 * Created by Robin on 27/09/2016.
 */

import java.awt.*;
import java.applet.*;

public class H51 extends Applet
{
	Color opvulkleur;
	Color lijnkleur;
	int breedte;
	int hoogte;
	public void init()
	{
		this.setSize(800, 500);
		setBackground(Color.white);
		opvulkleur = Color.magenta;
		lijnkleur = Color.black;
		breedte = 200;
		hoogte = 100;
	}
	public void paint(Graphics g)
	{
		g.drawLine(100, 50,  300, 50);
		g.drawRect(100, 100, breedte, hoogte);
		g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
		g.setColor(opvulkleur);
		g.fillRect(315, 100, breedte, hoogte);
		g.fillArc(560, 100, breedte, hoogte, 20, 45);
		g.fillOval(315, 225, breedte, hoogte);
		g.setColor(lijnkleur);
		g.drawOval(560, 100, breedte, hoogte);
		g.drawOval(315, 100, breedte, hoogte);
		g.drawOval(600, 225, hoogte, hoogte);

	}
}