package lektion2.Bilfirman;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-23
 * Time: 09:19
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * Extrauppgift: Bilfirman
 * • Vi ska skapa en grund för att hålla reda på vilka fordon som ska listas på Hederlige
 * Harrys Bilar AB:s webbsajt
 * • Vi börjar med FordonsAnnons. Alla fordon bör ha ett pris, en rubrik, en beskrivning,
 * årsmodell, antalmil etc etc Dessutom ska vi ha en funktion string GetAnnonsText() som ska generera själva annonstexten som ska visas, tex en grym Volvo 240 Årsmodell 1981,
 * Röd, 49000 mil 249000 kr En perfekt bil för den händige till ett fantastiskt pris.
 * • Skapa nu en klass BilAnnons som ärver från FordonsAnnons. Den ska ha lite mer
 * information, tex Färg, Sommardäck (J/N), Vinterdäck (J/N)
 * • Skapa nu en klass HusvagnsAnnons som ärver från FordonsAnnons. Den ska ha lite mer
 * information, tex Dusch J/N, Antal bäddar etc
 * • Och sist en klass MotorCykelAnnons som också ärver från FordonsAnnons. Den kan ha
 * Motorvolym (ex 800 cm3), Drivtyp (kardan/kedja)
 * • Gör override på GetAnnonsText() och se till att det blir ”snygga” annonser för respektive
 * typ.
 * • Skapa upp några annonser och skriv ut!
 */


abstract class FordonsAnnons {
    private double pris;
    private String rubrik;
    private String beskrivning;
    private int årsmodell;
    private double antalmil;

    FordonsAnnons(double pris, String rubrik, String beskrivning, int årsmodell, double antalmil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsmodell = årsmodell;
        this.antalmil = antalmil;
    }

    public double getPris() {
        return pris;
    }

    public String getRubrik() {
        return rubrik;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public double getAntalmil() {
        return antalmil;
    }

    //abstract void getAnnonsTxt();
}
