package H10;

/**
 * Created by Robin on 11-01-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H103 extends Applet
{
	TextField TextField1;
	Label label;
	String String1, TextString;
	int Month;
	public void init()
	{
		TextField1 = new TextField("", 20);
		label = new Label("Enter the number and press enter.");
		TextField1.addActionListener(new Listener1());
		TextString = "";
		add(label);
		add(TextField1);
	}
	public void paint(Graphics g)
	{
		g.drawString(TextString, 50, 60);
	}
	class Listener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String1 = TextField1.getText();
			Month = Integer.parseInt(String1);
			switch (Month)
			{
				case 1:
				{
					TextString = "January, 31 StringDays";
					break;
				}
				case 2:
				{
					TextString = "February, 28/29* StringDays (*= Leapyear)";
					break;
				}
				case 3:
				{
					TextString = "March, 31 StringDays";
					break;
				}
				case 4:
				{
					TextString = "April, 30 StringDays";
					break;
				}
				case 5:
				{
					TextString = "May, 31 StringDays";
					break;
				}
				case 6:
				{
					TextString = "June, 30 StringDays";
					break;
				}
				case 7:
				{
					TextString = "July, 31 StringDays";
					break;
				}
				case 8:
				{
					TextString = "August, 31 StringDays";
					break;
				}
				case 9:
				{
					TextString = "September, 30 StringDays";
					break;
				}
				case 10:
                {
                    TextString = "October, 31 StringDays";
                    break;
                }
				case 11:
				{
					TextString = "November, 30 StringDays";
					break;
				}
				case 12:
				{
					TextString = "December, 31 StringDays";
					break;
				}
				default:
				{
					TextString = "Wrong number!";
					break;
				}
			}
			repaint();
		}
	}
}