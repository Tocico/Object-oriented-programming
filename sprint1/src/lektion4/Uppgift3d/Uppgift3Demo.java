package lektion4.Uppgift3d;

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


public class Uppgift3Demo {

    private void printStudent(Student student, List<Deltagande> allDeltagare) {
        System.out.println(student.getName());

        allDeltagare.forEach(deltagande -> {
            if(student == deltagande.getStudent()) System.out.println("Kurs: " + deltagande.getKurs().kursName);
        });
    }

    private void printKursName(Kurs kurs, List<Deltagande> allDeltagare) {
        System.out.println();
        System.out.println(kurs.getKursName());

        allDeltagare.forEach(deltagande -> {
            if(kurs == deltagande.getKurs()) System.out.println("Student: " + deltagande.getStudent().getName());
        });
    }

    private void printAll(List<Student> allstudents,List<Deltagande> allDeltagare) {
        System.out.println();
        for(Student s: allstudents ) {
            System.out.println("Student: " + s.getName());
            for(Deltagande d: allDeltagare) {
                if(s == d.getStudent()) System.out.println("Kurs: " + d.getKurs().kursName);
            }

        }
    }

    Uppgift3Demo() {
        Student s1 = new Student("Toshiko", "1234566");
        Student s2 = new Student("Taeko", "34656456");
        Student s3 = new Student("Aoi", "322545345");

        Lärare l1 = new Lärare("Sigrun", "234234234");

        Kurs java = new Kurs("Java");
        Kurs javascript = new Kurs("Javascript");

        Deltagande d1 = new Deltagande(s1,java);
        Deltagande d2 = new Deltagande(s2,javascript);
        Deltagande d3 = new Deltagande(s1, javascript);
        Deltagande d4 = new Deltagande(s3, java);

        List<Deltagande> deltagandeList = new ArrayList<>();
        deltagandeList.add(d1);
        deltagandeList.add(d2);
        deltagandeList.add(d3);
        deltagandeList.add(d4);

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);

        printStudent(s1, deltagandeList);

        printKursName(java,deltagandeList);

        printAll(allStudents,deltagandeList);


    }

    public static void main(String[] args) {
        Uppgift3Demo demo = new Uppgift3Demo();
    }
}
