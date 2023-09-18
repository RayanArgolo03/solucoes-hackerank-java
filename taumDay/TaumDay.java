package taumDay;

public class TaumDay {

    public static void main(String[] args) {
        System.out.println(taumBday(531, 863, 5124, 4068, 3136));
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {

        long cost;

        if (wc > (bc + z)) {
            cost = (long) b * bc + (long) (bc + z) * w;
        } else if (bc > (wc + z)) {
            cost = (long) w * wc + (long) (wc + z) * b;
        } else {
            cost = ( (long) bc * b) + ( (long) wc * w);
        }

        return cost;
    }
}
