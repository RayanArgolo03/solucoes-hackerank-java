
package luckBalance;

import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

    public static void main(String[] args) {
        System.out.println(luckBalance(3, List.of(
                List.of(5, 1),
                List.of(2, 1),
                List.of(1, 1),
                List.of(8, 1),
                List.of(10, 0),
                List.of(5, 0)
        )));
    }


    public static int luckBalance(int k, List<List<Integer>> contests) {

        int luckBalance = contests.stream()
                .filter(list -> list.get(1) == 0)
                .flatMap(List::stream)
                .reduce(0, Integer::sum);

        List<Integer> importants = contests.stream()
                .filter(list -> list.get(1) == 1)
                .map(list -> list.get(0))
                .sorted()
                .collect(Collectors.toList());


        int elementsToSubtract = importants.size() - k;

        for (Integer num : importants) {

            if (elementsToSubtract > 0) {
                num = -num;
                elementsToSubtract--;
            }

            luckBalance += num;
        }

        return luckBalance;
    }
}





