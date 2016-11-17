package H11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H11Opdracht extends Applet 
{
    int NumberText;
    int Counter, x, y;
    TextField TextField;
    public void init() 
	{
        setSize(300, 500);
        NumberText = 0;
        TextField = new TextField(4);
        Listen1 l1 = new Listen1();
        TextField.addActionListener(l1);
        add(TextField);
    }
    public void paint(Graphics g) 
	{
        x = 60;
        y = 60;
        if (NumberText > 0) 
		{
            for (Counter = 0; Counter < 10;) 
			{
                y = y + 20;
                Counter++;
                g.drawString(Counter + "x" + NumberText + "=" + NumberText * Counter, x, y);
            }
        }
    }
    class Listen1 implements ActionListener 
	{
        public void actionPerformed(ActionEvent e) 
		{
            NumberText = (Integer.parseInt(TextField.getText()));
            repaint();
        }
    }
}