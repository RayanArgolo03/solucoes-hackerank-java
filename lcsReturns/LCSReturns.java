
package lcsReturns;


import java.util.HashSet;
import java.util.Set;

public class LCSReturns {

    public static void main(String[] args) {
        System.out.println(tutzkiAndLcs("aa", "baaa"));
    }

    public static int tutzkiAndLcs(String a, String b) {
        String lcs = getLcs(a, b);
        return incrementLcs(a, b, lcs);
    }

    private static String getLcs(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        int left = 0, right = 0;
        String lcs = "";

        do {

            if (a.charAt(left) == b.charAt(right)) {

                int lastLeft = left + 1;
                int lastRight = right;
                StringBuilder sb = new StringBuilder();

                while ((left < a.length() && right < b.length()) && (a.charAt(left) == b.charAt(right))) {
                    sb.append(a.charAt(left));
                    left++;
                    right++;
                }

                if (sb.length() > lcs.length()) lcs = sb.toString();

                left = lastLeft;
                right = lastRight;

            } else {

                if (left == a.length() - 1) {
                    left = 0;
                    right++;

                } else {
                    left++;
                }


            }

        } while (left < a.length());

        return lcs;
    }


    private static int incrementLcs(String a, String b, String lcs) {

        int count = 0;
        Set<String> repeatedCombinations = new HashSet<>();

        outer:
        for (char c : b.toCharArray()) {
            int i = 0;

            inner:
            while (i <= a.length()) {
                String combination = new StringBuilder(a).insert(i, c).toString();

                boolean nonRepeated = repeatedCombinations.add(combination);
                if (nonRepeated) {

                    int left = 0;
                    int right = a.length()  ;

                    while (right < b.length()) {
                        if (b.substring(left, right + 1).equals(combination)) {
                            count++;
                        }

                        left++;
                        right++;
                    }

                }

                i++;
            }


        }

        return count;
    }


}



