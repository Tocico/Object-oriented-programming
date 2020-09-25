package lektion4.Uppgift3d;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 13:56
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Deltagande {
    protected Student student;
    protected Kurs kurs;

    Deltagande(Student student, Kurs kurs) {
        this.student = student;
        this.kurs = kurs;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
