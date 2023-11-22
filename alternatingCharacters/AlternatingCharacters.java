
package AlternatingCharacters;

public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }

    public static int alternatingCharacters(String s) {
        int count = 0;
        int i = 0;
        while (s.length() > 1 && i < s.length() - 1) {if (s.charAt(i + 1) == s.charAt(i++)) count++;}
        return count;
    }

}


