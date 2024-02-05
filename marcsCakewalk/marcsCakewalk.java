
package marcsCakewalk;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class marcsCakewalk {

    public static void main(String[] args) {
        System.out.println(marcsCakewalk(List.of(5, 10, 7)));
    }


    public static long marcsCakewalk(List<Integer> calorie) {

        List<Integer> caloriesSorted = calorie.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        long res = 0;
        for (int i = 0; i < caloriesSorted.size(); i++) res += (long) Math.pow(2, i) * caloriesSorted.get(i);

        return res;
    }


}





