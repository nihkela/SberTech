package homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2037 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int length = Integer.parseInt(reader.readLine());

        System.out.println(process(str, length));
    }

    private static String process(String str, int length) {
        if (length == 0) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str.split(",")) {
            if (s.length() >= length) {
                stringBuilder.append(s).append(",");
            }
        }
        if (stringBuilder.length() > 0) {
            return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
        }
        return "";
    }
}
