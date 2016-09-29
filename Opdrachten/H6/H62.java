package H6;

/**
 * Created by Robin on 29-09-16.
 */

import java.awt.*;
import java.applet.*;

public class H62 extends Applet
{
    int Seconds;
    int Minutes;
    int SecondsInHour;
    int Hour;
    int Day;
    int SecondsInDay;
    int SecondsInYear;

    public void init()
	{
		this.setSize(500, 500);
		setBackground(Color.white);
        Seconds = 60;
        Minutes = 60;
        SecondsInHour = Seconds	* Minutes;
        Hour = 24;
        Day = 365;
        SecondsInDay = SecondsInHour * Hour;
        SecondsInYear = SecondsInDay * Day;
    }
    public void paint(Graphics g)
	{
        g.drawString("Amount of seconds in an hour: " + SecondsInHour, 50, 60 );
        g.drawString("Amount of seconds in a day " + SecondsInDay, 50, 80 );
        g.drawString("Amount of seconds in a year " + SecondsInYear, 50, 100 );
    }
}