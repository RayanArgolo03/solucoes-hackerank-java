package razoesJustas;

import java.util.ArrayList;
import java.util.List;

public class RazoesJustas {
    public static void main(String[] args) {
        System.out.println(fairRations(List.of(4, 5, 6, 7)));
    }

    public static String fairRations(List<Integer> B) {

        if (B.stream().mapToInt(Integer::intValue).sum() % 2 != 0) return "NO";

        int res = 0;
        List<Integer> aux = new ArrayList<>(B);

        for (int i = 0; i < aux.size() - 1; i++) {

            if (aux.get(i) % 2 != 0) {
                res += 2;
                aux.set(i, aux.get(i) + 1);
                aux.set(i + 1, aux.get(i + 1) + 1);
            }

        }

        return String.valueOf(res);
    }

}
