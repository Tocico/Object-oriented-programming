package lektion4.Uppgift3;


/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:35
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Student extends Person{
    protected Kurs[] kurser;
    int countKurs = 0;

    Student(String name, String personnummer) {
        super(name, personnummer);
    }

    public void addKurs(Kurs kurs) {
       kurser[countKurs++] = kurs;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Kurs[] getKurs() {
        return kurser;
    }
}
