package lektion4.Uppgift4d;


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
    protected List<Lärare> lärare;
    protected List<Kurstillfälle> kurstillfälle = new ArrayList<>();

    Kurs(String kursName) {

        this.kursName = kursName;
    }

    Kurs(String kursName, List<Lärare> lärare) {
        this.kursName = kursName;
        this.lärare = lärare;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public List<Lärare> getLärare() {
        return lärare;
    }

    public void setLärare(List<Lärare> lärare) {
        this.lärare = lärare;
    }

    public void addKursTillfälle(Kurstillfälle kursTillfälle) {
        kurstillfälle.add(kursTillfälle);
    }
}
