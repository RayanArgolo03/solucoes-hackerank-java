
package inverseRMQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InverseRMQ {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = (sc.nextInt() * 2) - 1;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        if (list.size() > 1 && list.stream().allMatch(num -> num.equals(list.get(0)))) {
            System.out.println("NO");
            return;
        }

        int i = 0;

        //Right sort
        do {

            while ((i < list.size() - 1) && list.get(i) > list.get(i + 1)) {
                Collections.swap(list, i, i + 1);
                i++;
            }

        } while ((i++) < list.size());

        i = list.size() - 1;

        //Left sort
        do {

            while ((i > 0) && list.get(i) < list.get(i - 1)) {
                Collections.swap(list, i, i - 1);
                i--;
            }

        } while ((i--) > 0);


        System.out.println("YES");
        list.forEach(num -> System.out.print(num + " "));

    }


}





