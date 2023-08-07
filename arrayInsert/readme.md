# Java Array List Operations

Tarefa

Para este problema, temos tipos de consultas que você pode realizar em uma Lista:

Inserir no índice:

Inserir
x y
Exclua o elemento no índice:

Excluir
x
Dada uma lista, , de inteiros, execute consultas na lista. Depois que todas as consultas forem concluídas, imprima a lista modificada como uma única linha de inteiros separados por espaços.

Formato de entrada

A primeira linha contém um número inteiro (o número inicial de elementos em ).
A segunda linha contém inteiros separados por espaço descrevendo .
A terceira linha contém um número inteiro (o número de consultas).
As linhas subsequentes descrevem as consultas e cada consulta é descrita em duas linhas:

Se a primeira linha de uma consulta contiver String Insert, a segunda linha conterá dois inteiros separados por espaço e o valor deverá ser inserido em index .
Se a primeira linha de uma consulta contiver String Delete, a segunda linha conterá index , cujo elemento deve ser excluído de .
Restrições



Cada elemento em é um inteiro de 32 bits.
Formato de saída

Imprima a lista atualizada como uma única linha de números inteiros separados por espaços.

Entrada de amostra

5
12 0 1 78 12
2
Inserir
5 23
Excluir
0
Saída de amostra

0 1 78 12 23
Explicação


  Insira 23 no índice .

  Exclua o elemento em index .

Depois de realizar todas as consultas, imprimimos como uma única linha de inteiros separados por espaço.
