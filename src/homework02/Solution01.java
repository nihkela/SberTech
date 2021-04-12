package homework02;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Задание 1: Подсчитайте количество различных слов в файле.
public class Solution01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\USER\\Desktop\\text.txt"));) {
            StringBuilder builder = new StringBuilder();

            while (scanner.hasNext()) {
                builder.append(scanner.next()).append(" ");
            }

            String words = builder.toString();
            String[] array = words.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(array));

            System.out.println(uniqueWords.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
