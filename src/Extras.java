import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class Extras {

    public static JLabel foundkey = new JLabel("Schlüssel gefunden!", SwingConstants.CENTER);
    public static JLabel warning = new JLabel(Text.text_szene4doorrechts_dusche, SwingConstants.CENTER);

    public static JButton ja = new JButton("Ja");
    public static JButton nein = new JButton("Nein");

    public static void Szene2_Monitor()  {

        Spiel.textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            Spiel.f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene2monitor.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Spiel.f.pack();
        Spiel.f.setVisible(true);
        Spiel.f.setSize(1280, 800);
        Spiel.f.getContentPane().setBackground(Color.black);
        Spiel.f.setLayout(null);
        Spiel.f.setVisible(true);
        Spiel.con = Spiel.f.getContentPane();

        Spiel.weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        // textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        // mainTextArea.setVisible(false);
        // mainTextPanel.setVisible(false);

        JPanel SzeneBackButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneBackButtonPanel.setBounds(600, 725, 100, 40);
        SzeneBackButtonPanel.setBackground(Color.black);

        JButton SzeneBackButton = new JButton("Zurück"); // Weiter-Button
        SzeneBackButton.setBackground(Color.black);
        SzeneBackButton.setForeground(Color.white);
        SzeneBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spiel.textArea.setText("");
                Story.Szene_2();

            }
        });
        SzeneBackButtonPanel.add(SzeneBackButton);
        Spiel.con.add(SzeneBackButtonPanel);



        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        Spiel.f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(Spiel.normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(Spiel.textArea);

        Spiel.comment = Text.text_szene2monitor;
        Spiel.timer.start();
        szene2area.setEditable(false);

        JLabel monitor;

        monitor = new JLabel();
        monitor.setBounds(0,0,1280,650);
        // monitor.setBackground(Color.red);
        monitor.setOpaque(false);
        monitor.setVisible(true);
        Spiel.con.add(monitor);
        monitor.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Story.Szene_2();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }
    public static void Szene2_Tisch()  {

        Spiel.textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            Spiel.f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene2tisch.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Spiel.f.pack();
        Spiel.f.setVisible(true);
        Spiel.f.setSize(1280, 800);
        Spiel.f.getContentPane().setBackground(Color.black);
        Spiel.f.setLayout(null);
        Spiel.f.setVisible(true);
        Spiel.con = Spiel.f.getContentPane();

        Spiel.weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        // textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        // mainTextArea.setVisible(false);
        // mainTextPanel.setVisible(false);

        JPanel SzeneBackButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneBackButtonPanel.setBounds(600, 725, 100, 40);
        SzeneBackButtonPanel.setBackground(Color.black);

        JButton SzeneBackButton = new JButton("Zurück"); // Weiter-Button
        SzeneBackButton.setBackground(Color.black);
        SzeneBackButton.setForeground(Color.white);
        SzeneBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spiel.textArea.setText("");
                Story.Szene_2();

            }
        });
        SzeneBackButtonPanel.add(SzeneBackButton);
        Spiel.con.add(SzeneBackButtonPanel);



        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        Spiel.f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(Spiel.normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(Spiel.textArea);

        Spiel.comment = Text.text_szene2tisch;
        Spiel.timer.start();
        szene2area.setEditable(false);

        JLabel tisch = new JLabel();
        tisch.setBounds(0,0,1280,650);
        // tisch.setBackground(Color.red);
        tisch.setOpaque(false);
        tisch.setVisible(true);
        Spiel.con.add(tisch);
        tisch.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Story.Szene_2();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }
    public static void Szene4_doorleft() {

        Spiel.textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            Spiel.f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene4doorlinks.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Spiel.f.pack();
        Spiel.f.setVisible(true);
        Spiel.f.setSize(1280, 800);
        Spiel.f.getContentPane().setBackground(Color.black);
        Spiel.f.setLayout(null);
        Spiel.f.setVisible(true);
        Spiel.con = Spiel.f.getContentPane();

        Spiel.weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        // textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        // mainTextArea.setVisible(false);
        // mainTextPanel.setVisible(false);

        JPanel SzeneBackButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneBackButtonPanel.setBounds(600, 725, 100, 40);
        SzeneBackButtonPanel.setBackground(Color.black);

        JButton SzeneBackButton = new JButton("Zurück"); // Weiter-Button
        SzeneBackButton.setBackground(Color.black);
        SzeneBackButton.setForeground(Color.white);
        SzeneBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Story.Szene4();

            }
        });
        SzeneBackButtonPanel.add(SzeneBackButton);
        Spiel.con.add(SzeneBackButtonPanel);

        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        Spiel.f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(Spiel.normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(Spiel.textArea);

        Spiel.comment = Text.text_szene4doorlinks;
        Spiel.timer.start();
        szene2area.setEditable(false);

        JLabel tisch = new JLabel();
        tisch.setBounds(0,0,1280,650);
        // tisch.setBackground(Color.red);
        tisch.setOpaque(false);
        tisch.setVisible(true);
        Spiel.con.add(tisch);
        tisch.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Story.Szene4();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public static void Szene4_doorright() {
        Spiel.textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            Spiel.f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene4doorrechts.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Spiel.f.pack();
        Spiel.f.setVisible(true);
        Spiel.f.setSize(1280, 800);
        Spiel.f.getContentPane().setBackground(Color.black);
        Spiel.f.setLayout(null);
        Spiel.f.setVisible(true);
        Spiel.con = Spiel.f.getContentPane();

        Spiel.weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        // textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        // mainTextArea.setVisible(false);
        // mainTextPanel.setVisible(false);

        JPanel SzeneBackButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneBackButtonPanel.setBounds(600, 725, 100, 40);
        SzeneBackButtonPanel.setBackground(Color.black);

        JButton SzeneBackButton = new JButton("Zurück"); // Weiter-Button
        SzeneBackButton.setBackground(Color.black);
        SzeneBackButton.setForeground(Color.white);
        SzeneBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Story.Szene4();
                QuickEvents.doorrechts_itemsexit();
            }
        });
        SzeneBackButtonPanel.add(SzeneBackButton);
        Spiel.con.add(SzeneBackButtonPanel);

        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        Spiel.f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(Spiel.normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(Spiel.textArea);

        Spiel.comment = Text.text_szene4doorrechts;
        Spiel.timer.start();
        szene2area.setEditable(false);


        JLabel dusche = new JLabel();
        dusche.setBounds(0,0,350,600);
        dusche.setBackground(Color.red);
        dusche.setOpaque(false);
        dusche.setVisible(true);
        Spiel.con.add(dusche);
        dusche.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuickEvents.doorrechts_fight();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        foundkey.setBounds(530,500,250,50);
        foundkey.setBackground(Color.black);
        foundkey.setForeground(Color.white);
        foundkey.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        foundkey.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
        foundkey.setOpaque(true);
        foundkey.setVisible(false);
        Spiel.con.add(foundkey);



        JLabel tisch = new JLabel();
        tisch.setBounds(500,200,400,300);
        tisch.setBackground(Color.red);
        tisch.setOpaque(false);
        tisch.setVisible(true);
        Spiel.con.add(tisch);
        tisch.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                QuickEvents.doorrechts_items();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                QuickEvents.doorrechts_itemsexit();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



    }
}
