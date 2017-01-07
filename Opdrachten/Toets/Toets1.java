package Toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toets1 extends Applet
{
    private TextField textField;
    private Double timeLondon, timeNewYork, timeSydney, timeTokyo;
    private int y = 50;
    private String errorString;
    public void init()
	{
        Button showTimesButton = new Button("Show times");
        showTimesButton.addActionListener(new ShowTimesButtonListener());
        add(showTimesButton);
        textField = new TextField("", 20);
        add(textField);
        setSize(500, 500);
    }
    public void paint(Graphics g)
	{
        int x = 50;
        g.drawString(errorString, x, y);
        g.drawString("London: " + timeLondon, x, y);
        y += 25;
        g.drawString("New York: " + timeNewYork, x, y);
        y += 25;
        g.drawString("Sydney: " + timeSydney, x, y);
        y += 25;
        g.drawString("Tokyo: " + timeTokyo, x, y);
    }
    private class ShowTimesButtonListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e)
		{
            Double timeString = Double.parseDouble(textField.getText());
            if (timeString > 23)
			{
                errorString = "enter a number between 0 and 24";
            }
			else
			{
                errorString = " ";
                timeLondon = timeString -= 1;
                timeNewYork = timeString -= 5;
                timeSydney = timeString += 9;
                timeTokyo = timeString += 8;
                if (timeLondon < 0) timeLondon += 24;
                else if (timeLondon > 23) timeLondon -= 24;
                if (timeNewYork < 0) timeNewYork += 24;
                else if (timeNewYork > 23) timeNewYork -= 24;
                if (timeSydney < 0) timeSydney += 24;
                else if (timeSydney > 23) timeSydney -= 24;
                if (timeTokyo < 0) timeTokyo += 24;
                else if (timeTokyo > 23) timeTokyo -= 24;
            }
            repaint();
        }
    }
}