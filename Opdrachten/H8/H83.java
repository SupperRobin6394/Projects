package H8

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 04-10-16.
 */

public class H83 extends Applet
{
	Label TextLabel;
	TextField TextField;
	Button ButtonEnter;
	Button ButtonReset;
	double Percent;
	double Price;
	public void init()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
		Percent = 1.21;
		TextLabel = new Label("€ Including tax");
		TextField = new TextField("Enter price without tax", 26);
		ButtonEnter = new Button();
		ButtonReset = new Button();
		ButtonEnter.setLabel("Enter");
		ButtonReset.setLabel("Reset");
		ClassListen1 Action1 = new ClassListen1();
		ClassListen2 Action2 = new ClassListen2();
		ClassListen3 Action3 = new ClassListen3();
		ButtonEnter.addActionListener(Action1);
		ButtonReset.addActionListener(Action2);
		TextField.addActionListener(Action3);
		add(ButtonEnter);
		add(ButtonReset);
		add(TextField);
		add(TextLabel);
	}
	class ClassListen1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Price = Double.parseDouble(TextField.getText());
			Price = Price * Percent;
			TextField.setText(String.format("%.2f", Double.valueOf(Price)));
			repaint();
		}
	}
	class ClassListen2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			TextField.setText(null);
			repaint();
		}
	}
	class ClassListen3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Price = Double.parseDouble(TextField.getText());
			Price = Price * Percent;
			TextField.setText(String.format("%.2f", Double.valueOf(Price)));
			repaint();
		}
	}
}