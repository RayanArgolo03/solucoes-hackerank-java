package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.next()) * 2;
        
        Map<String, Integer> mapa = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            
            String nome = sc.nextLine();
            int telefone = sc.nextInt();

            //Mapa não tem esse par chave valor
            if (mapa.get(nome) == null) mapa.put(nome, telefone);
        }


        while (sc.hasNext()){
        
        String nome = sc.nextLine();
        
            try {
                
                int contato = mapa.get(nome);
                System.out.println(nome + "=" +contato);
                
            } catch (RuntimeException e) {
           
                System.out.println("Not found");
            
            }
            
        
        }

    }

}
