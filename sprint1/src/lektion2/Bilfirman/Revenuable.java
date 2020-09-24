package lektion2.Bilfirman;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-24
 * Time: 10:23
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * Lägg till ytterligare ett interface, Revenuable, som innehåller en metod
 * calcuateRevenue som räknar ut hur mycket Harry kan tjäna på en annons
 * (förutsatt att nån köper). Vi måste dra av 25% av alla priser pga moms och
 * sen är det dessutom 10% rea på motorcyklar
 */


public interface Revenuable {
    void calculateRevenue();
}
