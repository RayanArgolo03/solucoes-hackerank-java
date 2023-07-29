package stringRegex;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Teste {

    public static void main(String[] args) {

        //Scanner lê quantidade de elementos 
        Scanner sc = new Scanner(System.in);
        Integer count = sc.nextInt();
        sc.nextLine();

        compilador:
        for (int i = 1; i <= count; i++) {

            //Tenta compilar com Pattern
            try {
                Pattern.compile(sc.nextLine());
                System.out.println("Valid");
            }
            
            //Captura exception e retorna inválido
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}
