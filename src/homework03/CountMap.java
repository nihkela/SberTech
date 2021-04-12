package homework03;

import java.util.List;
import java.util.Map;

public interface CountMap<T> {
    void add(T element);

    int getCount(T element);

    int remove(T element);

    int size();

    void addAll(CountMap<? extends T> source);

    Map<T, Integer> toMap();

    void toMap(Map<? super T, Integer> destination);
}
