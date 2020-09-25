package lektion4.Uppgift3b;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:34
 * Project: Arv och Array
 * Copyright: MIT
 * <p>
 * • Implementera klassdiagrammet på
 * bilden, skriv klasserna Person, Student,
 * Lärare och Kurs. Tänk på att:
 * • En Person har ett namn och
 * personnummer
 * • En lärare kan ge flera kurser
 * • En student kan gå flera kurser
 * • En kurs har flera studenter
 * • Gör ett huvudprogram där du skapar
 * upp några studenter, en lärare och en
 * kurs.
 * • Gör en funktion som skriver ut en
 * klasslista för din kurs med kursnamnet,
 * läraren och studenterna.
 * • Använd dig av arrayer.
 */


public class Person {
    private String name;
    private String personnummer;

    Person() {
    }

    Person(String name, String personnummer) {
        this.name = name;
        this.personnummer = personnummer;
    }

    public String getName() {
        return name;
    }

    public String getPersonnummer() {
        return personnummer;
    }
}
