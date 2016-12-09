package H4;

/**
 * Created by Robin on 20/09/2016.
 */

import java.applet.Applet;
import java.awt.*;

public class H43 extends Applet {
    public void init() {
        this.setSize(500, 500);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        Color FlagRed = new Color(174, 28, 40);
        Color FlagWhite = new Color(255, 255, 255);
        Color FlagBlue = new Color(33, 70, 139);
        g.drawRect(100, 100, 150, 99);
        g.drawLine(100, 100, 100, 300);
        g.setColor(FlagRed);
        g.fillRect(100, 100, 150, 33);
        g.setColor(FlagWhite);
        g.fillRect(100, 133, 150, 33);
        g.setColor(FlagBlue);
        g.fillRect(100, 166, 150, 33);
    }
}