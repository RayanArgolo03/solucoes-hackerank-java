package subArrays;

import java.util.Scanner;

public class Teste {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Recebe um número de elementos
        int n = Integer.parseInt(SC.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(SC.next());
        }
        
        
        //Percorre lista
        int qtdNegativos = 0;
        int soma = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                
                //Soma sub arrays, se negativo ++ na quantidade
                soma += arr[j];
                if (soma < 0) qtdNegativos++;
            }
            
            soma = 0;
        }
        
        System.out.println(qtdNegativos);
        
    }

}
