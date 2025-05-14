package oblig1;

import javax.swing.*;

public class Oblig1Oppgave2 {

    public static void main(String[] args) {
        // Variabler for vare 1
        String navn1 = JOptionPane.showInputDialog("Skriv inn navn for vare 1:");
        int antall1;
        double pris1;

        try {
            antall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall for vare 1:"));
            pris1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris for vare 1:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ugyldig antall eller pris for vare 1!");
            return;
        }

        // Variabler for vare 2
        String navn2 = JOptionPane.showInputDialog("Skriv inn navn for vare 2:");
        int antall2;
        double pris2;

        try {
            antall2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall for vare 2:"));
            pris2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris for vare 2:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ugyldig antall eller pris for vare 2!");
            return;
        }

        // Opprett objektene
        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        // Beregn totalpris
        double totalPris = vare1.beregnTotalPris() + vare2.beregnTotalPris();

        // Skriv ut
        System.out.println("Totalprisen ble : " + totalPris + " kr");
    }
}