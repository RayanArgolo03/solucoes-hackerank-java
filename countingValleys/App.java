package countingValleys;

public class App {

    public static void main(String[] args) {
        System.out.println(countingValleys(100, "DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD"
        ));
    }

    public static int countingValleys(int steps, String path) {

        int result = 0;
        int count = 0;
        
        for (char c : path.toCharArray()) {
            if (c == 'U') count++;
            else count--;
            
            if (count == -1 && c != 'U') result++;
        }
        
        return result;
    }

}
