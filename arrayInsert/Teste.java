package arrayInsert;

import java.util.*;

public class Teste {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.next());
        List<Integer> lista = new ArrayList<>();

        while (n-- > 0) {
            int elemento = Integer.parseInt(sc.next());
            lista.add(elemento);
        }

        int q = 0;
        if (lista.size() < 200) {
            q = Integer.parseInt(sc.next());
        }

        if (q > 0) {

            while (q-- > 0) {

                String operacao = sc.next();
                int x = Integer.parseInt(sc.next());

                if (operacao.equalsIgnoreCase("Insert")) {

                    int y = Integer.parseInt(sc.next());
                    lista.add(x, y);

                } else if (operacao.equalsIgnoreCase("Delete")) {
                    lista.remove(x);

                }
            }
        }

        for (Integer num : lista) {
            System.out.print(num + " ");
        }

    }

}
