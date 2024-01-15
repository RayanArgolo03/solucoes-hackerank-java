
package matrixLand;


import java.util.Arrays;
import java.util.List;

public class MatrixLand {

    public static void main(String[] args) {

        System.out.println(matrixLand(List.of(
                Arrays.asList(1, 2, 3, -1, -2),
                Arrays.asList(-5, -8, -1, 2, 20),
                Arrays.asList(1, 2, 3, -250, 100),
                Arrays.asList(1, 1, 1, 1, 20)
        )));
    }

    public static int matrixLand(List<List<Integer>> A) {

        int rows = A.size();
        int columns = A.get(0).size();
        int i = 0;
        int j = 0;


        //Initialising with points from first position
        int points = A.get(i).get(j); //1


        do {

            int currentRow = i;
            int currentColumn = j;

            //Right
            if ((i < (columns - 1)) && nextIsBigger(A.get(i).get(j + 1), A.get(currentRow).get(currentColumn))) {
                currentColumn = j + 1;
            }

            //Left
            if ((i > 0) && nextIsBigger(A.get(i).get(j - 1), A.get(currentRow).get(currentColumn))) {
                currentColumn = j - 1;
            }

            //Down
            if ((i < (rows - 1)) && nextIsBigger(A.get(i + 1).get(j), A.get(currentRow).get(currentColumn))) {
                currentRow = i + 1;
            }

            i = currentRow;
            j = currentColumn;

            points += A.get(i).get(j);

        } while (i != rows - 1 && j != columns - 1);

        return points;
    }

    private static boolean nextIsBigger(int next, int current) {
        return next >= current;
    }


}





