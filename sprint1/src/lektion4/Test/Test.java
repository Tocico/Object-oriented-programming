package lektion4.Test;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-25
 * Time: 08:00
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Test {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        a = new int[] {5,6,7,8};
        int b [] = new int[4];
        b = a;
        b[0] = 9;
        System.out.println(b[0]); //9
        System.out.println(a[0]); //9

        b = (int[]) a.clone();
        b[0] = 0;
        System.out.println(b[0]); //0
        System.out.println(a[0]); //9

        int[] c = {10, 20,30,40,50,60};
        System.arraycopy(c,2,b,1,2);
        for(int e: b) System.out.println(e);
    }
}
