package oblig2;
import javax.swing.*;

public class oblig2oppgave1 {
    public static void main(String[] args) {
        int nedreGrense = 0;
        int ovreGrense = 0;
        boolean gyldigeGrenser = false;

        while (!gyldigeGrenser) {
            try {
                nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn minste tall:"));
                ovreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn største tall:"));

                if (ovreGrense <= nedreGrense) {
                    JOptionPane.showMessageDialog(null, "Øvre grense må være større enn nedre grense.");
                } else {
                    gyldigeGrenser = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Du må skrive inn gyldige heltall.");
            }
        }

        int sum = 0;
        int teller = 0;
        StringBuilder resultat = new StringBuilder();

        for (int i = nedreGrense; i <= ovreGrense; i++) {
            sum += i;
            resultat.append(i);

            if (i < ovreGrense) {
                resultat.append(" + ");
            } else {
                resultat.append(" = ").append(sum);
            }

            teller++;
            if (teller % 10 == 0) {
                resultat.append("\n");
            }
        }

        System.out.println(resultat);
    }
}