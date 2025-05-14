package oblig3;

import javax.swing.*;

public class UnikeTall {
    private int[] tall;

    public UnikeTall(int lengde) {
        tall = new int[lengde];
    }

    private boolean finnesFraFør(int verdi) {
        for (int i = 0; i < tall.length; i++) {
            if (tall[i] == verdi) {
                return true;
            }
        }
        return false;
    }

    public void fyllArray() {
        int i = 0;
        while (i < tall.length) {
            int tilfeldig = (int) (Math.random() * 900) + 100; // 100–999
            if (!finnesFraFør(tilfeldig)) {
                tall[i] = tilfeldig;
                i++;
            }
        }
    }

    private int finnMinste() {
        int minste = tall[0];
        for (int t : tall) {
            if (t < minste) {
                minste = t;
            }
        }
        return minste;
    }

    private int finnStørste() {
        int største = tall[0];
        for (int t : tall) {
            if (t > største) {
                største = t;
            }
        }
        return største;
    }

    private double finnGjennomsnitt() {
        int sum = 0;
        for (int t : tall) {
            sum += t;
        }
        return (double) sum / tall.length;
    }

    public void visInformasjon() {
        StringBuilder ut = new StringBuilder();
        for (int i = 0; i < tall.length; i++) {
            ut.append(tall[i]).append(" ");
            if ((i + 1) % 10 == 0) {
                ut.append("\n");
            }
        }

        int minste = finnMinste();
        int største = finnStørste();
        String gjennomsnitt = String.format("%.1f", finnGjennomsnitt());

        ut.append("\n\nMinste tall: ").append(minste)
                .append("\nStørste tall: ").append(største)
                .append("\nGjennomsnitt: ").append(gjennomsnitt);

        JOptionPane.showMessageDialog(null, ut.toString());
    }
}
