package lektion4.Uppgift4;

import java.util.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 15:26
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Kurstillfälle {
    protected Lärare lärare;
    protected Kurs kurs;
    protected List<Student> stundenter = new ArrayList<>();
    protected Date datum;

    Kurstillfälle(Kurs kurs, Date datum) {
        this.kurs = kurs;
        this.datum = datum;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public Date getDatum() {
        return datum;
    }

    public List<Student> getStundenter() {
        return stundenter;
    }

    public void addLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public void addStudent(Student student) {
        stundenter.add(student);
    }

    public void printKursTillfälle() {
        System.out.println("Kurs: " + kurs.getKursName() +
                "\nDatum: " + datum.toString() +
                "\nLärare: " + lärare.getName());

        for(Student student: stundenter) System.out.println("Stundent: " + student.getName());
    }
}
