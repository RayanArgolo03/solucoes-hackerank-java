package chocolateFeast;

public class ChocolateFeast {


    public static void main(String[] args) {
        System.out.println(chocolateFeast(6, 2, 2));
    }

    public static int chocolateFeast(int n, int c, int m) {

        int chocolates = n / c;
        int packaging = n / c;

        if (packaging >= m) {

            while (packaging >= m) {
                chocolates++;
                packaging = packaging - m + 1;
            }

        }

        return chocolates;
    }


}
