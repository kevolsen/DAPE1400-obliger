package oblig3;

import javax.swing.*;

public class TestUnikeTall {
    public static void main(String[] args) {
        try {
            int lengde = Integer.parseInt(
                    JOptionPane.showInputDialog("Hvor mange tall vil du generere? (maks 900)")
            );

            if (lengde < 1 || lengde > 900) {
                JOptionPane.showMessageDialog(null, "Antall må være mellom 1 og 900!");
                return;
            }

            UnikeTall ut = new UnikeTall(lengde);
            ut.fyllArray();
            ut.visInformasjon();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Du må skrive inn et gyldig heltall.");
        }
    }
}