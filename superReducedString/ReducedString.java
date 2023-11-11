
package superReducedString;

public class ReducedString {

    public static void main(String[] args) {
        System.out.println(superReducedString("lrfkqyuqfjjfquyqkfrlkxyqvnrtyssytrnvqyxkfrzrmzlygffgylzmrzrfveulqfpdbhhbdpfqluevlqdqrrcrwddwrcrrqdql"));
    }

    public static String superReducedString(String s) {

        int i = 0;
        while (i < s.length() - 1 && i > -1) {

            //After
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = s.replaceFirst(String.valueOf(s.charAt(i)), "");
                s = s.replaceFirst(String.valueOf(s.charAt(i)), "");

                i = 0;
            }


            if ((s.length() > 1 && (s.charAt(i) != s.charAt(i + 1)))) {
                i++;
            }
        }
        return (!s.isEmpty())
                ? s
                : "Empty String";
    }

}


