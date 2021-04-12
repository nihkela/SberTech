package homework03;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {
    Map<T, Integer> map = new HashMap<>();

    @Override
    public void add(T element) {
        int count = this.getCount(element);
        map.put(element, ++count);
    }

    @Override
    public int getCount(T element) {
        Integer count = map.get(element);
        if (count != null) {
            return count;
        } else {
            return 0;
        }
    }

    @Override
    public int remove(T element) {
        Integer count = map.get(element);
        if (count == 1) {
            map.remove(element);
        } else {
            map.put(element, count - 1);
        }
        return count;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<? extends T> source) {

    }

    @Override
    public Map<T, Integer> toMap() {
        return null;
    }

    @Override
    public void toMap(Map<? super T, Integer> destination) {

    }
}
