package sherlockSquares;

public class SherlockSquares {
    public static void main(String[] args) {
        System.out.println(squares(26, 49));
    }

    public static int squares(int a, int b) {
        int count = 0;
        int sqrtA = (int) Math.ceil(Math.sqrt(a));
        int sqrtB = (int) Math.floor(Math.sqrt(b));
        for (int i = sqrtA; i <= sqrtB; i++) {
            count++;
        }
        return count;
    }
}
