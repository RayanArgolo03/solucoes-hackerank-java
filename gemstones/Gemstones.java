
package gemstones;

import java.util.*;


public class Gemstones {


    public static void main(String[] args) {
        System.out.println(gemstones(Arrays.asList("cdafa", "hasjahscda", "adcf")));
    }

    public static int gemstones(List<String> arr) {

        int count = 0;
        Set<Character> characters = new TreeSet<>(Comparator.reverseOrder());

        for (char c : arr.get(0).toCharArray()) {
            int i = 1;
            while (arr.get(i).contains(String.valueOf(c)) && !characters.contains(c)) {
                i++;
                if (i == arr.size()) {
                    count++;
                    characters.add(c);
                    break;
                }
            }
        }

        System.out.println(characters);
        return count;
    }

}


