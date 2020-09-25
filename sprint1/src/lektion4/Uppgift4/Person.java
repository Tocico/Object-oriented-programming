package lektion4.Uppgift4;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:34
 * Project: Arv och Array
 * Copyright: MIT

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
