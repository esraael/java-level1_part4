package Lecture4;

import java.util.Scanner;

public class Sheet71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        a = Math.sin(2 * Math.PI);
        System.out.println("a is" + a);
        a = Math.rint(-2.5);
        System.out.println(a);
        a=Math.round(-2.5f);
        System.out.println(a);
    }

}
