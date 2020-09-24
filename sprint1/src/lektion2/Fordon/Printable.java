package lektion2.Fordon;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-23
 * Time: 11:01
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * Skriv ett interface Printable och låt metoden printMe vara deklarerad
 * där. Låt sedan dina fordonsklasser implementera Printable.
 * • Gör en ny utskriftsmetod som skriver ut fordonens data genom att
 * anropa printMe via Printable-interfacet, istället för att direkt anropa
 * fordonsklassernas printMe-metod. Lägg till ett anrop till denna nya
 * metod från ditt huvudprogram.
 */


public interface Printable {
    void printMe();
}
