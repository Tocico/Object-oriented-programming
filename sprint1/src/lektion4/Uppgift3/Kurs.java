package lektion4.Uppgift3;


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
    protected Student[] studenter = new Student[40];
    int countStudent = 0;

    Kurs(String kursName) {
        this.kursName = kursName;
    }

    public String getKursName() {
        return kursName;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void addStudent(Student student) {
        studenter[countStudent++] = student;
    }

    public void addLärare(Lärare lärare) {
        this.lärare = lärare;
    }
}
