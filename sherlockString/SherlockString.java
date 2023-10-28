
package sherlockString;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SherlockString {

    public static void main(String[] args) {
        System.out.println(isValid("abbac"));
    }

    public static String isValid(String s) {

        Map<Character, Integer> frequenceMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequenceMap.put(c, frequenceMap.getOrDefault(c, 0) + 1);
        }

        Predicate<Character> differentValue = key -> !frequenceMap.get(key).equals(frequenceMap.get(s.charAt(0)));
        Consumer<Character> decrementValue = key -> frequenceMap.put(key, frequenceMap.get(key) - 1);

        frequenceMap.keySet()
                .stream()
                .filter(differentValue)
                .findFirst()
                .ifPresent(decrementValue);

        Predicate<Integer> isDifferent = value -> !value.equals(frequenceMap.get(s.charAt(0)));

        return (frequenceMap.values().stream())
                .anyMatch(isDifferent)
                ? "NO"
                : "YES";
    }

}
