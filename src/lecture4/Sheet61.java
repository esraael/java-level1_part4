package lecture4;

import java.util.Scanner;

public class Sheet61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is even");
        }
        if (num % 5 == 0) {
            System.out.println(num + "is multiple of 5");
        }
    }
}
