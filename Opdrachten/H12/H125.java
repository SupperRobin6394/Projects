package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H125 extends Applet
{
    int[] Numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 43, 1984, 235240, 3000, 22, 2016};
    TextField Input = new TextField("", 5);
    Button ButtonConfirm = new Button("Oké");
    String string = "";
    boolean Found = false;
    int Index = -1;
    public void init()
	{
        setSize(450, 450);
        add(Input);
        Input.addActionListener(new invoerListener());
        add(ButtonConfirm);
        ButtonConfirm.addActionListener(new invoerListener());
    }
    public void paint(Graphics g)
	{
        int x = getWidth();
        int y = getHeight();
        g.drawString("" + string, x / 2 - 100, y / 2);
    }
    class invoerListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e) 
		{
            int zoeken = Integer.parseInt(Input.getText());
            for (int o = 0; o < Numbers.length && Found == false; o++)
			{
                Index++;
                if (Numbers[o] == zoeken)
				{
                    Found = true;
                }
            }
            if (Found == true)
			{
                string = "Er is een of meer waarde(s) Found onder de Index " + Index + ".";
            }
			else
			{
                string = "De waarde is niet Found.";
            }
            Index = -1;
            Input.setText("");
            Found = false;
            repaint();
        }
    }
}