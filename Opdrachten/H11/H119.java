package H11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H119 extends Applet
{
    public void init()
	{
        setBackground(Color.blue);
        setSize(500,500);
    }
    public void paint(Graphics g)
	{
        int y = 50;
        int x = 50;
        int Width = 50;
        int Height = 50;
        Color White = Color.white;
        Color Black = Color.black;
        for (int Block = 0; Block < 8; Block++)
		{
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
		{
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
        {
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
		{
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
        {
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
		{
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
        {
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
        x = 50;
        y += Height;
        for (int Block = 0; Block < 8; Block++)
		{
            if (Block == 0 || Block == 2 || Block == 4 || Block == 6)
			{
                g.setColor(White);
                g.fillRect(x, y, Width, Height);
            }
			else
			{
                g.setColor(Black);
                g.fillRect(x, y, Width, Height);
            }
            x += Width;
        }
    }
}
