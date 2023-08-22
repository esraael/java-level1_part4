package Lecture4;

import java.util.Scanner;

public class Sheet72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a And b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        x = a + (int) (Math.random() * (b - a));
        System.out.println("x =" + x);
    }

}
