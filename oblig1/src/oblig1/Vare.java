package oblig1;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        setAntall(antall);
        setPris(pris);
    }

    // Getters
    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }

    // Setters
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        } else {
            throw new IllegalArgumentException("Antall må være større enn 0");
        }
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        } else {
            throw new IllegalArgumentException("Pris må være større enn 0");
        }
    }

    // Metode for totalpris
    public double beregnTotalPris() {
        return pris * antall;
    }
}