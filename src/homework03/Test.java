package homework03;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        CountMap<String> countMap = new CountMapImpl<>();
        CountMap<String> countMap1 = new CountMapImpl<>();

        countMap1.add("12");
        countMap1.add("12");
        countMap1.add("12");

        countMap.add("Alexey");
        countMap.add("Alexey");
        countMap.add("Alexey");
        countMap.add("Alexey");

        System.out.println(countMap.getCount("Alexey"));
        System.out.println(countMap.remove("Alexey"));
        System.out.println(countMap.size());
        countMap.addAll(countMap1);

        Map<String, String> hashMap = new HashMap(countMap.toMap());




    }
}
