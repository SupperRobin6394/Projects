package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H123 extends Applet
{
    TextField[] TextField;
    int[] Numbers;
    Button ButtonConfirm;
    public void init()
	{
        Numbers = new int[5];
        TextField = new TextField[5];
        for (int Counter = 0; Counter < TextField.length; Counter++)
		{
            TextField[Counter] = new TextField("", 5);
            add(TextField[Counter]);
        }
        ButtonConfirm = new Button("Oké");
        ButtonConfirm.addActionListener(new Listener());
        add(ButtonConfirm);
    }
    class Listener implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            for (int Counter = 0; Counter < Numbers.length; Counter++)
			{
                Numbers[Counter] = Integer.parseInt(TextField[Counter].getText());
            }
            Arrays.sort(Numbers);
            for (int Counter = 0; Counter < Numbers.length; Counter++)
			{
                TextField[Counter].setText("" + Numbers[Counter]);
            }
        }
    }

}
