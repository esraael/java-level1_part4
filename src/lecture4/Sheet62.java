package Lecture4;

import java.util.Scanner;

public class Sheet62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = 3;
        y = 3;
        switch (x + 3) {
            case 6:
                y = 1;
            default:
                y += 1;
        }
        System.out.println("y=" + y);

    }

}
