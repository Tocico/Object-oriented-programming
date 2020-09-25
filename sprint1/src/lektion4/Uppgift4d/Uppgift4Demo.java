package lektion4.Uppgift4d;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * • Skriv en printningsfunktion som tar en Student som inparameter,
 * funktionen skriver ut Studentens namn och alla kurser som hen går
 * • Skriv en printningsfunktion som tar en Kurs som inparameter,
 * funktionen skriver ut Kursens namn och alla studenter går där.
 * • Skriv en jätteprintfunktion som skriver ut alla studenter och efter
 * varje student listar de kurser den studenten går.
 */


public class Uppgift4Demo {



    Uppgift4Demo() {
        Student s1 = new Student("Toshiko", "1234566");
        Student s2 = new Student("Taeko", "34656456");
        Student s3 = new Student("Aoi", "322545345");

        Lärare l1 = new Lärare("Sigrun", "234234234");

        Kurs java = new Kurs("Java");
        Kurs javascript = new Kurs("Javascript");


        List<Kursdeltagande> kursdeltagandes = new ArrayList<>();
        kursdeltagandes.add(new Kursdeltagande(s1, java));
        kursdeltagandes.add(new Kursdeltagande(s2, java));
        kursdeltagandes.add(new Kursdeltagande(s3, javascript));

       SchoolUtil.printAllClassesForStudent(kursdeltagandes, s1);
        System.out.println();

        SchoolUtil.printAllStudentsForClass(kursdeltagandes, java);


        Kurstillfälle lek1 = new Kurstillfälle(
                LocalDate.of(2015, Month.SEPTEMBER, 1) );
        Kurstillfälle lek2 = new Kurstillfälle(
                LocalDate.of(2015, Month.SEPTEMBER, 8) );

        Kurstillfälle lek3 = new Kurstillfälle(
                LocalDate.of(2015, Month.OCTOBER, 1) );

        java.addKursTillfälle(lek1);
        java.addKursTillfälle(lek2);
        javascript.addKursTillfälle(lek3);

        List<Lektiondektagande> lektiondektagandes = new ArrayList<>();

        lektiondektagandes.add(SchoolUtil.registreraElevsNärvaro(lek1,s1));
        lektiondektagandes.add(SchoolUtil.registreraElevsNärvaro(lek2,s2));
        lektiondektagandes.add(SchoolUtil.registreraElevsNärvaro(lek3,s3));


    }

    public static void main(String[] args) {
        Uppgift4Demo demo = new Uppgift4Demo();
    }
}
