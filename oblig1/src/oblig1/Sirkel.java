package oblig1;

public class Sirkel {

    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double beregnDiameter(double radius) {
        return 2 * radius;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    public static double beregnOmkrets(double radius) {
        return 2 * Math.PI * radius;
    }

    // Statisk metode som beregner og returnerer sirkelens areal.
    public static double beregnAreal(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}