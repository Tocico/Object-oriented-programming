package lektion2.Bilfirman;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-23
 * Time: 09:56
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * Och sist en klass MotorCykelAnnons som också ärver från FordonsAnnons. Den kan ha
 * Motorvolym (ex 800 cm3), Drivtyp (kardan/kedja)
 */


public class MotorCykelAnnons extends FordonsAnnons implements Publishable, Revenuable{
    protected int motorvolym;
    protected String drivtyp;

    MotorCykelAnnons(double pris, String rubrik, String beskrivning, int årsmodell, double antalmil, int motorvolym, String drivtyp) {
        super(pris, rubrik, beskrivning, årsmodell, antalmil);
        this.motorvolym = motorvolym;
        this.drivtyp = drivtyp;
    }

    public void PrintHeader() {
        System.out.println(getRubrik() + ", " + getPris() + "kr");
    }

    public void PrintCompleteAd() {
        System.out.println(getRubrik() + " Årsmodell " + getÅrsmodell() + ", " + motorvolym + " cm3, " + drivtyp + ", " + getAntalmil() + " mil " + getPris() + " kr,\n" +
                getBeskrivning());
    }

    public void calculateRevenue() {
        double newPrice = getPris() * 0.75 * 0.90;
        System.out.println("Tjänar " + newPrice + " kr på motor cyckel");
    }

}
