package H14;

import java.applet.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Robin on 08-12-16.
 */
 
public class H141 extends Applet
{
	private String[] Colors = {"Ruiten ", "Harten ", "Schoppen ", "Klaveren "};
	private String[] Cards = {"tien", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "boer", "vrouw", "heer", "aas"};
	private String[] Deck = new String[52];
	private String[] Player = new String[13];
	private double DoubleNumber;
	private int Throw;
	public void init()
	{
		randomniser();
	}
	public void randomniser()
	{
		DoubleNumber = Math.random();
		Throw =(int)(DoubleNumber * 6 + 1);
	}
	public void paint(Graphics g)
	{
		CreateDeck();
		GiveCard();
		g.drawString("" + deelEnkeleKaart(), 100, 100);
	}
	public void CreateDeck()
	{
		int index = 0;
		for(int i = 0; i < Colors.length; i++)
		{
			String kleur = Colors[i];
			for(int j = 0; j < Cards.length; j++)
			{
				String Card = Cards[j];
				Deck[index] = kleur + Card;
				index++;
			}
		}
		for(int i = 0; i < 13; i++)
		{
			Player[i] = GiveCard();
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
	public String deelEnkeleKaart()
	{
		return Player[new Random().nextInt(Throw)];
	}
}