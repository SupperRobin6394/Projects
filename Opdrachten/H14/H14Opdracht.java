package H14;

import java.awt.*;
import java.applet.*;
import java.net.*;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H14Opdracht extends Applet
{
	public String GameOver;
	public int Numbers = 23;
	public boolean Turn = true;
	public int TurnPlayer, TurnComp;
	public Image Image;
	public TextField InputField;
	public Button InputButton;
	public int InputNumber;
	public void init()
	{
		InputField = new TextField("", 5);
		InputField.addActionListener(new TurnListener());
		add(InputField);
		InputButton = new Button("End Turn");
		InputButton.addActionListener(new TurnListener());
		add(InputButton);
		URL Path = H14Opdracht.class.getResource("Img/");
		Image = getImage(Path, "TODO.png");
		setSize(500, 500);
	}
	public void paint(Graphics g)
	{
		if(!Turn)
		{
			Turn = true;
			g.setColor(Color.BLACK);
			g.drawString("Choose a number between 1 and 3", 40, 80);
			if(InputNumber > 3)
			{
				g.setColor(Color.RED);
				g.drawString("ERROR Choose a number between 1 and 3", 40, 80);
				g.setColor(Color.BLACK);
			}
			if(InputNumber < 1)
			{
				g.setColor(Color.RED);
				g.drawString("Choose a number between 1 and 3", 40, 80);
				g.setColor(Color.BLACK);
			}
		}
		if(Numbers > 0)
		{
			int x = 50;
			int y = 100;
			for(int i = 0; i < Numbers; i++)
			{
				g.drawImage(Image, x, y, 20, 20, this);
				x += 50;
				if(i % 4 == 3)
				{
					x = 50;
					y += 50;
				}
			}
			g.drawString("computer's last Turn:  " + TurnComp, 200, 70);
		}
		else
		{
			g.drawString(GameOver, 100, 100);
		}
	}
	private int compOptions()
	{
		int END = 0;
		double DoubleNumber;
		int r2;
		DoubleNumber = Math.random();
		r2 =(int)(DoubleNumber * 3 + 1);
		int c;
		c = Numbers % 4;
		if(c == 0)
		{
			END = 3;
		}
		if(c == 1)
		{
			END = r2;
		}
		if(c == 2)
		{
			END = 1;
		}
		if(c == 3)
		{
			END = 2;
		}
		return END;
	}
	public class TurnListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String inputGiven = InputField.getText();
			InputNumber = Integer.parseInt(inputGiven);
			if(InputNumber < 4 && InputNumber > 0)
			{
				TurnPlayer = InputNumber;
				Numbers -= TurnPlayer;
				if(Numbers < 1)
				{
					GameOver = "GAME OVER, you have lost!";
				}
				else
				{
					TurnComp = compOptions();
					Numbers -= TurnComp;
					if(Numbers < 0)
					{
						GameOver = "GAME OVER, you have won!";
					}
				}
			}
			else
			{
				Turn = false;
			}
			repaint();
		}
	}
}