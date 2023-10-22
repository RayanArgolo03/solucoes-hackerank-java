package closestNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {


    public static List<Integer> closestNumbers(List<Integer> arr) {

        Collections.sort(arr);
        int diff = 999;

        for (int i = 0; i < arr.size() - 1; i++) {
            diff = Math.min(arr.get(i + 1) - arr.get(i), diff);
        }

        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) == diff) {
                pairs.add(arr.get(i));
                pairs.add(arr.get(i + 1));
            }
        }

        return pairs;
    }

}
