
package gamingArray;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GamingArray {

    public static void main(String[] args) {

    }

    public static String gamingArray(List<Integer> arr) {

        //TODO POSTAR GITHUB E PROCURAR CÓDIGO COM COMPLEXIDADE REDUZIDA

        int count = 2;

        int i = arr.indexOf(Collections.max(arr));

        while (i > 0) {
            count++;
            i = arr.indexOf(arr.subList(0, i).stream().max(Comparator.naturalOrder()).get());
        }

        return (count % 2 == 0)
                ? "BOB"
                : "ANDY";

    }

}





