# Ampulheta 

Tarefa 

Você recebe uma matriz 2D. Uma ampulheta em uma matriz é uma porção com a seguinte forma:

a b c
   d
e f g
Por exemplo, se criarmos uma ampulheta usando o número 1 dentro de um array cheio de zeros, ela pode ficar assim:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Na verdade, existem muitas ampulhetas na matriz acima. As três ampulhetas mais à esquerda são as seguintes:

1 1 1 1 1 0 1 0 0
   1 0 0
1 1 1 1 1 0 1 0 0
A soma de uma ampulheta é a soma de todos os números dentro dela. A soma das ampulhetas acima são 7, 4 e 2, respectivamente.

Neste problema, você deve imprimir a maior soma entre todas as ampulhetas do array.

Formato de entrada

Haverá exatamente linhas, cada uma contendo números inteiros separados por espaços. Cada número inteiro estará entre e inclusive.

Formato de saída

Imprima a resposta para este problema em uma única linha.

Entrada de amostra

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Saída de amostra

19
Explicação

A ampulheta que tem a maior soma é:

2 4 4
   2
1 2 4
Linguagem
Java 15
Mais
1234567891011121314151617181920
}

Linha: 50 Col: 1

Testar contra entrada personalizada
