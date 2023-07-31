package palindromo;

import java.util.Scanner;

public class Teste {
    
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (SC.hasNext()){
            
            String s = SC.nextLine();
            
            if (new StringBuilder(s).reverse().toString().equals(s)) System.out.println("Yes");
            else System.out.println("No");   
        }
        
    }
}
