// Alan Rytwinski - Nightshift

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Spiel {

    public static void main(String[] args) {
        Spiel spiel = new Spiel();
    }
        // Spiel-Progress
        public static int lvl_angst = 0;

        // Gegenstände
        public static boolean schluessel_right = false;

        // JavaFX Elemente initialisieren
        static JFrame window, image;
        static JButton startButton, exitButton, weiterButton, zurueckButton, SzeneWeiterButton, settingsButton;
        static JPanel titleNamePanel, textPanel, startButtonPanel, exitButtonPanel, mainTextPanel, textSample, weiterButtonPanel,
                zurueckButtonPanel, SzeneWeiterButtonPanel, settingsButtonPanel;
        static JLabel titleNameLabel;
        static JTextArea textArea, mainTextArea, textFach;
        static Container con;

        // Fonts (Schriftarten)
        static Font normalFont = new Font("Verdana", Font.PLAIN, 28);
        static Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);

        // Text-Buchstabieren Timer
        static String comment;
        static int i = 0;
        // Tempo-Untertiteln (default delay: 80)
        static Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char character[] = comment.toCharArray();
                int arrayNumber = character.length;

                String s = String.valueOf(character[i]);

                textArea.append(s);
                i++;

                if (i == arrayNumber) {
                    i = 0;
                    timer.stop();
                }
            }
        });

    public static JFrame f;

        // Constructor aufrufen
    public Spiel() {

        // Hintergrund
        f = new JFrame("Nightshift");

        try {
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/main_menu(crop).jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Fenster-Einstellungen
        f.pack();
        f.setVisible(true);
        f.setSize(1280, 800);
        f.getContentPane().setBackground(Color.black);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        con = f.getContentPane();


        // Untertiteln-Panel
        textPanel = new JPanel();
        textPanel.setBounds(25, 25, 1280, 50);
        textPanel.setBackground(Color.black);
        f.add(textPanel);

        // Untertiteln-Area
        textArea = new JTextArea();
        textArea.setBounds(300, 200, 1280, 60);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setFont(normalFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textPanel.add(textArea);

        startButtonPanel = new JPanel(); // Start-Button Panel
        startButtonPanel.setBounds(535, 400, 76, 33);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("Start"); // Start-Button
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Story.Introduction();
            }
        });

        exitButtonPanel = new JPanel(); // Exit-Button Panel
        exitButtonPanel.setBounds(700, 400, 76, 33);
        exitButtonPanel.setBackground(Color.black);

        exitButton = new JButton("Exit"); // Exit-Button
        exitButton.setBackground(Color.black);
        exitButton.setForeground(Color.white);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        settingsButton = new JButton("Einstellungen"); // Settings-Button
        settingsButton.setBackground(Color.black);
        settingsButton.setForeground(Color.white);
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Story.Szene_2();
            }
        });

        settingsButtonPanel = new JPanel(); // Exit-Button Panel
        settingsButtonPanel.setBounds(600, 450, 120, 33);
        settingsButtonPanel.setBackground(Color.black);

        startButtonPanel.add(startButton);
        exitButtonPanel.add(exitButton);
        settingsButtonPanel.add(settingsButton);
        con.add(startButtonPanel);
        con.add(exitButtonPanel);
        con.add(settingsButtonPanel);


        f.setVisible(true);
        textArea.setEditable(false);
        comment = "Nightshift - Die Geschichte des verlorenen Krankenhauses"; // Untertiteln-Text
        timer.start();


    }

}
