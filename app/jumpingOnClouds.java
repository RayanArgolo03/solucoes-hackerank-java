
package app;

import java.util.Arrays;
import java.util.List;

public class jumpingOnClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0)));
        //Runner.runProgram();
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int countJumps = -1;
        for (int i = 0; i < c.size() - 1; i++, countJumps++) {
            if (i <= c.size() - 2){
                if (c.get(i + 2) == 0){
                    i ++;
                }
            }
        }
        return countJumps;
    }

}
