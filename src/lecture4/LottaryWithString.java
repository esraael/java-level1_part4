package lecture4;

import java.util.Scanner;

public class LottaryWithString {

    public static void main(String[] args) {
        String lottary = " " + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num of lottary");
        String guess = sc.nextLine();
        int lottarydigit1 = lottary.charAt(0);
        int lottarydigit2 = lottary.charAt(1);
        int guessdigit1 = guess.charAt(0);
        int guessdigit2 = guess.charAt(1);
        System.out.println("the lottary is" + lottary);

        if (guess.equals(lottary)) {
            System.out.println("exact match you win $10,000");
        } else if (guessdigit1 == lottarydigit2 && guessdigit2 == lottarydigit1) {
            System.out.println("match all digit you win $3,000");
        } else if (guessdigit1 == lottarydigit1 || guessdigit1 == lottarydigit2
                || guessdigit2 == lottarydigit1 || guessdigit2 == lottarydigit2) {
            System.out.println("match one digit you win $1,000");
        } else {
            System.out.println("sorry no match");
        }

    }

}
