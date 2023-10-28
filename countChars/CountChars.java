
package countChars;

public class CountChars {

    public static void main(String[] args) {
        System.out.println(stringConstruction("abcabc"));
    }
    public static int stringConstruction(String s) {
        return (int) s.chars().distinct()
                .count();
    }

}
