
package sortedSubsegments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedSubsegments {


    public static void main(String[] args) {
        System.out.println(sortedSubsegments(0, Arrays.asList(4, 2, 3, 1),
                List.of(Arrays.asList(0, 2), Arrays.asList(1, 3))));
    }


    public static int sortedSubsegments(int k, List<Integer> a, List<List<Integer>> queries) {

        List<Integer> copyList = new ArrayList<>(a);

        for (List<Integer> query : queries) {

            List<Integer> temp = copyList.subList(query.get(0), query.get(1) + 1)
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());


            copyList.removeAll(copyList.subList(query.get(0), query.get(1) + 1));
            copyList.addAll(query.get(0), temp);
        }

        return copyList.get(k);
    }


}



