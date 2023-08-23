package paresMeia;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        System.out.println(sockMerchant(7 , new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1,3, 2))));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        
        //1, 1, 1, 2, 2, 2, 3

        int count = 0;
        Collections.sort(ar);
        
        List<Integer> aux = new ArrayList<>();
        for (Integer num : ar) {
            if (!aux.contains(num)) aux.add(num);
        }
        
        //percorrer a lista aux
        for (Integer integer : aux) {
            int qtd = (int) ar.stream().filter(elemento -> elemento.equals(integer)).count();
            if (qtd >= 2 ){
                count += qtd / 2;
            }
        }           
        
        return count;
    }

}
