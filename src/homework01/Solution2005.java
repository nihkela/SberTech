package homework01;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Solution2005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        Integer min = MAX_VALUE;
        int index = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (Math.min(min, array[i]) < min) {
                min = array[i];
                index = i+1;
            }
        }

        System.out.println(index);
    }
}
