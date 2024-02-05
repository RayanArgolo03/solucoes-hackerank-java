
package minimumAbsoluteDifference;

import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsolute {

    public static void main(String[] args) {
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {

        List<Integer> arrSorted = arr.stream()
                .sorted()
                .collect(Collectors.toList());

        int min = 99999;
        for (int i = 1; i < arrSorted.size(); i++) {
            int current = arrSorted.get(i);
            int next = arrSorted.get(i + 1);
            min = Math.min(min, current - next);
        }

        return min;
    }


}





