package Lecture4;

import java.util.Scanner;

public class Sheet66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1, a = 3;
        if (a == 1) {
            x += 5;
        } else if (a == 2) {
            x += 10;
        } else if (a == 3) {
            x += 16;
        } else if (a == 4) {
            x += 34;
            System.out.println("x is" + x);
        }
    }

}
