package lektion2.Fordon;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-22
 * Time: 11:23
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * <p>
 * • Lägg till ett ytterligare interface “Hjulburen” som har metoden
 * getAntalHjul()
 * • Låt relevanta klasser implementera interfacet (lägg till instansvariabler
 * vid behov)
 * • Skapa upp några objekt av typen “Hjulburen” med olika
 * implementerande klasser och skriv ut antalet hjul för varje fordon.
 */


public class Print {

    private void printFordon(Fordon fordon) {
        fordon.printMe();
    }

    private void printInterface(Printable printable) {
        printable.printMe();
    }

    private void printAntalHjul(Hjulburen hjulburen) {
        hjulburen.getAntalHjul();
    }

    Print() {
        Bil bil = new Bil(500, 300, 50);
        Båt båt = new Båt(900, 200, 30);
        Cyckel cyckel = new Cyckel(80, 30, 10);
        Tåg tåg = new Tåg(1000, 500, 30);

        System.out.println("---------------Abstract--------------------");

        printFordon(bil);
        printFordon(båt);
        printFordon(cyckel);
        printFordon(tåg);

        System.out.println("-----------Interface Printable--------------");
        Printable tåg2 = new Tåg(800, 900, 26);

        printInterface(tåg2);

        System.out.println("--------------Interface Hjulburen------------------");
        Hjulburen bil2 = new Bil(800, 200, 20);
        Hjulburen cyckel2 = cyckel;
        printAntalHjul(bil2);
        printAntalHjul(cyckel2);

    }

    public static void main(String[] args) {
        Print print1 = new Print();
    }

}
