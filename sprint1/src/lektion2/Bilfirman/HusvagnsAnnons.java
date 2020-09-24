package lektion2.Bilfirman;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-23
 * Time: 09:46
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *  • Skapa nu en klass HusvagnsAnnons som ärver från FordonsAnnons. Den ska ha lite mer
 *  * information, tex Dusch J/N, Antal bäddar etc
 */


public class HusvagnsAnnons extends FordonsAnnons implements Publishable, Revenuable{
    protected boolean dusch;
    protected int antalBäddar;

    HusvagnsAnnons(double pris, String rubrik, String beskrivning, int årsmodell, double antalmil, boolean dusch, int antalBäddar) {
        super(pris, rubrik, beskrivning, årsmodell, antalmil);
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
    }

    public String getduschText() {
        String txt;
        if(dusch == true) txt = "Det finns dusch. ";
        else txt = "Det finns ingen dusch. ";

        return txt;
    }

    public void PrintHeader() {
        System.out.println(getRubrik() + ", " + getPris() + "kr");
    }

    public void PrintCompleteAd() {
        System.out.println(getRubrik() + " Årsmodell " + getÅrsmodell() + ", " + antalBäddar + " bäddar. " + getduschText() + getAntalmil() + " mil " + getPris() + " kr,\n" +
                getBeskrivning());
    }

    public void calculateRevenue() {
        double newPrice = getPris() * 0.75;
        System.out.println("Tjänar " + newPrice + " kr på husvagn");
    }

}
