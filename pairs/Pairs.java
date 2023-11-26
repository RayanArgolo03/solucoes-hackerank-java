
package pairs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Pairs {

    public static void main(String[] args) {
        System.out.println(pairs(1, Arrays.asList(1, 2, 3, 4)));
    }

    public static int pairs(int k, List<Integer> arr) {
        return (int) arr.stream()
                .sorted(Comparator.reverseOrder())
                .flatMap(numI -> arr.stream().map(numJ -> numI - numJ).distinct())
                .filter(num -> num == k)
                .count();
    }


}


