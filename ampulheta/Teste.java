package ampulheta;

import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //36 elementos
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int linha = arr.size() - 2;
        int coluna = arr.get(0).size() - 2;

        int maiorSoma = Integer.MIN_VALUE;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {

                //Primeira Coluna
                int somaAtual = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);

                //Segunda coluna
                somaAtual += arr.get(i + 1).get(j + 1);

                //Terceira coluna
                somaAtual += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                maiorSoma = Math.max(maiorSoma, somaAtual);
            }
        }

        System.out.println();
        System.out.println(maiorSoma);

    }

}
