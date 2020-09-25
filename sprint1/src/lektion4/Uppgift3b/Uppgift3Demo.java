package lektion4.Uppgift3b;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift3Demo {

    private void printKurs(Kurs kurs) {
        System.out.println("Kurs: " + kurs.getKursName());
        System.out.println("Lärare: " + kurs.getLärare().getName());

        for(Student student: kurs.getStudenter())
            if(student != null)
            System.out.println(student.getName());
    }

    private void printStudent(List<Student> allStudents) {
        allStudents.forEach(student -> {
            System.out.println("Stundent: " + student.getName());
            student.getKurser().forEach(kurs -> System.out.println("Kurs: " + kurs.getKursName()));
        });

    }

    Uppgift3Demo() {
        Student s1 = new Student("Toshiko", "1234566");
        Student s2 = new Student("Taeko", "34656456");
        Student s3 = new Student("Aoi", "322545345");

        Lärare l1 = new Lärare("Sigrun", "234234234");

        Kurs java = new Kurs("Java");
        Kurs javascript = new Kurs("Javascript");

        java.addStudent(s1);

        java.addStudent(s2);
        java.addStudent(s3);
        java.addLärare(l1);

        s1.addKurs(java);
        s2.addKurs(java);

        javascript.addStudent(s1);
        javascript.addStudent(s3);

        s3.addKurs(javascript);
        s1.addKurs(javascript);

        printKurs(java);

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);

        printStudent(allStudents);

    }

    public static void main(String[] args) {
        Uppgift3Demo demo = new Uppgift3Demo();
    }
}
