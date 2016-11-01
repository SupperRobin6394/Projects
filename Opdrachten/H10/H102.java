package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

/**
 * Created by Robin on 25-10-2016.
 */

public class H102 extends Applet
{
    TextField Text1;
    Label Label1;
    String s, cijfer;
    long Number1, Number2, Number3;
    public void init()
    {
        Text1 = new TextField("",30);
        Label1 = new Label("type een cijfer");
        Text1.addActionListener(new Action1());
        add(Label1);
        add(Text1);
    }
    public void paint(Graphics g)
    {
        g.drawString("Hoogste: "+Number1,20,40);
        g.drawString("Laagste: "+Number3,20,60);
    }
    class Action1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Number2 = Long.parseLong(Text1.getText());
            if(Number3 == 0)
            {
                Number3 = Number2;
            }
            if((Number2 > Number1))
            {
                Number1 = Number2;
                Text1.setText(null);
                repaint();
            }
            if((Number2 < Number1) && (Number2 < Number3))
            {
                Number3 = Number2;
                Text1.setText(null);
                repaint();
            }
        }
    }
}