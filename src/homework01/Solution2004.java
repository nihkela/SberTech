package homework01;

import java.util.Scanner;

public class Solution2004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfYear = scanner.nextInt();
        int answer = 0;

        if ((numberOfYear % 4 == 0) && (numberOfYear % 100 != 0)) {
            answer = 1;
        }
        else if (numberOfYear % 400 == 0) {
            answer = 1;
        }

        System.out.println(answer);
    }
}
