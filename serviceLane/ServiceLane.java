package serviceLane;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ServiceLane {

    public static void main(String[] args) {
        System.out.println(serviceLane(5, List.of(Arrays.asList(2, 3), Arrays.asList(1, 4), Arrays.asList(2, 4), Arrays.asList(2, 4), Arrays.asList(2, 3)) , Arrays.asList(1, 2, 2, 2, 1)));
    }

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {

        List<Integer> stoppingPoints = new LinkedList<>();
        for (List<Integer> casee : cases) {

            int init = casee.get(0);
            int fim = casee.get(1);

            int stopPoint = width.stream()
                    .skip(init)
                    .limit(fim - init + 1)
                    .min(Integer::compareTo)
                    .orElse(-1);

            stoppingPoints.add(stopPoint);

        }

        return stoppingPoints;
    }
}
