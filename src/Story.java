import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;


public class Story extends Spiel {
    public static void Introduction() {

        try {
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder\\zimmernacht2.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        textPanel.removeAll();
        textPanel.repaint();
        textPanel.setVisible(false);

        startButtonPanel.removeAll();
        startButtonPanel.repaint();
        startButtonPanel.setVisible(false);
        exitButtonPanel.removeAll();
        exitButtonPanel.repaint();
        exitButtonPanel.setVisible(false);
        settingsButtonPanel.removeAll();
        settingsButtonPanel.repaint();
        settingsButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(20, 250, 1200, 290);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea(Text.text_prolog);
        mainTextArea.setBounds(20, 250, 1200, 1300);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        weiterButtonPanel = new JPanel(); // Weiter-Button Panel
        weiterButtonPanel.setBounds(600, 600, 80, 33);
        weiterButtonPanel.setBackground(Color.black);

        weiterButton = new JButton("Weiter"); // Weiter-Button
        weiterButton.setBackground(Color.black);
        weiterButton.setForeground(Color.white);

        weiterButtonPanel.add(weiterButton);
        con.add(weiterButtonPanel);
        mainTextArea.setEditable(false);

        weiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Szene_2();
            }
        });

    }

    public static void Szene_2() {

        textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene2.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.pack();
        f.setVisible(true);
        f.setSize(1280, 800);
        f.getContentPane().setBackground(Color.black);
        f.setLayout(null);
        f.setVisible(true);
        con = f.getContentPane();

        weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        mainTextArea.setVisible(false);
        mainTextPanel.setVisible(false);

        SzeneWeiterButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneWeiterButtonPanel.setBounds(600, 725, 100, 40);
        SzeneWeiterButtonPanel.setBackground(Color.black);

        SzeneWeiterButton = new JButton("Weiter"); // Weiter-Button
        SzeneWeiterButton.setBackground(Color.black);
        SzeneWeiterButton.setForeground(Color.white);
        SzeneWeiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Szene3();
            }
        });
        SzeneWeiterButtonPanel.add(SzeneWeiterButton);
        con.add(SzeneWeiterButtonPanel);

        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(textArea);

        comment = Text.text_szene2;
        timer.start();
        szene2area.setEditable(false);

        JLabel monitor;

        monitor = new JLabel();
        monitor.setBounds(490,160,150,130);
        // monitor.setBackground(Color.red);
        monitor.setOpaque(false);
        monitor.setVisible(true);
        con.add(monitor);
        monitor.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Extras.Szene2_Monitor();
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

        JLabel tisch;

        tisch = new JLabel();
        tisch.setBounds(300,400,280,130);
        tisch.setBackground(Color.red);
        tisch.setOpaque(false);
        tisch.setVisible(true);
        con.add(tisch);
        tisch.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Extras.Szene2_Tisch();
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
    public static void Szene3() {

        textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene3.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.pack();
        f.setVisible(true);
        f.setSize(1280, 800);
        f.getContentPane().setBackground(Color.black);
        f.setLayout(null);
        f.setVisible(true);
        con = f.getContentPane();

        weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        mainTextArea.setVisible(false);
        mainTextPanel.setVisible(false);

        SzeneWeiterButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneWeiterButtonPanel.setBounds(600, 725, 100, 40);
        SzeneWeiterButtonPanel.setBackground(Color.black);

        SzeneWeiterButton = new JButton("Weiter"); // Weiter-Button
        SzeneWeiterButton.setBackground(Color.black);
        SzeneWeiterButton.setForeground(Color.white);
        SzeneWeiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Szene4();
            }
        });
        SzeneWeiterButtonPanel.add(SzeneWeiterButton);
        con.add(SzeneWeiterButtonPanel);

        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(textArea);

        comment = Text.text_szene3;
        timer.start();
        szene2area.setEditable(false);

    }
    public static void Szene4() {

        textArea.setText(""); // Textarea Leeren

        try {   // Hintergrund ändern
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Bilder/szene4.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.pack();
        f.setVisible(true);
        f.setSize(1280, 800);
        f.getContentPane().setBackground(Color.black);
        f.setLayout(null);
        f.setVisible(true);
        con = f.getContentPane();

        weiterButton.setVisible(false);                 // Weiterbutton von vorherige Szene ausblenden
        textPanel.setVisible(false);                    // Text Panel von vorherige Szene ausblenden
        mainTextArea.setVisible(false);
        mainTextPanel.setVisible(false);

        SzeneWeiterButtonPanel = new JPanel(); // Weiter-Button Panel
        SzeneWeiterButtonPanel.setBounds(600, 725, 100, 40);
        SzeneWeiterButtonPanel.setBackground(Color.black);

        SzeneWeiterButton = new JButton("Weiter"); // Weiter-Button
        SzeneWeiterButton.setBackground(Color.black);
        SzeneWeiterButton.setForeground(Color.white);
        SzeneWeiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Szene5();
            }
        });
        SzeneWeiterButtonPanel.add(SzeneWeiterButton);
        con.add(SzeneWeiterButtonPanel);

        JPanel szene2panel = new JPanel();
        szene2panel.setBounds(0, 610, 1280, 150);
        szene2panel.setBackground(Color.black);
        f.add(szene2panel);

        JTextArea szene2area = new JTextArea(); // Untertiteln
        szene2area.setBounds(0, 710, 950, 120);
        szene2area.setBackground(Color.black);
        szene2area.setForeground(Color.white);
        szene2area.setFont(normalFont);
        szene2area.setLineWrap(false);
        szene2area.setWrapStyleWord(true);
        szene2panel.add(textArea);

        comment = Text.text_szene4;
        timer.start();
        szene2area.setEditable(false);

        JLabel door_links;

        door_links = new JLabel();
        door_links.setBounds(100,180,280,500);
        // door_links.setBackground(Color.red);
        door_links.setOpaque(false);
        door_links.setVisible(true);
        con.add(door_links);
        door_links.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (schluessel_right == true) {
                    Extras.Szene4_doorleft();
                }
                else {
                    textArea.setText("");
                    timer.start();
                    comment = Text.keynotfound;
                }
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



        JLabel door_rechts;

        door_rechts = new JLabel();
        door_rechts.setBounds(850,180,280,500);
        // door_rechts.setBackground(Color.red);
        door_rechts.setOpaque(false);
        door_rechts.setVisible(true);
        con.add(door_rechts);
        door_rechts.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Extras.Szene4_doorright();
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

        JLabel aufzug;

        aufzug = new JLabel();
        aufzug.setBounds(550,100,140,500);
        // aufzug.setBackground(Color.red);
        aufzug.setOpaque(false);
        aufzug.setVisible(true);
        con.add(aufzug);
        aufzug.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Szene5();
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

        JButton backtoroom;
        JPanel backtoroomBtnPanel;

        backtoroomBtnPanel = new JPanel();
        backtoroomBtnPanel.setBounds(30,30,160,35);
        backtoroomBtnPanel.setBackground(Color.black);
        f.add(backtoroomBtnPanel);

        backtoroom = new JButton("Zurück ins Zimmer");
        backtoroom.setBackground(Color.black);
        backtoroom.setForeground(Color.white);
        backtoroom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Szene_2();
                textArea.setText("");
                timer.start();
                comment = "Vielleicht finde ich noch etwas in diesem Zimmer";
            }
        });

        backtoroomBtnPanel.add(backtoroom);
        con.add(backtoroomBtnPanel);



    }



    public static void Szene5() {

    }
}

