package lektion4.Uppgift3;


/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:35
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Lärare extends Person{
    protected Kurs[] kurser;
    int kursCounter = 0;

    Lärare(String name, String personnummer) {
        super(name,personnummer);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void addKurser(Kurs kurs) {
        kurser[kursCounter++] = kurs;
    }
}
