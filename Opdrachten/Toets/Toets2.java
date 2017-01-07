package Toets;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Toets2 extends Applet {
    private final Image[] FruitImage = new Image[20];
    private final int[] ImageNumber = new int[3];
    private Button PlayButton, BuyButton;
    private String WinString, creditString;
    private int Credit, Play = 1;
    private AudioClip WinSound, PlaySound;

    public void init() {
        Play = 0;
        PlayButton = new Button("Play!");
        BuyButton = new Button("Buy 10 more credits");
        PlayButton.addActionListener(new PlayButtonListener());
        BuyButton.addActionListener(new BuyButtonListener());
        add(PlayButton);
        add(BuyButton);
        BuyButton.setEnabled(false);
        PlayButton.setEnabled(true);
        URL soundPath = Toets2.class.getResource("Sound/");
        WinSound = getAudioClip(soundPath, "Win.wav");
        PlaySound = getAudioClip(soundPath, "Play.wav");
        URL Path = Toets2.class.getResource("Img/");
        for (int i = 0; i < FruitImage.length; i++) {
            FruitImage[i] = getImage(Path, "fruit_" + (i + 1) + ".jpg");
        }
        setSize(500, 500);
        Credit = 10;
        WinString = " ";
    }

    public void paint(Graphics g) {
        WinSound.stop();
        PlaySound.stop();
        WinString = " ";
        int X = 100;
        int Y = 200;
        int j;
        for (int i = 0; i < 3; i++) {
            j = (int) (Math.random() * 20);
            g.drawImage(FruitImage[j], X, Y, this);
            ImageNumber[i] = j;
            X += 70;
        }
        if (Play == 1) {
            Credit -= 1;
            if ((ImageNumber[0] == ImageNumber[1]) && (ImageNumber[0] == ImageNumber[2])) {
                WinString = "You've won 20 credits!";
                Credit += 20;
                WinSound.play();
            } else if ((ImageNumber[0] == ImageNumber[1]) || (ImageNumber[1] == ImageNumber[2]) || (ImageNumber[0] == ImageNumber[2])) {
                WinString = "You've won 4 credits!";
                Credit += 4;
                WinSound.play();
            }
            if (Credit <= 1) {
                BuyButton.setEnabled(true);
                PlayButton.setEnabled(false);
            } else {
                BuyButton.setEnabled(false);
                PlayButton.setEnabled(true);
            }
            PlaySound.play();
        }
        g.drawString(WinString, 50, 25);
        creditString = "Credits: " + Credit;
        g.drawString(creditString, 50, 50);
    }

    private class PlayButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Play = 1;
            repaint();
        }
    }

    private class BuyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Credit += 10;
            BuyButton.setEnabled(false);
            PlayButton.setEnabled(true);
            repaint();
        }
    }
}