package lecture4;

import java.util.Scanner;

public class Sheet68 {

    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int age = sec.nextInt();
        int trickprice = sec.nextInt();
        if (age >= 16) {
            trickprice = 20;
        } else {
            trickprice = 10;
        }

        System.out.println(age + trickprice);

    }

}
