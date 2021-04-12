package homework02;

import java.io.*;

public class Solution04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\USER\\Desktop\\text.txt")));
        StringBuilder stringBuilder = new StringBuilder();

        while (reader.ready()) {
            stringBuilder.append(reader.readLine() + "\n");
        }

        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
