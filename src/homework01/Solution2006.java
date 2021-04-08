package homework01;

import java.util.Scanner;

public class Solution2006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cm = scanner.nextInt();
        int inch;
        int foot;
        int remainder;

        remainder = cm % 3;

        inch = cm / 3;
        foot = inch / 12;

        if (remainder == 2) {
            inch += 1;
        }

        inch = inch - (foot * 12);

        System.out.println(foot + " " + inch);
    }
}
