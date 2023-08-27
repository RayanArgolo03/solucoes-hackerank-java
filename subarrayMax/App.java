package subarrayMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }

    public static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);

        List<Integer> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        interno:
        for (int i = 0; i < a.size(); i++) {
            temp.add(a.get(i));

            externo:
            for (int j = i + 1; j < a.size(); j++) {
                int difference = a.get(j) - a.get(i);

                if (difference <= 1) temp.add(a.get(j));
                else break externo;
            }

            if (temp.size() > res.size()) {
                res.clear();
                res.addAll(temp);
            }


            temp.clear();
        }

        return res.size();
    }
}
