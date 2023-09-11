package equality;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualityArray {
    public static void main(String[] args) {
        System.out.println(equalizeArray(Arrays.asList(1, 2, 3, 1, 2, 3, 3, 3)));
        //Runner.runProgram();
    }
    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            if (!map.containsKey(num)){
                map.put(num, 1) ;
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int aux = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        return (int) arr.stream().
                filter(num -> !num.equals(aux))
                .count();
    }
}
