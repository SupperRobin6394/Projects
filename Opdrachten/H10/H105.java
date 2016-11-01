package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 01-11-2016.
 */

public class H105 extends Applet
{
	double Number1, Number2, NewNumber, FinalNumber;
	Button Button1;
	Button Button2;
	TextField TextField1;
	public void init()
	{
		setSize(500, 500);
		TextField1 = new TextField("", 10);
		Button2 = new Button("reset");
		Number1 = 0;
		NewNumber = 0;
		FinalNumber = 0;
		Listen1 ActionListener1 = new Listen1();
		Listen2 ActionListener2 = new Listen2();
		Button1 = new Button("Add a number");
		Button1.addActionListener(ActionListener1);
		Button2.addActionListener(ActionListener2);
		add(TextField1);
		add(Button1);
		add(Button2);
	}
	public void paint(Graphics g)
	{
		if(Number2 > 5.4 && Number2 <= 10)
		{
			g.drawString("You've passed!", 200, 300);
		}
		if(Number2 > 10)
		{
			g.drawString("[ERROR] Invalid number", 200, 300);
		}
		else if(Number2 < 5.5)
		{
			g.drawString("You failed.", 200, 300);
		}
		g.drawString("Average:"+(String.format("%.2f", Double.valueOf(Number2))), 200, 250);
	}
	class Listen1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			NewNumber = Double.parseDouble(TextField1.getText());
			Number1++;
			FinalNumber = FinalNumber + NewNumber;
			Number2 = FinalNumber/Number1;
			repaint();
		}
	}
	class Listen2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			NewNumber = 0;
			Number1 = 0;
			Number2 = 0;
			FinalNumber = 0;
			repaint();
		}
	}
}