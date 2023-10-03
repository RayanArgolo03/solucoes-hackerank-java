package spaceStations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpaceStations {
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
    }

    public static int flatlandSpaceStations(int n, int[] c) {

        List<Integer> spacialStations = Arrays.stream(c).boxed().collect(Collectors.toList());
        int maximumDistance = 0;

        for (int city = 0; city < n; city++) {
            if (!spacialStations.contains(city)) {
                int distance = Math.abs(city - spacialStations.get(0));
                for (int i = 1; i < spacialStations.size(); i++) {
                    distance = Math.min(Math.abs(city - spacialStations.get(i)), distance);
                }
                maximumDistance = Math.max(distance, maximumDistance);
            }
        }

        return maximumDistance;
    }
}