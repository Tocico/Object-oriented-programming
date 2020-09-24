package lektion2.Bilfirman;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-23
 * Time: 09:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * <p>
 * Skapa nu en klass BilAnnons som ärver från FordonsAnnons. Den ska ha lite mer
 * * information, tex Färg, Sommardäck (J/N), Vinterdäck (J/N)
 */


public class BilAnnons extends FordonsAnnons implements Publishable, Revenuable {
    protected String färg;
    protected boolean sommardäck;
    protected boolean vinterdäck;

    BilAnnons(double pris, String rubrik, String beskrivning, int årsmodell, double antalmil, String färg, boolean sommardäck, boolean vinterdäck) {
        super(pris, rubrik, beskrivning, årsmodell, antalmil);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }

    public String getDäckInfo() {
        String txt;
        if(sommardäck == true && vinterdäck == true) txt = "Det finns båda sommardäck och vinterdäck. ";
        else if(sommardäck == true) txt = "Det finns sommardäck. ";
        else if(vinterdäck == true) txt = "Det finns vinterdäck. ";
        else txt = "";

        return txt;
    }

  /*  public void getAnnonsTxt() {
        System.out.println(getRubrik() + " Årsmodell " + getÅrsmodell() + ", " + färg + ". " + getDäckInfo() + getAntalmil() + " mil " + getPris() + " kr,\n" +
                getBeskrivning());
    }*/

    public void PrintHeader() {
        System.out.println(getRubrik() + ", " + getPris() + "kr");
    }

    public void PrintCompleteAd() {
        System.out.println(getRubrik() + " Årsmodell " + getÅrsmodell() + ", " + färg + ". " + getDäckInfo() + getAntalmil() + " mil " + getPris() + " kr,\n" +
                getBeskrivning());
    }

    public void calculateRevenue() {
        double newPrice = getPris() * 0.75;
        System.out.println("Tjänar " + newPrice + " kr på bilen");
    }
}
