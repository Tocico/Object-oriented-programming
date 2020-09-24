package lektion2.Bilfirman;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-23
 * Time: 10:22
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * • Istället för att GetAnnonsText ärvs från super-annons-klassen, skapa ett
 * interface, Publishable, som annonsklasserna får implementera
 * • Publishable innehåller 2 metoder:
 * • PrintHeader (ska printa rubrik och pris, typ: ”Fantastisk husbil, 25000 kr”)
 * • PrintCompleteAd (ska printa all info för en annons)
 * • (vi tänker oss att PrintHeader är den metod som anropas när vi vill lista alla fordon
 * på Hederlige Harrys hemsida, PrintCompleteAd är den som anropas när en
 * användare har klickat på en annons-header)
 * • Lägg till ytterligare ett interface, Revenuable, som innehåller en metod
 * calcuateRevenue som räknar ut hur mycket Harry kan tjäna på en annons
 * (förutsatt att nån köper). Vi måste dra av 25% av alla priser pga moms och
 * sen är det dessutom 10% rea på motorcyklar
 */


public class TestDemo {

    private void printAnnons(FordonsAnnons fordonsAnnons) {
        //fordonsAnnons.getAnnonsTxt();
    }

    private void printHeader(Publishable publishable) {
        publishable.PrintHeader();
    }

    private void printCompleteAd(Publishable publishable) {
        publishable.PrintCompleteAd();
    }

    private void printRevenuable(Revenuable revenuable) {
        revenuable.calculateRevenue();
    }

    TestDemo() {
        BilAnnons bil = new BilAnnons(40000, "en grym Volvo", "En perfekt bil för den händige till ett fantastiskt pris", 1988, 120000, "green", false, true);
        HusvagnsAnnons husvagn = new HusvagnsAnnons(90000, "en grym Toyota Husvagn", "En perfekt husvagn för familj", 2000, 90000, true,  2);
        MotorCykelAnnons motorCyckel = new MotorCykelAnnons(20000, "en grym Harley", "En snygg motor cyckel för ett billigt pris", 1990, 100000, 300,  "kardan");

       /* printAnnons(bil);
        printAnnons(husvagn);
        printAnnons(motorCyckel);*/

        System.out.println("--------------------Print header-----------------------");
        printHeader(bil);
        printHeader(husvagn);
        printHeader(motorCyckel);

        System.out.println("--------------------Print complete-----------------------");
        printCompleteAd(motorCyckel);
        printCompleteAd(bil);
        printCompleteAd(husvagn);

        System.out.println("--------------------Print hur mycket de tjänar på-------------------------");
        printRevenuable(bil);
        printRevenuable(motorCyckel);
        printRevenuable(husvagn);


    }

    public static void main(String[] args) {
        TestDemo testdemo = new TestDemo();
    }
}
