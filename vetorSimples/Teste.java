package vetorSimples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste {

    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Lê número de elementos
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        //Vetor com elementos
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }

        //Exibe elementos
        for (int num : vetor) {
            System.out.println(num);
        }

        bufferedReader.close();

    }
}
