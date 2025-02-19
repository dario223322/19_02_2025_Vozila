package Vozila;

public abstract class Vozilo {
    private String marka;
    private double brzina;

    public String getMarka() {
        return marka;
    }

    public double getBrzina() {
        return brzina;
    }

    public  Vozilo(String marka, double brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }
    public abstract void kretanje();
}
