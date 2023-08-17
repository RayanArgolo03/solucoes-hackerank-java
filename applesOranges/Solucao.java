package applesOranges;

import java.util.*;

public class Solucao {

    public static void main(String[] args) {
        countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));
    }

    public static void countApplesAndOranges(int inicio, int fim, int posMacieira, int posLaranjeira, List<Integer> apples, List<Integer> oranges) {
        
        int qtdMacas = (int) apples.stream()
                .filter(num -> (num + posMacieira) >= inicio && (num + posMacieira) <= fim)
                .count();
        
        int qtdLaranjas = (int) oranges.stream()
                .filter(num -> (num + posLaranjeira) >= inicio && (num + posLaranjeira) <= fim)
                .count();
        
        System.out.println(qtdMacas);
        System.out.println(qtdLaranjas);
        
    }

}
