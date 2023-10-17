package insertionSort2;


import java.util.ArrayList;
import java.util.List;

public class InsertionSort2 {

    public static void insertionSort2(int n, List<Integer> arr) {

        List<Integer> numbers = new ArrayList<>(arr);
        int posI, j;

        for (int i = 1; i < n; i++) {
            posI = numbers.get(i);

            j = i - 1;
            while (j >= 0 && numbers.get(j) > posI){
                numbers.set(j + 1, numbers.get(j));
                j--;
            }

            numbers.set(j + 1, posI);
            numbers.forEach(num -> System.out.print(num + " "));
            System.out.println();
        }

    }
}
