package homework02;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
public class Solution05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\USER\\Desktop\\text.txt")));
        StringBuilder builder = new StringBuilder();

        while (reader.ready()) {
            builder.append(reader.readLine()).append(" ");
        }

        String words = builder.toString();
        String[] array = words.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(array));

        ListIterator listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
