package lecture4;

import java.util.Scanner;

public class Sheet69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int score = sc.nextInt();
        int scale = sc.nextInt();
        if (x > 10) {
            score = 3 * scale;
        } else {
            score = 4 * scale;
        }
    }
}
