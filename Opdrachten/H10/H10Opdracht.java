package H10;

/**
 * Created by Robin on 10/11/2016.
 */
 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdracht extends Applet
{
    TextField TextField;
    Label Label;
    String s, Text, Number1;
    int Number2;
    public void init() {
        TextField = new TextField("", 20);
        Label = new Label("type het Number2 in min= 1 max = 10");
        TextField.addActionListener(new ActionInput());
        Text = "";
        add(Label);
        add(TextField);
    }
    public void paint(Graphics g)
    {
        g.drawString("Het Number2 is: "+Text, 50, 60);
        g.drawString("Het ingevoerde Number2 is: "+Number1, 50, 40);
    }
    class ActionInput implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            s = TextField.getText();
            Number2 = Integer.parseInt(s);
            switch (Number2)
			{
                case 1:
                    Text = "SLECHT";
                    Number1 = "1";
                    break;
                case 2:
                    Text = "SLECHT";
                    Number1 = "2";
                    break;
                case 3:
                    Text = "SLECHT";
                    Number1 = "3";
                    break;
                case 4:
                    Text = "ONVOLDOENDE";
                    Number1 = "4";
                    break;
                case 5:
                    Text = "MATIG";
                    Number1 = "5";
                    break;
                case 6:
                    Text = "VOLDOENDE";
                    Number1 = "6";
                    break;
                case 7:
                    Text = "VOLDOENDE";
                    Number1 = "7";
                    break;
                case 8:
                    Text = "GOED";
                    Number1 = "8";
                    break;
                case 9:
                    Text = "GOED";
                    Number1 = "9";
                    break;
                case 10:
                    Text = "GOED";
                    Number1 = "10";
                    break;
                default:
                    Text = "ERROR.. Voer een geldig Number2 in..";
                    Number1 = "ERROR.. Voer een geldig Number2 in..";
                    break;
            }
            repaint();
        }
    }
}