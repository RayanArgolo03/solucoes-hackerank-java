package anagrama;

import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        System.out.println(isAnagram("heLo", "hello"));
    }
    
    public static boolean isAnagram (String a, String b){
        
        //Caso estejam vazias
        if (a.isEmpty() || b.isEmpty()) return false;
        
        //Equalizando strings
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        //Criando vetores das strings
        char[] vetorA = a.toCharArray();
        char[] vetorB = b.toCharArray();
        
        //Organizando strings em vetor
        Arrays.sort(vetorA);
        Arrays.sort(vetorB);
        
        //Retorna true se os dois forem iguais
        return Arrays.equals(vetorA, vetorB);
        
    }
}
