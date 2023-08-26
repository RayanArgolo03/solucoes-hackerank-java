package eletronicShop;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;

        for (int key : keyboards) {
            for (int drive : drives) {
                int kit = key + drive;
                max = (kit <= b && kit > max) ? kit : max;
            }
        }

        return max;
    }
}
