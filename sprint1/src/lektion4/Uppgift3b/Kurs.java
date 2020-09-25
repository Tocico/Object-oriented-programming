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


public class Kurs {
    protected String kursName;
    protected Lärare lärare;
    protected List<Student> studenter = new ArrayList<>();

    Kurs(String kursName) {
        this.kursName = kursName;
    }

    public String getKursName() {
        return kursName;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public List<Student> getStudenter() {
        return studenter;
    }

    public void addStudent(Student student) {
        studenter.add(student);
    }

    public void addLärare(Lärare lärare) {
        this.lärare = lärare;
    }
}
