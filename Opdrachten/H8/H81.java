package H8

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 04-10-16.
 */

public class H81 extends Applet
{
	Button EnterBotton;
	Button ResetButton;
	TextField TestField;
	Label TextLabel;
	String TextString;
	public void init()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
		TextString = "";
		TextLabel = new Label("Enter something");
		add(TextLabel);
		TestField = new TextField("",20);
		add(TestField);
		EnterBotton = new Button();
		EnterBotton.setLabel("Enter");
		Listener L = new Listener();
		Listener2 L2 = new Listener2();
		EnterBotton.addActionListener(L);
		add(EnterBotton);
		ResetButton = new Button();
		ResetButton.setLabel("Reset");
		ResetButton.addActionListener(L2);
		add(ResetButton);
	}
	public void paint(Graphics g)
	{
		g.drawString("You wrote: " +TextString, 250, 250);
	}
	class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			TextString = TestField.getText();
			repaint();
		}
	}
	class Listener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			TextString = "";
			TestField.setText("");
			repaint();
		}
	}
}