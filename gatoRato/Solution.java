package gatoRato;

public class Solution {

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 3, 2));
    }

    public static String catAndMouse(int x, int y, int z) {
        
        int differenceCatA = Math.abs(z - x);
        int differenceCatB = Math.abs(z - y);
        
        return (differenceCatA < differenceCatB)
                ? "Cat A"
                : (differenceCatB < differenceCatA)
                ? "Cat B"
                : "Mouse C";
    }
}
