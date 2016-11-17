package H11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H11Opdracht2 extends Applet
{
    Button ButtonConfirm;
    int Number, Counter, y, x;
    public void init() 
	{
        Number = 0;
        Counter = 0;
        ButtonConfirm = new Button("OK");
        Listen1 l = new Listen1();
        ButtonConfirm.addActionListener(l);
        add(ButtonConfirm);
    }
    public void paint(Graphics g) 
	{
        x = 60;
        y = 60;
        if (Number > 0 && Number < 11)
		{
            for (Counter = 0; Counter < 10; ) 
			{
                Counter++;
                y = y + 10;
                g.drawString(Counter + "x" + Number + "=" + Number * Counter, x, y);
            }
        }
		else if (Number > 10) 
		{
            Number = 0;
        }
    }
    class Listen1 implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            Number++;
            repaint();
        }
    }
}


