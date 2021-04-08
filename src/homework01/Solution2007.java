package homework01;

import java.util.Scanner;

public class Solution2007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 0;
        int div = 2;

        while (true) {
            if (number % div == 0) {
                count += 1;
                div *= 2;
            }
            else {
                break;
            }
        }
        System.out.println(count);
    }
}
