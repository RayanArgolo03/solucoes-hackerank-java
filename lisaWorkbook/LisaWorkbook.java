package lisaWorkbook;

import java.util.Arrays;
import java.util.List;

public class LisaWorkbook {

    public static void main(String[] args) {
        System.out.println(workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10)));
    }

    public static int workbook(int n, int k, List<Integer> arr) {

        int specialProblems = 0;
        int problems = 0;
        int pageNumber = 1;
        int problemsPerPage = 0;

        for (int chapter = 1; chapter <= n; chapter++) {

            int currentProblems = arr.get(chapter - 1);

            while (problems != currentProblems) {

                problems++;
                problemsPerPage++;

                if (pageNumber == problems) {
                    specialProblems++;
                }

                if (problemsPerPage == k || problems == currentProblems) {
                    pageNumber++;
                    problemsPerPage = 0;
                }

            }

            problems = 0;
            problemsPerPage = 0;

        }

        return specialProblems;
    }
}
