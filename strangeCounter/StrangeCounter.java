package strangeCounter;

public class StrangeCounter {
    public static long strangeCounter(long t) {

        long value = 3;
        long lastValue = 3;

        for (int i = 1; i < t; i++) {
            if (value == 1) {
                value = lastValue * 2;
                lastValue = value;
            } else {
                value--;
            }
        }

        return value;
    }
}
