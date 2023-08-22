package Lecture4;

import java.util.Scanner;

public class Sheet56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num;
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("is even" + num);
        } else {
            System.out.println("is odd" + num);
        }
    }
}
