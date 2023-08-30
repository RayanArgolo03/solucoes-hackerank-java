package diasNoCinema;

public class BeatifulDays {

    public static void main(String[] args) {
    }

    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;

        for (int l = i; l <= j; l++) {
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(l)).reverse().toString());
            if (Math.abs(l - reverse) % k == 0) beautifulDays++;
        }

        return beautifulDays;
    }

}
