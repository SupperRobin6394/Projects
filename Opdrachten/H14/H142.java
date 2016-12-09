package H14;

import java.applet.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H142 extends Applet
{
	private String[] Colors = {"Ruiten ", "Harten ", "Schoppen ", "Klaveren "};
	private String[] Cards = {"tien", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "boer", "vrouw", "heer", "aas"};
	private String[] Deck = new String[52];
	private String[] Player1 = new String[13];
	private String[] Player2 = new String[13];
	private String[] Player3 = new String[13];
	private String[] Player4 = new String[13];
	public void init()
	{

	}
	public void paint(Graphics g)
	{
		g.drawString("Speler 1", 10, 30);
		g.drawString("Speler 2", 110, 30);
		g.drawString("Speler 3", 210, 30);
		g.drawString("Speler 4", 310, 30);
		for(int i = 0; i < 13; i++)
		{
			g.drawString(Player1[i], 10, 50 +(i * 20));
			g.drawString(Player2[i], 110, 50 +(i * 20));
			g.drawString(Player3[i], 210, 50 +(i * 20));
			g.drawString(Player4[i], 310, 50 +(i * 20));
		}
	}
	public H142()
	{
		int Index = 0;
		for(int i = 0; i < Colors.length; i++)
		{
			String Color = Colors[i];
			for(int j = 0; j < Cards.length; j++)
			{
				String Card = Cards[j];
				Deck[Index] = Color + Card;
				Index++;
			}
		}
		for(int i = 0; i < 13; i++)
		{
			Player1[i] = GiveCard();
			Player2[i] = GiveCard();
			Player3[i] = GiveCard();
			Player4[i] = GiveCard();
		}
	}
	private String GiveCard()
	{
		int random = new Random().nextInt(Deck.length);
		String Card = Deck[random];
		String[] List = new String[Deck.length - 1];
		int HelpIndex = 0;
		for(int i = 0; i < Deck.length; i++)
		{
			if(i != random)
			{
				List[HelpIndex] = Deck[i];
				HelpIndex++;
			}
		}
		Deck = List;
		return Card;
	}
}