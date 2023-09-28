package howManyGames;

public class ManyGames {


    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
    }

    public static int howManyGames(int p, int d, int m, int s) {

        int total = 0;
        int count = 0;
        s++;

        while (total <= s) {
            if (p > m) {
                total += p;
                p -= d;
            } else {
                total += m;
            }
            count++;
        }


        return count - 1;
    }


}
