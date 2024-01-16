
package unboundedKnapsack;


import java.util.List;
import java.util.stream.Collectors;

public class UnboundedKnapsack {

    public static void main(String[] args) {
        System.out.println(unboundedKnapsack(12, List.of(1, 6, 9)));
        System.out.println(unboundedKnapsack(9, List.of(3 ,4 ,4 ,4 ,8)));
    }

    public static int unboundedKnapsack(int k, List<Integer> arr) {

        arr = arr.stream().distinct().collect(Collectors.toList());

        for (Integer num : arr) {
            if ((num > 1) && (k % num == 0)) {
                return k;
            }
        }

        return 0;

    }
}





