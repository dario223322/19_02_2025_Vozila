package Vozila;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Automobil aut1 = new Automobil("Audi", 160, 5);
        Bicikl bic1 = new Bicikl("Giant", 25, "planinski");

        ArrayList<Vozilo> vozila = new ArrayList<>();
        vozila.add(aut1);
        vozila.add(bic1);
        for (Vozilo limari : vozila) {
            System.out.println();
            limari.kretanje();
        }
    }
}
