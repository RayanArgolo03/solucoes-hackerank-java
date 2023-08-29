package designerViewer;

import java.util.*;

public class App {


    public static void main(String[] args) {

    }

    public static int designerPdfViewer(List<Integer> h, String word) {

        int max = 0;
        for (char c : word.toCharArray()) {
            int pos = c - 'a';
            max = Math.max(h.get(pos), max);
        }

        return max * word.length();
    }

}