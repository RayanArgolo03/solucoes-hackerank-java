package hurdleRace;

import java.util.*;

public class App {


    public static void main(String[] args) {

    }

    public static int hurdleRace(int k, List<Integer> height) {
        int max = height.stream().mapToInt(Integer :: intValue).max().getAsInt();
        return (max > k) ? max - k: 0;
    }
}