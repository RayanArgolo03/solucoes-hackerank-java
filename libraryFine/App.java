
package LibraryFine;

public class App {
    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        boolean isAfterDay = d1 > d2  &&  m1 == m2 && y1 == y2;
        boolean isAfterMonth = m1 > m2 && y1 == y2;
        boolean isAfterYear = y1 > y2;

        return (isAfterDay)
                ? 15 * (d1 - d2)
                : (isAfterMonth)
                ? 500 * (m1 - m2)
                : (isAfterYear)
                ? 10000
                : 0;
    }
}
