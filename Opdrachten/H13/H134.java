package H13;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H134 extends Applet
{
	Color ColorRed = new Color(255, 81, 76);
	int Stone;
	public void init()
	{
		setSize(600, 600);
		Stone = 1;
		Button Button1 = new Button("baksteen");
		Button Button2 = new Button("beton");
		Listen1 l1 = new Listen1();
		Listen2 l2 = new Listen2();
		Button1.addActionListener(l1);
		Button2.addActionListener(l2);
		add(Button1);
		add(Button2);
	}
	public void paint(Graphics g)
	{
		if(Stone == 0)
		{
			for(int muur1 = 0; muur1 < 25; muur1++)
			{
				for(int muur2 = 0; muur2 < 25; muur2++)
				{
					tekensteen(g, muur1 * 22 + 10 *(muur2 % 2),(muur2 + 5) * 12);
				}
			}
		}
		else if(Stone == 1)
		{
			for(int muur1 = 0; muur1 < 15; muur1++)
			{
				for(int muur2 = 0; muur2 < 15; muur2++)
				{
					tekenbeton(g, muur1 * 42 + 20 *(muur2 % 2),(muur2 + 5) * 22);
				}
			}
		}
	}
	public class Listen1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Stone = 0;
			repaint();
		}
	}
	public class Listen2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Stone = 1;
			repaint();
		}
	}
	void tekensteen(Graphics g, int x1, int y1)
	{
		g.setColor(ColorRed);
		g.fillRect(x1, y1, 20, 10);
	}
	void tekenbeton(Graphics g, int x1, int y1)
	{
		g.setColor(Color.gray);
		g.fillRect(x1, y1, 40, 20);
	}
}