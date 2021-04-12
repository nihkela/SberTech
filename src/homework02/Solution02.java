package homework02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

// Задание 2: Выведите на экран список различных слов файла, отсортированный
// по возрастанию их длины (компаратор сначала по длине слова, потом по тексту).

public class Solution02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\USER\\Desktop\\text.txt"));) {
            StringBuilder builder = new StringBuilder();

            while (scanner.hasNext()) {
                builder.append(scanner.next()).append(" ");
            }

            String words = builder.toString();
            String[] array = words.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            Set<String> uniqueWords = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String s, String t1) {
                    if (s.length() == t1.length()) {
                        return s.compareTo(t1);
                    } else {
                        return s.length() - t1.length();
                    }
                }
            });

            uniqueWords.addAll(Arrays.asList(array));

            System.out.println(uniqueWords);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
