
package fatorialLong;

import java.util.Arrays;

public class FatorialLong {
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

    public static int findDigits(int n) {
        return (int) Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .filter(number -> number != 0 && n % number == 0)
                .count();
    }

}

