package insertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void insertionSort1(int n, List<Integer> arr) {

        List<Integer> numbers = new ArrayList<>(arr);

        int posI, j;
        for (int i = 1; i < n; i++) {

            posI = numbers.get(i); //4
            j = i - 1;

            while (j >= 0 && numbers.get(j) > posI) {
                numbers.set(j + 1, numbers.get(j));
                j--;

                numbers.forEach(num -> System.out.print(num + " "));
                System.out.println();
            }

            numbers.set(j + 1, posI);
        }
        numbers.forEach(num -> System.out.print(num + " "));

    }

}
