package runningTime;

import java.util.List;

public class RunningTime {

    public static int runningTime(List<Integer> arr) {

        int count = 0;
        int aux, j;

        for (int i = 1; i < arr.size(); i++) {

            aux = arr.get(i);
            j = i - 1;

            while (j >= 0 && arr.get(j) > aux) {
                arr.set(j + 1, arr.get(j));
                j--;
                count++;
            }

            arr.set(j + 1, aux);

        }


        return count;
    }
}
