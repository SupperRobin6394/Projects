package H10;

/**
 * Created by Robin on 01-11-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H104 extends Applet
{
	TextField Text1;
	TextField Text2;
	Label Label1;
	String TextString,String1,StringDays, StringYears;
	int Month, Year, LeapYear, LeapYearFalse;
	public void init()
	{
		Listen1 ActionListener1 = new Listen1();
		Text1 = new TextField("Month",20);
		Text2 = new TextField("Year",20);
		Label1 = new Label("typ een getal");
		Text1.addActionListener(ActionListener1);
		Text2.addActionListener(ActionListener1);
		add (Label1);
		add (Text1);
		add (Text2);
	}
	public void paint(Graphics g)
	{
		g.drawString("de Month heet: "+ TextString, 40, 100);
		g.drawString("de Month heeft "+StringDays+" StringDays",40, 120);
	}
	class Listen1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String1 = Text1.getText();
			StringYears = Text2.getText();
			Month = Integer.parseInt(String1);
			Year = Integer.parseInt(StringYears);
			LeapYear = Year%4;
			LeapYearFalse = Year%400;
			switch(Month)
			{
				case 1:
				{
					TextString = "January";
					StringDays = "31";
					break;
				}
				case 2:
				{
					TextString = "February";
					if (LeapYear == 0 &&!( LeapYearFalse == 0))
					{
						StringDays = "29";
					}
					else
					{
						StringDays = "28";
					}
					break;
				}
				case 3:
				{
					TextString = "March";
					StringDays = "31";
					break;
				}
				case 4:
				{
					TextString = "April";
					StringDays = "30";
					break;
				}
				case 5:
				{
					TextString = "May";
					StringDays = "31";
					break;
				}
				case 6:
				{
					TextString = "June";
					StringDays = "30";
					break;
				}
				case 7:
				{
					TextString = "July";
					StringDays = "31";
					break;
				}
				case 8:
				{
					TextString = "August";
					StringDays = "31";
					break;
				}
				case 9:
				{
					TextString = "September";
					StringDays = "30";
					break;
				}
				case 10:
				{
					TextString = "October";
					StringDays = "31";
					break;
				}
				case 11:
				{
					TextString = "November";
					StringDays = "30";
					break;
				}
				case 12:
				{
					TextString = "December";
					StringDays = "31";
					break;
				}
				default:
				{
					TextString = "This ain't a month!";
					StringDays = null;
					break;
				}
			}
			repaint();
		}
	}
}