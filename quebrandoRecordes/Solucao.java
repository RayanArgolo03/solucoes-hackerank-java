
package quebrandoRecordes;

import java.util.*;


public class Solucao {
    public static void main(String[] args) {
        System.out.println(breakingRecords(Arrays.asList(12, 24, 10, 24)));
    }
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
        
        int countMax = 0;
        int countMin = 0;
        
        int max = scores.get(0);
        int min = scores.get(0);
        
        for (int i = 1; i < scores.size(); i++) {
            
            int num = scores.get(i);
            
            int lastMax = max;
            int lastMin = min;
            
            max = Math.max(num, max);
            min = Math.min(num, min);
            
            if (max != lastMax) countMax++;
            if (min != lastMin) countMax++;
        }
        
        return Arrays.asList(countMax, countMin);
    }
}
