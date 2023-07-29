package stringToken;

import java.util.*;

public class Teste {

    public static void main(String[] args) {

        //Gera scanner e lê entrada
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        //Verifica se há caracteres na string 
        if (str.length() >= 1) {
            
            //Split com regex para dividir na primeira ocorrência de não espaço
            String[] vetor = str.split("[^a-zA-Z]+");
            
            //Exibe conteúdo
            System.out.println(vetor.length);
            for (String s : vetor) {
                System.out.println(s);
            }
        
        }
        
        //Exibe 0 length
        else {
            System.out.println("0");
        }

        sc.close();
    }

}
