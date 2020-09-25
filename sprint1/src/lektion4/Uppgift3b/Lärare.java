package lektion4.Uppgift3b;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:35
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Lärare extends Person {
    protected List<Kurs> kurser = new ArrayList<>();

    Lärare(String name, String personnummer) {
        super(name,personnummer);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void addKurser(Kurs kurs) {
        kurser.add(kurs);
    }
}
