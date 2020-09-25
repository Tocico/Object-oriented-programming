package lektion4.Uppgift4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 11:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift3Demo {

    private void printStundents(List<Kurstillfälle> allkurstillfälle) {
        System.out.println();
        List<Student> allStudents = new ArrayList<>();

        for(Kurstillfälle k : allkurstillfälle) {
            for(Student s : k.getStundenter()) {
                if(!allStudents.contains(s))
                    allStudents.add(s);
            }
        }

        for(Student s : allStudents) {
            List<Kurs> allaKursLista = new ArrayList<>();
            for(Kurstillfälle k: allkurstillfälle) {
                if(k.getStundenter().contains(s)) allaKursLista.add(k.getKurs());
            }
            System.out.println("Student: " + s.getName());
            for(Kurs k: allaKursLista) System.out.println("Kurs: " + k.getKursName());
        }
    }



    Uppgift3Demo() {
        Student s1 = new Student("Toshiko", "1234566");
        Student s2 = new Student("Taeko", "34656456");
        Student s3 = new Student("Aoi", "322545345");

        Lärare l1 = new Lärare("Sigrun", "234234234");

        Kurs java = new Kurs("Java");
        Kurs javascript = new Kurs("Javascript");

        Kurstillfälle k1 = new Kurstillfälle(java, new Date());

        k1.addStudent(s1);
        k1.addStudent(s2);
        k1.addStudent(s3);


        k1.addLärare(l1);

        Kurstillfälle k2 = new Kurstillfälle(javascript, new Date());

        k2.addStudent(s1);
        k2.addStudent(s2);
        //k2.addStudent(s3);

        k2.addLärare(l1);

        k1.printKursTillfälle();

        List<Kurstillfälle> allKurstillfälle = new ArrayList<>();
        allKurstillfälle.add(k1);
        allKurstillfälle.add(k2);

        printStundents(allKurstillfälle);


    }

    public static void main(String[] args) {
        Uppgift3Demo demo = new Uppgift3Demo();
    }
}
