package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H126 extends Applet
{
    int[] Numbers = {0, 0, 0, 1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9, 9, 9, 9, 10, 10};
    TextField InputField = new TextField("", 5);
    Button ButtonConfirm = new Button("OK");
    String TextString = "";
    int Count = 0;
    public void init()
	{
        setSize(400, 400);
        add(InputField);
        InputField.addActionListener(new InputListener());
        add(ButtonConfirm);
        ButtonConfirm.addActionListener(new InputListener());
    }
    public void paint(Graphics g)
	{
        int x = getWidth();
        int y = getHeight();
        g.drawString("" + TextString, x / 2 - 100, y / 2);
    }
    class InputListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            int search = Integer.parseInt(InputField.getText());
            for (int Counter = 0; Counter < Numbers.length; Counter++)
			{
                if (Numbers[Counter] == search)
				{
                    Count++;
                }
            }
            if (Count > 0)
			{
                TextString = "De waarde is " + Count + " keer Found.";
            }
			else
			{
                TextString = "De waarde is niet Found.";
            }
            Count = 0;
            InputField.setText("");
            repaint();
        }
    }
}