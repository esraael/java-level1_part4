package lecture4;

import java.util.Scanner;

public class Sheet610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.println((x < y && y < z) ? "stored" : "not stored");
    }
}
