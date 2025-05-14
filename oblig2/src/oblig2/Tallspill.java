package oblig2;
import static javax.swing.JOptionPane.*;

public class Tallspill {

    public int nyttTall() {
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding) {
        showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        visMelding("Tallet " + tall + " er for lite, prøv igjen!");
    }

    private void forStort(int tall) {
        visMelding("Tallet " + tall + " er for stort, prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
        visMelding("Tallet " + gjetning + " er riktig!\nDu gjettet riktig på " + antall + " forsøk.");
    }

    private int lesGjetning() {
        while (true) {
            String input = showInputDialog("Hvilket tall tenker jeg på? Det er mellom 0 og 200.");
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                visMelding("Feil! Du må skrive et heltall.");
            }
        }
    }

    public void kjorSpill() {
        int fasit = nyttTall();
        int antall = 0;
        int gjetning;

        do {
            gjetning = lesGjetning();
            antall++;
            if (gjetning < fasit) {
                forLite(gjetning);
            } else if (gjetning > fasit) {
                forStort(gjetning);
            }
        } while (gjetning != fasit);

        avsluttRunde(antall, fasit);
    }
}