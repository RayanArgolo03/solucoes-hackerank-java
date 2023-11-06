
package maxValue;

import java.util.*;

public class MaxValue {

    public static void main(String[] args) {
        System.out.println(maxValue("aaaaaa"));
    }

    public static int maxValue(String t) {

        int maxValue = 0;
        int initialIndex = 0;
        int finalIndex = 1;
        int lastFinalIndex = 1;
        Set<String> set = new HashSet<>();

        while (lastFinalIndex <= t.length()) {
            String sub = t.substring(initialIndex, finalIndex);
            boolean sucess = set.add(sub);

            if (sucess) {
                int ocurrences = countOcurrences(sub, t);
                maxValue = Math.max(ocurrences * sub.length(), maxValue);
            }

            initialIndex++;
            finalIndex++;

            if (finalIndex >= t.length()) {
                initialIndex = 0;
                lastFinalIndex++;
                finalIndex = lastFinalIndex;
            }

        }

        return maxValue;
    }

    private static int countOcurrences(String sub, String t) {

        if (sub.length() == 1) {
            return (int) t.chars().filter(c -> c == sub.charAt(0)).count();
        }

        int count = 0;
        int initialIndex = 0;
        int finalIndex = sub.length();

        while (finalIndex <= t.length()) {
            String subb = t.substring(initialIndex, finalIndex);
            if (subb.equals(sub)) {
                count++;
            }
            initialIndex++;
            finalIndex++;

        }
        return count;
    }
}
