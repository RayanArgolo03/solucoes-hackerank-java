
package playningWithNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {


    public static void main(String[] args) {
        System.out.println(playingWithNumbers(Arrays.asList(-1, 2, -3), Arrays.asList(1, -2, 3)));
    }

    public static List<Integer> playingWithNumbers(List<Integer> arr, List<Integer> queries) {

        List<Integer> res = new ArrayList<>();
        List<Integer> aux = new ArrayList<>(arr);

        for (Integer query : queries) {
            aux = aux.stream().map(n -> n + query).collect(Collectors.toList());
            res.add(receiveCurrentSum(aux));
        }

        return res;
    }

    private static Integer receiveCurrentSum(List<Integer> aux) {
        return aux.stream()
                .map(Math::abs)
                .reduce(0, Integer::sum);
    }


}



