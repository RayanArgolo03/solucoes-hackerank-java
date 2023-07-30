package stringTags;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.nextLine());
        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");

        while (n-- > 0) {

            String s = sc.nextLine();
            Matcher m = p.matcher(s);
            boolean deuMatch = false;
            
            while (m.find()){
                System.out.println(m.group(2));
                deuMatch = true;    
            }
            
            
            if (!deuMatch) System.out.println("None");
        }

        sc.close();
    }

}
