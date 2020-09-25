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


public class Student extends Person {
    protected List<Kurs> kurser = new ArrayList<>();

    Student(String name, String personnummer) {
        super(name, personnummer);
    }

    public void addKurs(Kurs kurs) {
       kurser.add(kurs);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public List<Kurs> getKurser() {
        return kurser;
    }
}
