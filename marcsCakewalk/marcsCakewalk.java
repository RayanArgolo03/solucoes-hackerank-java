
package marcsCakewalk;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class marcsCakewalk {

    public static void main(String[] args) {
        System.out.println(marcsCakewalk(List.of(5, 10, 7)));
    }


     public static long marcsCakewalkMethod(List<Integer> calorie) {
        List<Integer> calorieSorted = calorie.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return calorieSorted.stream()
                .map(num -> (long) Math.pow(2, calorieSorted.indexOf(num)) * num)
                .reduce(0L, Long::sum);
    }


}





