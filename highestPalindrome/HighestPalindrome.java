
package highestPalindrome;

public class HighestPalindrome {
    private static String str;

    public static void main(String[] args) {
        initialize("abab");
        System.out.println(answerQuery(1, 4));
    }


    public static void initialize(String s) {
        str = s;
    }

    public static int answerQuery(int l, int r) {

        str = str.substring(l - 1, r);

        boolean hasRotated = false;
        int countRotated = 0;
        int i = 0;
        int j = 1;
        int maxLength = 1;
        char left, right, next;

        while (countRotated < 2 && j < str.length()) {

            left = str.charAt(i);
            right = str.charAt(j);

            while (j < str.length() - 1) {

                next = str.charAt(j + 1);
                if (next == left) {
                    maxLength = 2;
                    break;
                } else {
                    j++;
                }

                if (j == str.length() - 1 && !hasRotated) {
                    char temp = left;
                    left = right;
                    right = temp;
                    hasRotated = true;
                    j = i + 1;
                }

            }

            if (hasRotated) hasRotated = false;
            i++;

            if (j == str.length() - 1) {
                str = new StringBuilder(str).reverse().toString();
                i = 0;
                countRotated++;
            }

            j = i + 1;
        }

        return maxLength;
    }
}
