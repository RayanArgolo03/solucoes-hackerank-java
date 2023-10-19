package countingSort;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(0);
        }

        for (int i = 0; i < arr.size(); i++) {
            int value = list.get(arr.get(i)) + 1;
            list.set(arr.get(i), value);
        }

        return list;
    }

}
