package Lecture4;

import java.util.Scanner;

public class Sheet75 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "welcome to java";
        String s2 = "programming is fun";
        String s3 = "welcome to java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.charAt(4));
        System.out.println(s1.indexOf('j'));

    }

}
