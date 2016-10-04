package H8

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 04-10-16.
 */

public class H82 extends Applet
{
	int Men, Women, StudentM, StudentW;
	Button Botton1;
	Button Botton2;
	Button Botton3;
	Button Botton4;
	Button Botton5;
	public void init ()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
		Men = 0;
		Women = 0;
		StudentM = 0;
		StudentW = 0;
		ActionClass1 ActionButton1 = new ActionClass1();
		ActionClass2 ActionButton2 = new ActionClass2();
		ActionClass3 ActionButton3 = new ActionClass3();
		ActionClass4 ActionButton4 = new ActionClass4();
		ActionClass5 ActionButton5 = new ActionClass5();
		Botton1 = new Button();
		Botton2 = new Button();
		Botton3 = new Button();
		Botton4 = new Button();
		Botton5 = new Button();
		Botton1.setLabel("Men");
		Botton2.setLabel("Women");
		Botton3.setLabel("Male student");
		Botton4.setLabel("Female student");
		Botton5.setLabel("Reset");
		Botton1.addActionListener(ActionButton1);
		Botton2.addActionListener(ActionButton2);
		Botton3.addActionListener(ActionButton3);
		Botton4.addActionListener(ActionButton4);
		Botton5.addActionListener(ActionButton5);
		add(Botton1);
		add(Botton2);
		add(Botton3);
		add(Botton4);
		add(Botton5);
	}
	public void paint (Graphics g)
	{
		g.drawString("Men: "+Men, 20, 130);
		g.drawString("Women: "+Women, 20, 150);
		g.drawString("Male students: "+StudentM, 20, 170);
		g.drawString("Female students: "+StudentW, 20, 190);
	}
	class ActionClass1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Men++;
			repaint();
		}
	}
	class ActionClass2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Women++;
			repaint();
		}
	}
	class ActionClass3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			StudentM++;
			repaint();
		}
	}
	class ActionClass4 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			StudentW++;
			repaint();
		}
	}
	class ActionClass5 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Men = 0;
			Women = 0;
			StudentM = 0;
			StudentW = 0;
			repaint();
		}
	}
}