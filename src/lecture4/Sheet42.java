package Lecture4;

import java.util.Scanner;

public class Sheet42 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double t1 = input.nextDouble();
        double t2 = input.nextDouble();
        double Q = m * (t2 - t1) * 4184;
        System.out.println("energy Q=" + Q);

    }

}
