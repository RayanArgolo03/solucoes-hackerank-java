#Maior Subarray

 Tarefa

Dada uma matriz de inteiros, encontre a submatriz mais longa onde a diferença absoluta entre quaisquer dois elementos seja menor ou igual a.

Exemplo


Existem duas submatrizes que atendem ao critério:e. A submatriz de comprimento máximo temelementos.

Descrição da função

Complete a função pickingNumbers no editor abaixo.

pickingNumbers possui os seguintes parâmetros:

int a[n]: uma matriz de inteiros
Devoluções

int: o comprimento da submatriz mais longa que atende ao critério
Formato de entrada

A primeira linha contém um único inteiro, o tamanho da matriz.
A segunda linha contéminteiros separados por espaço, cada um.

Restrições

A resposta será.
Exemplo de entrada 0

6 
4 6 5 3 3 1
Exemplo de saída 0

3
Explicação 0

Escolhemos o seguinte multiconjunto de inteiros do array:. Cada par no multiset tem uma diferença absoluta(ou seja,e), então imprimimos o número de inteiros escolhidos,, como nossa resposta.

Exemplo de entrada 1

6 
1 2 2 3 1 2
Exemplo de saída 1

5
Explicação 1

Escolhemos o seguinte multiconjunto de inteiros do array:. Cada par no multiset tem uma diferença absoluta(ou seja,,, e), então imprimimos o número de inteiros escolhidos,, como nossa resposta.
