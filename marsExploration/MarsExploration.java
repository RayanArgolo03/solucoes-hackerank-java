
package marsExploration;

public class MarsExploration {

    public static void main(String[] args) {
        System.out.println(marsExploration("SSSSSSSSSSSSSSOOOOOOOOOOOOOOOOOOOOOOSSSSSSSO"));
    }


    public static int marsExploration(String s) {

        int count = 0;
        int i = 0;

        while (i < s.length() - 2) {

            String temp = s.substring(i, i + 3);
            for (int j = 0; j < temp.toCharArray().length; j++) {

                if (j % 2 == 0 && temp.charAt(j) != 'S' || j % 2 != 0 && temp.charAt(j) != 'O') {
                    count++;
                }

            }

            i += 3;
        }

        return count;
    }
}


