
package permuting;

import java.util.*;

public class permuting {

    public static void main(String[] args) {
        System.out.println(twoArrays(10, new ArrayList<>(List.of(7, 6, 8, 4, 2)), new ArrayList<>(List.of(5, 2, 6, 3, 1))));
    }


    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        A.sort(Comparator.naturalOrder());
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(B);

        return A.stream().anyMatch(num -> num + queue.poll() < k)
                ? "NO"
                : "YES";
    }

}






