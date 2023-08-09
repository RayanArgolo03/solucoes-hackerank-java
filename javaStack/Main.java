package javaStack;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (sc.hasNext()) {
            System.out.println(valido (sc.next()));
        }
    }
    
    public static boolean valido (String s){
        
        Stack<Character> pilha = new Stack<>();
        
        //Percorre string
        for (Character c : s.toCharArray()) {
            
            
            if (c == '(' || c == '[' || c == '{'){
                pilha.push(c);
            }
            
            else if (pilha.isEmpty()){
                return false;
            }
            
            
            else {
            
                char topo = pilha.pop();
                if (topo =='(' && c != ')' || topo =='{' && c != '}' || topo =='[' && c != ']'){
                    return false;
                }
                    
            }
            
        }
        
        return pilha.isEmpty();
    }
}
