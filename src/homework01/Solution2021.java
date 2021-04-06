package homework01;

import java.util.Scanner;

public class Solution2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            max = Math.max(max, array[i]);
        }

        for (int j : array) {
            max = Math.max(max, j);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] /= 2;
            }
        }

        for (int i : array) {
            secondMax = Math.max(secondMax, i);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == secondMax) {
                array[i] /= 2;
            }
        }

        for (int i : array) {
            System.out.print(" " + i);
        }
    }
}
