package lektion4.Uppgift3d;


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

    Kurs(String kursName) {
        this.kursName = kursName;
    }

    public String getKursName() {
        return kursName;
    }

    public Lärare getLärare() {
        return lärare;
    }


    public void addLärare(Lärare lärare) {
        this.lärare = lärare;
    }
}
