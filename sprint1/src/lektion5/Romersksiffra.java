package lektion5;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-29
 * Time: 10:23
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * <p>
 * * • De romerska siffrorna anges med bokstäverna I, V, X, L, C, D och M
 * * som står för 1, 5, 10, 50, 100, 500 resp. 1000.
 * * • Deklarera en uppräkningstyp Romersksiffra som innehåller
 * * uppräkningsvärdena I, V, X, L, C, D och M. För varje uppräkningsvärde
 * * ska det finnas en instansvariabel som innehåller motsvarande
 * * siffervärde.
 * * • I ditt huvudprogram, iterera över konstanterna i uppräkningen och
 * * skriv ut vad varje romersk siffra har för värde.
 */


public enum Romersksiffra {
    I(1, "One"), V(5, "Five"), X(10 , "Ten"), L(50, "Fifty"), C(100, "Hundred"), D(500, "Five hundred"), M(1000, "One thousand");

    protected final Integer romersksiffra;
    protected final String romerskString;

    Romersksiffra(int romersksiffra, String romerskString) {
        this.romersksiffra = romersksiffra;
        this.romerskString = romerskString;
    }

}
