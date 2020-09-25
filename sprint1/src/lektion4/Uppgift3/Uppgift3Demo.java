package lektion4.Uppgift3;

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

        javascript.addStudent(s1);
        javascript.addStudent(s3);

        printKurs(java);


    }

    public static void main(String[] args) {
        Uppgift3Demo demo = new Uppgift3Demo();
    }
}
