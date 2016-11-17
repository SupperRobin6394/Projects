package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H124 extends Applet
{
    TextField[] textfields = new TextField[5];
    Button ButtonReset = new Button("Reset");
    String[] Unsorted = new String[textfields.length];
    String[] Sorted = new String[textfields.length];
    int[] sortInt = new int[textfields.length];
    int StringLenght = 0;
    public void init()
	{
        setSize(400, 400);
        for (int Counter = 0; Counter < textfields.length; Counter++)
		{
            textfields[Counter] = new TextField("", 5);
            add(textfields[Counter]);
            textfields[Counter].addActionListener(new InputListener());
        }
        add(ButtonReset);
        ButtonReset.addActionListener(new ResetListener());
        for (int Counter = 0; Counter < textfields.length; Counter++)
		{
            Unsorted[Counter] = "";
            Sorted[Counter] = "";
        }
    }
    public void paint(Graphics g)
	{
        int x = getWidth();
        int y = getHeight();

        for (int Counter = 0; Counter < textfields.length; Counter++)
		{
            g.drawString("" + Unsorted[Counter], x / 2 - ((textfields.length / 2) - Counter) * 50, y / 2 - 20);
            if (StringLenght == textfields.length)
			{
                Arrays.sort(sortInt);
                Sorted[Counter] = "" + sortInt[Counter];
                g.drawString("" + Sorted[Counter], x / 2 - ((textfields.length / 2) - Counter) * 50, y / 2 + 20);
            }
        }
    }
    class InputListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            TextField src = (TextField) e.getSource();
            Unsorted[StringLenght] = "" + Integer.parseInt(src.getText());
            sortInt[StringLenght] = Integer.parseInt(src.getText());
            StringLenght++;
            repaint();
        }
    }
    class ResetListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            for (int Counter = 0; Counter < textfields.length; Counter++)
			{
                textfields[Counter].setText(" ");
                textfields[Counter].setText("");
                Sorted[Counter] = "";
                Unsorted[Counter] = "";
            }
            StringLenght = 0;
            textfields[0].requestFocus();
            repaint();
        }
    }
}
