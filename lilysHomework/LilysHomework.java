
package lilysHomework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LilysHomework {

    public static void main(String[] args) {
        System.out.println(lilysHomework(new ArrayList<>(Arrays.asList(3, 4, 2 ,5 ,1))));
    }

    public static int lilysHomework(List<Integer> arr) {

        int numI, numJ, lastIndexJ, lastNumJ, count = 0;

        for (int i = 0; i < arr.size(); i++) {

            numI = arr.get(i);

            for (int j = i + 1; j < arr.size(); j++) {
                numJ = arr.get(j);
                lastIndexJ = j;

                if (numI > numJ) {

                    lastNumJ = numJ;
                    count++;

                    while (numI > numJ && j < arr.size() - 1) {
                        j++;
                        numJ = arr.get(j);
                        if (numJ < lastNumJ) {
                            lastIndexJ = j;
                        }
                    }

                    Collections.swap(arr, i, lastIndexJ);
                    break;
                }
            }
        }

        return count;
    }


}
