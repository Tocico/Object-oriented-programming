package lektion5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-29
 * Time: 10:22
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * • De romerska siffrorna anges med bokstäverna I, V, X, L, C, D och M
 * som står för 1, 5, 10, 50, 100, 500 resp. 1000.
 * • Deklarera en uppräkningstyp Romersksiffra som innehåller
 * uppräkningsvärdena I, V, X, L, C, D och M. För varje uppräkningsvärde
 * ska det finnas en instansvariabel som innehåller motsvarande
 * siffervärde.
 * • I ditt huvudprogram, iterera över konstanterna i uppräkningen och
 * skriv ut vad varje romersk siffra har för värde.
 */


public class EnumDemo {

    public static void main(String[] args) {
      /*  List<Romersksiffra> romersksiffraList = new ArrayList<>();
        romersksiffraList.add(Romersksiffra.I);
        romersksiffraList.add(Romersksiffra.V);
        romersksiffraList.add(Romersksiffra.X);
        romersksiffraList.add(Romersksiffra.L);
        romersksiffraList.add(Romersksiffra.C);
        romersksiffraList.add(Romersksiffra.D);
        romersksiffraList.add(Romersksiffra.M);*/

        for(Romersksiffra r : Romersksiffra.values())
            System.out.println(r + ": " + r.romersksiffra + "(" + r.romerskString + ")");
    }
}
