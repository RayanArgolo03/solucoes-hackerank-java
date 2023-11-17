
package HackerrankInString;

public class HackerrankInString {

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hackerworld"));
    }


    public static String hackerrankInString(String s) {

        String aux = "hackerrank";
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == aux.charAt(i)) {
                i++;
            }

            if (i == aux.length()) return "YES";
        }

        return "NO";
    }
}


