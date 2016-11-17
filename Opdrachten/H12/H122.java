package H12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Robin on 10/11/2016.
 */
 
public class H122 extends Applet
{
    Button[] buttons = new Button[25];
    public void init()
	{
        setSize(400, 200);
        for (int Counter = 0; Counter < buttons.length; Counter++)
		{
            buttons[Counter] = new Button("Button nr" + (Counter + 1));
            add(buttons[Counter]);
        }
    }
}
