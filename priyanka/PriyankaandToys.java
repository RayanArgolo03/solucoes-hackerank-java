
package priyanka;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PriyankaandToys {

    public static void main(String[] args) {
        System.out.println(toys(List.of(12, 15, 7, 8, 19, 24)));
    }

    public static int toys(List<Integer> w) {

        //TODO Ver código nas respostas

        int countContainers = 0;
        List<Integer> aux = new ArrayList<>(w);
        Predicate<Integer> hasContainer = num -> num >= aux.get(0) && num <= aux.get(0) + 4;

        do {
            aux.removeIf(hasContainer);
            countContainers++;
        } while (!aux.isEmpty());

        return countContainers;
    }

}





