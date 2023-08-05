package arrayList;

import java.util.*;

public class Teste {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdLinhas = Integer.parseInt(sc.next());
        List<List<Integer>> lista = new ArrayList<>();

        while (qtdLinhas-- > 0) {

            //Qtd elementos da linha atual
            int qtdElementos = Integer.parseInt(sc.next());
            List<Integer> aux = new ArrayList<>();

            while (qtdElementos-- > 0) {
                aux.add(Integer.valueOf(sc.next()));
            }

            lista.add(aux);

        }

        int qtdConsultas = sc.nextInt();

        while (qtdConsultas-- > 0) {


            int linha = sc.nextInt() - 1;
            int coluna = sc.nextInt() - 1;

            try {
                System.out.println(String.valueOf(lista.get(linha).get(coluna)));
            } 
            
            catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

        }

    }

}
