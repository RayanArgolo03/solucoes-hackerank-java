package insertIndex;

import java.util.List;

public class InsertIndex {

    public static int introTutorial(int V, List<Integer> arr) {
        int num = 0;

        for (Integer i : arr) {
            if (i == V) {
                num = arr.indexOf(i);
                break;
            }
        }

        return num;
    }

}
