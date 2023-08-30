package utopianTree;

public class ArvoreUtopica {

    public static void main(String[] args) {
        
    }

    public static int utopianTree(int n) {
        int height = 1;

        for (int i = 1; i <= n ; i++) {
            if (i % 2 != 0) height *= 2;
            else height++;
        }

        return height;
    }
}
