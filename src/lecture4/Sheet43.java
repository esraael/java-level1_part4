package Lecture4;

import java.util.Scanner;

public class Sheet43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble();
        double a = sc.nextDouble();
        double length = (V * V) / (2 * a);
        System.out.println("length =" + length);
    }

}
