package lecture4;

import java.util.Scanner;

public class Sheet58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is" + z);
            }

        } else {
            System.out.println("x is" + x);
        }
    }
}
