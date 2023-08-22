package Lecture4;

import java.util.Scanner;

public class Sheet54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a < b) {
            System.out.println("true");
        } else if (a <= b) {
            System.out.println("false");
        }

    }

}
