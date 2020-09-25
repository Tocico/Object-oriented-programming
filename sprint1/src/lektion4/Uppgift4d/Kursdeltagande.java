package lektion4.Uppgift4d;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 16:17
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Kursdeltagande {

    protected Student student;
    protected Kurs kurs;

    Kursdeltagande(Student student, Kurs kurs) {
        this.student = student;
        this.kurs = kurs;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
