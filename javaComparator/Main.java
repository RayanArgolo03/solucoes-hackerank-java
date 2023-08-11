
package generico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(sc.nextLine());
        List<Player> jogadores = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
           jogadores.add(new Player(sc.next(), Integer.valueOf(sc.next())));
        }
        
        
        jogadores.sort(new PlayerComparator());
        System.out.println();
        
        jogadores.stream().forEach(jogador -> System.out.println(jogador));
    }   
}

class Player {

    private String nome;
    private Integer pontos;

    public Player(String nome, Integer pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    @Override
    public String toString() {
        return nome +" "+ pontos;
    }
    
}


class PlayerComparator implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        
        //Compara pelo valor léxico
        if (p1.getNome().equals(p2.getNome())) return p1.getNome().compareTo(p2.getNome());
        
        //Positivo: Troca p1 por p2
        
        //Negativo: Mantém, pois p2 > p1
        
        return p2.getPontos() - p1.getPontos();
        
    }
    

}

