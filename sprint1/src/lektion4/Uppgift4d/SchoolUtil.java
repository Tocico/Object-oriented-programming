package lektion4.Uppgift4d;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 16:21
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class SchoolUtil {

    public static void printAllClassesForStudent(List<Kursdeltagande> kdtList, Student student) {
        List<String> classes = new ArrayList<>();
        for(Kursdeltagande kdf : kdtList)
            if(kdf.getStudent().equals(student)) classes.add(kdf.getKurs().kursName);
        classes.forEach(s -> System.out.println(s));
    }

    public static void printAllStudentsForClass(List<Kursdeltagande> kdtList, Kurs kurs){
        List<String> students = new ArrayList<>();
        for(Kursdeltagande kdf : kdtList)
            if(kdf.getKurs().equals(kurs)) students.add(kdf.getStudent().getName());
        students.forEach(k -> System.out.println(k));
    }

    public static Lektiondektagande registreraElevsNärvaro(Kurstillfälle kf, Student student) {
        return new Lektiondektagande(kf, student);
    }
}
