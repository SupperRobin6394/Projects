package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Robin on 10/11/2016.
 */
public class H12Opdracht extends Applet
{
    Label labelNaam = new Label("Naam: ");
    Label labelNummer = new Label("Telefoonnummer: ");
    TextField inputNaam = new TextField("", 15);
    TextField inputNummer = new TextField("", 15);
    Button ButtonConfirm = new Button("OK");
    String[] stringNaam = new String[10];
    String[] stringNummer = new String[10];
    int Counter = 0;
    public void init()
	{
        setSize(700, 700);
        add(labelNaam);
        add(inputNaam);
        inputNaam.addActionListener(new InputListen());
        add(labelNummer);
        add(inputNummer);
        inputNummer.addActionListener(new InputListen());
        add(ButtonConfirm);
        ButtonConfirm.addActionListener(new InputListen());
        for (int o = 0; o < stringNaam.length; o++)
		{
            stringNaam[o] = "";
            stringNummer[o] = "";
        }
    }
    public void paint(Graphics g)
	{
        int x = getWidth();
        int y = getHeight();
        for (int o = 0; o < stringNaam.length; o++)
		{
            if (Counter == 10)
			{
                g.drawString("" + stringNaam[o], x / 2 - 100, (y / 2 - 35 * stringNaam.length / 2) + 35 * o);
                g.drawString("" + stringNummer[o], x / 2 - 100, (y / 2 - 35 * stringNaam.length / 2) + 15 + 35 * o);
            }
        }
    }
    private class InputListen implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            Counter++;
            stringNaam[(Counter - 1)] = "Naam: " + inputNaam.getText();
            stringNummer[(Counter - 1)] = "Telefoon: " + inputNummer.getText();
            inputNaam.setText("");
            inputNummer.setText("");
            inputNaam.requestFocus();
            repaint();
        }
    }
}