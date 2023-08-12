package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.next());
        List<Aluno> alunos = new ArrayList<>();
        
        while (n -- > 0){
            
            Integer id = Integer.valueOf(sc.next());
            String nome = sc.next();
            Double nota = Double.valueOf(sc.next());
            
            alunos.add(new Aluno(id, nome, nota));
        }
        
        alunos.sort(new AlunoComparator());
        alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }
}

class Aluno {

    private Integer id;
    private String nome;
    private Double nota;

    public Aluno(Integer id, String nome, Double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

}
class AlunoComparator implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        
        int comparacao = - aluno1.getNota().compareTo(aluno2.getNota());
        
        if (comparacao == 0){
            
             comparacao = aluno1.getNome().compareTo(aluno2.getNome());
             
             if (comparacao == 0){ comparacao = aluno1.getId().compareTo(aluno2.getId()); }
        }
        
        return comparacao;
        
    }    

}

