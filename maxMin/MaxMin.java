
package maxMin;


import java.util.*;
import java.util.stream.Collectors;

public class MaxMin {

    public static void main(String[] args) {
        System.out.println(jimOrders(List.of(
                List.of(1, 1),
                List.of(1, 1))));
    }

    public static List<Integer> jimOrders(List<List<Integer>> orders) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < orders.size(); i++) {
            map.put(i + 1, orders.get(i).get(0) + orders.get(i).get(1));
        }

        return map.keySet().stream()
                .sorted(Comparator.comparing(map::get))
                .collect(Collectors.toList());
    }
}






