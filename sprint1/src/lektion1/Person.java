package lektion1;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-21
 * Time: 10:06
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * Konstruera en klass demo.Person. En person ska ha ett namn, adress och
 *  * ålder. Utforma en konstruktor och några lämpliga metoder för demo.Person.
 */


public class Person {
    private  String name;
    private String address;
    private int old;

    public Person(String name, String address, int old) {
        this.name = name;
        this.address = address;
        this.old = old;
    }

    public String getName() {
        return name;
    }
}
