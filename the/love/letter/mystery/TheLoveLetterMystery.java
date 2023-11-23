
package the.love.letter.mystery;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("cba"));
    }

    public static int theLoveLetterMystery(String s) {

        if (s.contentEquals(new StringBuilder(s).reverse())) return 0;

        int count = 0;
        int init = 0;
        int finnal = s.length() - 1;

        while (init < finnal) {
            count += Math.abs(s.charAt(finnal) - s.charAt(init));
            init++;
            finnal--;
        }

        return count;
    }


}


