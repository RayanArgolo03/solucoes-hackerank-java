
package maximumToys;

import java.util.List;
import java.util.stream.Collectors;

public class MaximumToys {

    public static void main(String[] args) {
        System.out.println(maximumToys(List.of(1, 12, 5, 111, 200, 1000, 10), 50));
    }


    public static int maximumToys(List<Integer> prices, int k) {

        prices = prices.stream()
                .sorted()
                .collect(Collectors.toList());

        int count = 0;
        int i = 0;
        while (k  - prices.get(i) > 0 ){
            k -= prices.get(i++);
            count++;
        }

        return count;
    }

}





