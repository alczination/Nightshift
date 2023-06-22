import javax.swing.*;
import java.awt.*;

public class QuickEvents {

    public static void doorrechts_items() {

        if (Spiel.schluessel_right == true) {
            Extras.foundkey.setText("Schlussel schon gefunden!");
        }

        Spiel.schluessel_right = true;
        Extras.foundkey.setVisible(true);

    }
    public static void doorrechts_itemsexit() {

        Extras.foundkey.setVisible(false);

    }
    public static void doorrechts_fight() {


        Extras.warning.setBounds(275,150,800,50);
        Extras.warning.setBackground(Color.black);
        Extras.warning.setForeground(Color.white);
        Extras.warning.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        Extras.warning.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        Extras.warning.setOpaque(true);
        Extras.warning.setVisible(true);
        Spiel.con.add(Extras.warning);






    }

}
