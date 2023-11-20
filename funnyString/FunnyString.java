
package funnyString;

public class FunnyString {

    public static void main(String[] args) {
        System.out.println("a".codePointAt(0));
        System.out.println(funnyString("lmnop"));
    }

    public static String funnyString(String s) {

        String reverse = new StringBuilder(s).reverse().toString();
        int len = s.length();

        for (int i = 0; i < len - 1; i++) {

            int differenceReverse = Math.abs(reverse.codePointAt(i + 1) - reverse.codePointAt(i));
            int differenceOriginal = Math.abs(s.codePointAt(i + 1) - s.codePointAt(i));

            if (differenceOriginal != differenceReverse) {
                return "Not Funny";
            }
        }

        return "Funny";
    }
}


