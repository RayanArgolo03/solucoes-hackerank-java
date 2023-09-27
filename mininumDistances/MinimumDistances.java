package mininumDistances;

import java.util.List;

public class MinimumDistances {

    public static Integer minimumDistances(List<Integer> a) {

        int minimumDistance = -1;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).hashCode() == a.get(j).hashCode()){
                    int difference = j - i;
                    minimumDistance = (difference < minimumDistance || minimumDistance == -1)
                            ? difference
                            : minimumDistance;
                }
            }
        }

        return minimumDistance;
    }

}
