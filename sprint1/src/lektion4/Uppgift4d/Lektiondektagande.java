package lektion4.Uppgift4d;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 16:19
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Lektiondektagande {

    protected Kurstillfälle ktf;
    protected Student student;

    Lektiondektagande(Kurstillfälle ktf, Student student) {
        System.out.println(ktf);
        this.ktf = ktf;
        this.student = student;
    }

    public Kurstillfälle getKtf() {
        return ktf;
    }

    public void setKtf(Kurstillfälle ktf) {
        this.ktf = ktf;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
