package stringRegex2;

import java.util.*;
import java.util.regex.*;

public class Teste {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        int n = Integer.parseInt(sc.nextLine());
        
        while (n-- > 0){
        
            String s = sc.nextLine();
            Matcher matcher = pattern.matcher(s);
            
            while (matcher.find()) {                
                s = s.replaceAll(matcher.group(), matcher.group(1));
            }
            
            
            System.out.println(s);
            
        }
        
        sc.close();

    }

}
