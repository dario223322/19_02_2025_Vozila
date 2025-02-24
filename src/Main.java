

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ucilicaa u = new Ucilicaa();


        Krug krug1 = new Krug("Mali", 4);
        Trokut trokut1 = new Trokut("plavi", 4, 7, 8);
        Pravokutnik prav1 = new Pravokutnik("Manji", 3, 5);


        u.getLikovi().add(trokut1);
        u.getLikovi().add(prav1);
        u.getLikovi().add(krug1);
        u.getLikovi().add(new Krug("Veliki", 15));
        u.getLikovi().add(new Trokut("Žuti", 8, 49, 55));
        u.getLikovi().add(new Pravokutnik("Veći", 15, 19));

        for (GeometrijskiLik popisLikova : u.getLikovi()) {
            System.out.println();
            System.out.println(popisLikova);
        }
    }
}