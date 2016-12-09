package H13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H131 extends Applet
{
	String Text = "";
	Color[] BackGroundColor = {Color.MAGENTA, Color.GREEN, Color.YELLOW, Color.BLUE, Color.RED};
	String[] Colors = {"Magenta", "Green", "Yellow", "Blue", "Red"};
	Button[] Buttons = new Button[5];
	public void init()
	{
		setSize(500, 500);
		for(int i = 0; i < Buttons.length; i++)
		{
			Buttons[i] = new Button("" + Colors[i]);
			add(Buttons[i]);
			Buttons[i].addActionListener(new ButtonListener());
			Buttons[i].setBackground(BackGroundColor[i]);
		}
	}
	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Button Buttons =(Button) e.getSource();
			setBackground(Buttons.getBackground());
			Text = Buttons.getLabel();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(Text, getWidth() / 2 - 20, getHeight() / 2);
	}
}