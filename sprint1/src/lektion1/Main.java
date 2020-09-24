package lektion1;

/**
 * • Konstruera en klass demo.Person. En person ska ha ett namn, adress och
 * ålder. Utforma en konstruktor och några lämpliga metoder för demo.Person.
 * • Konstruera en klass demo.Bilägare som ärver demo.Person.
 * • Konstruera en klass demo.Bil med registreringsnummer, modell och märke.
 * En bil ska ha en demo.Bilägare. Konstruera metoder som anropas när man
 * köper eller säljer en bil (alltså byter bilägare).
 * • (Du behöver inte konstruera ett huvudprogram i detta stadium, det
 * kommer senare)
 *
 * • Gå igenom din lösning och fundera på om den följer Best Practices för
 * inkapsling. Lägg till paket och public/private/protected för
 * klasser/instansvariabler/instansmetoder för bästa möjliga inkapsling
 *
 * • Lägg till ett huvudprogram som skapar upp några bilar och bilägare.
 * Låt bilägarna köpa och sälja ett par bilar i programmet. Skriv, till sist,
 * ut alla bilägarna samt vilka bilar de (eventuellt) äger.
 *
 *
 */

public class Main {
    private static void printBil(Bil bil){
        if (bil.getBilägare() == null){
            System.out.println("Bilen med regNummer" + bil.getRegNummer() + " har ingen ägare");
        }
        else {
            System.out.println("Bilen med regNummer " + bil.getRegNummer() + " är av typen "
                    + bil.getSort() + " och ägs av "+ bil.getBilägare().getName());
        }
    }

    public static void main(String[] args) {
	// write your code here
        Bilägare bilägare = new Bilägare("Toshiko", "Elin Falksgata2", 31);
        Bil toyota = new Bil(12345, "123-5", "Toyota");
        Bilägare bilägare2 = new Bilägare("Taeko", "Japan", 29);
        Bil honda = new Bil(6789, "123-3", "Honda");

        toyota.ägsAv(bilägare);
        printBil(toyota);

        honda.ägsAv(bilägare2);
        honda.såld();
        printBil(honda);

    }
}
