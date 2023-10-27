
package zigZag;

import java.util.Arrays;

public class ZigZag {


    public static void main(String[] args) {
        findZigZagSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 7);
        //1, 2, 3, 5, 4
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int k = (n) / 2;
        int temp = a[k];
        a[k] = a[n - 1];
        a[n - 1] = temp;

        int postMiddle = k + 1;
        int penultimate = n - 2;
        while (penultimate < n - 1) {
            temp = a[postMiddle];
            a[postMiddle] = a[penultimate];
            a[penultimate] = temp;
            postMiddle = postMiddle + 1;
            penultimate = penultimate + 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
