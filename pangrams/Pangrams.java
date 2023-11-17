
package pangrams;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }


    public static String pangrams(String s) {

        Set<Character> alphabetLetters = new HashSet<>();

        for (char c :  s.replaceAll(" ", "").toCharArray()) {
            alphabetLetters.add(Character.toLowerCase(c));
        }

        return (alphabetLetters.size() == 26)
                ? "pangram"
                : "not pangram";
    }
}


