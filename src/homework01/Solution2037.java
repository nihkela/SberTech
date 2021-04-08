package homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
            return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
        }
        return "";
    }


    // ВТОРОЙ ВАРИАНТ, НЕ ПРОПУСТИЛ ВАЛИДАТОР - Result 33/35.
    // При вводе любой строки и числа 0, выводится все сразу после .split() без пустых строк
    // Например: input: abc,ab,ab,,,ba,aa,a,,
    //           output: abc,ab,ab,ba,aa,a
    //


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] strings = scanner.next().toLowerCase().split(",");
//        int length = scanner.nextInt();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].length() < length) {
//                strings[i] = null;
//            }
//        }
//
//        for (String string : strings) {
//            if (string != null) {
//                stringBuilder.append(string).append(",");
//            }
//        }
//
//        if (stringBuilder.length() > 0) {
//            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        }
//
//        System.out.println(stringBuilder);
//    }
}
