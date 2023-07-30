package stringRegex3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Teste {

    private static final Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args) {
        
        String regex = "^[A-Za-z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {

            String s = sc.nextLine();
            
            String nomeValido = pattern.matcher(s).matches()
                    ? "Valid"
                    : "Invalid";

    
            System.out.println(nomeValido);

        }

    }

}
