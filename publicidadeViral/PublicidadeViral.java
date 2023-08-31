package publicidadeViral;

public class PublicidadeViral {

    public static int viralAdvertising(int n) {

        int shared = 5;
        int res = 2;
        int lastShared = shared;

        for (int day = 2; day <= n; day++) {
            shared = Math.floorDiv(lastShared, 2) * 3;
            res +=  Math.floorDiv(shared, 2);
            lastShared = shared;
        }


        return res;
    }



}
