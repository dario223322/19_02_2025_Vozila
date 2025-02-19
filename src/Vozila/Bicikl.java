package Vozila;

public class Bicikl extends Vozilo {
    private String vrsta;

    public Bicikl(String marka, double brzina, String vrsta) {
        super(marka, brzina);
        this.vrsta = vrsta;
    }

    @Override
    public void kretanje() {
        System.out.println("Bicikl " + getMarka() + vrsta + " se kreće brzinom " + getBrzina() + " km/h.");

    }
}
