package homework03;

public class Test {
    public static void main(String[] args) {
        CountMap<String> countMap = new CountMapImpl<>();

        countMap.add("Alexey");
        countMap.add("Alexey");
        countMap.add("Alexey");
        countMap.add("Alexey");

        System.out.println(countMap.getCount("Alexey"));
        System.out.println(countMap.remove("Alexey"));
        System.out.println(countMap.remove("Alexey"));


    }
}
