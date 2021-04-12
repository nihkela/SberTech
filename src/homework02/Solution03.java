package homework02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

// Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.

public class Solution03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\USER\\Desktop\\text.txt"));) {
            StringBuilder builder = new StringBuilder();
            Map<String, Integer> map = new HashMap<>();

            while (scanner.hasNext()) {
                builder.append(scanner.next()).append(" ");
            }

            String words = builder.toString();
            String[] array = words.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");

            for (String s : array) {
                if (!map.containsKey(s)) {
                    map.put(s, 0);
                }
                map.put(s, map.get(s) + 1);
            }

            System.out.println(map);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
