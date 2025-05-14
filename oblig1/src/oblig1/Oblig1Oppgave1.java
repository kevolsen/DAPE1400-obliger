package oblig1;

public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        double radius = 23.5;

        double areal = Sirkel.beregnAreal(radius);
        double omkrets = Sirkel.beregnOmkrets(radius);
        double diameter = Sirkel.beregnDiameter(radius);

        System.out.println("Arealet av sirkelen med radius " + radius + " er " + String.format("%.2f", areal));
        System.out.println("Omkretsen av sirkelen med radius " + radius + " er " + String.format("%.2f", omkrets));
        System.out.println("Diameteren til sirkelen er med radius " + radius + " er " + String.format("%.2f", diameter));
    }
}