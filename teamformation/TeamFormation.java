
package teamformation;

import java.util.*;

public class TeamFormation {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        final int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = sc.nextInt();
            List<Integer> aux = new ArrayList<>();

            for (int j = 1; j <= n; j++) {
                aux.add(sc.nextInt());
            }

            System.out.println(teamFormation(aux));
        }

    }

    //Sobe Github
    private static int teamFormation(final List<Integer> aux) {

        if (aux.isEmpty()) return 0;

        Collections.sort(aux);
        final List<Integer> counts = new ArrayList<>();
        int count = 1;

        for (int i = 0; i < aux.size() - 1; i++) {
            if (Math.abs(aux.get(i) - aux.get(i + 1)) != 1) {
                counts.add(count);
                count = 0;
            }
            count++;
        }

        counts.add(count);
        if (counts.size() > 1) {
            counts.sort(Collections.reverseOrder());
            return counts.get(1);
        }

        return counts.get(0);
    }


}

