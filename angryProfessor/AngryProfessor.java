package angryProfessor;

import java.util.List;

public class AngryProfessor {

    public static void main(String[] args) {

    }

    public static String angryProfessor(int k, List<Integer> a) {
        return (int) a.stream()
                .filter(num -> num <= 0)
                .count() >= k ? "NO" : "YES";
    }
}
