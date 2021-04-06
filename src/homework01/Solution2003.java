package homework01;

import java.util.Scanner;

public class Solution2003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
            else {
                sum -= arr[i];
            }
        }

        System.out.println(sum);
    }
}
