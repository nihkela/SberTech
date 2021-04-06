package homework01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution2036 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String[] strings = new String[size];

        for (int i = 0; i < size; i++) {
            strings[i] = reader.readLine().toLowerCase();
        }

        for (int i = 0; i < strings.length; i++) {
            char[] array = strings[i].toCharArray();
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 'e' || array[j] == 'y' || array[j] == 'u' || array[j] == 'i' || array[j] == 'o' || array[j] == 'a') {
                    count++;
                    if (count >= 3) {
                        strings[i] = null;
                    }
                } else {
                    count = 0;
                }
            }
        }

        for (String string : strings) {
            if (string != null) {
                System.out.println(string.toLowerCase());
            }
        }
    }
}
