package lektion1;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-21
 * Time: 10:10
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * Konstruera en klass demo.Bil med registreringsnummer, modell och märke.
 * * En bil ska ha en demo.Bilägare. Konstruera metoder som anropas när man
 * * köper eller säljer en bil (alltså byter bilägare).
 */


public class Bil {
    private int registreringsnummer;
    private String modell;
    private String märke;
    private Bilägare bilägare;

    public Bil(int registreringsnummer, String modell, String märke) {
        this.registreringsnummer = registreringsnummer;
        this.modell = modell;
        this.märke = märke;
    }

    public void ägsAv(Bilägare nyeÄgaren) {
        bilägare = nyeÄgaren;
    }

    public void såld() {
        bilägare = null;
    }

    public Bilägare getBilägare() {
        return bilägare;
    }

    public int getRegNummer() {
        return registreringsnummer;
    }

    public String getSort() {
        return märke;
    }

}
