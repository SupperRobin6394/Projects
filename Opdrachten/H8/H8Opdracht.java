package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by Robin on 04-10-16.
 */

public class H8Opdracht extends Applet
{
    TextField TextField1;
    TextField TextField2;
    TextField TextField3;
    Button Devide;
    Button ActionMultiplyiply;
    Button Withdraw;
    Button Add;
    Button Reset;
    double Value1;
    double Value2;
    double Value3;
    public void init()
    {
		this.setSize(500, 500);
		setBackground(Color.white);
        TextField1 = new TextField(10);
        TextField2 = new TextField(10);
        TextField3 = new TextField(10);
        Reset = new Button();
        Devide = new Button();
        ActionMultiplyiply = new Button();
        Add = new Button();
        Withdraw = new Button();
        Reset.setLabel("ActionReset");
        Devide.setLabel("/");
        ActionMultiplyiply.setLabel("*");
        Add.setLabel("+");
        Withdraw.setLabel("-");
        listen1 ActionWithdraw = new listen1();
        listen2 ActionAdd = new listen2();
        listen3 ActionDevide = new listen3();
        listen4 ActionMultiply = new listen4();
        listen5 ActionReset = new listen5();
        Add.addActionListener(ActionAdd);
        Withdraw.addActionListener(ActionWithdraw);
        Devide.addActionListener(ActionDevide);
        ActionMultiplyiply.addActionListener(ActionMultiply);
        Reset.addActionListener(ActionReset);
        add(TextField1);
        add(TextField2);
        add(TextField3);
        add(Reset);
        add(Add);
        add(Withdraw);
        add(ActionMultiplyiply);
        add(Devide);
    }
    class listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            Value1 = Double.parseDouble(TextField1.getText());
            Value2 = Double.parseDouble(TextField2.getText());
            Value3 = Value1-Value2;
            TextField1.setText(null);
            TextField2.setText(null);
            TextField3.setText(String.valueOf(Value3));
            repaint();
        }
    }
    class listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            Value1 = Double.parseDouble(TextField1.getText());
            Value2 = Double.parseDouble(TextField2.getText());
            Value3 = Value1+Value2;
            TextField1.setText(null);
            TextField2.setText(null);
            TextField3.setText(String.valueOf(Value3));
            repaint();
        }
    }
    class listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            Value1 = Double.parseDouble(TextField1.getText());
            Value2 = Double.parseDouble(TextField2.getText());
            Value3 = Value1/Value2;
            TextField1.setText(null);
            TextField2.setText(null);
            TextField3.setText(String.valueOf(Value3));
            repaint();
        }
    }
    class listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            Value1 = Double.parseDouble(TextField1.getText());
            Value2 = Double.parseDouble(TextField2.getText());
            Value3 = Value1*Value2;
            TextField1.setText(null);
            TextField2.setText(null);
            TextField3.setText(String.valueOf(Value3));
            repaint();
        }
    }
    class listen5 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            TextField1.setText(null);
            TextField2.setText(null);
            TextField3.setText(null);
            repaint();
        }
    }
}