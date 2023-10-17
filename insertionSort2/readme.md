# Insertion Sort 2

Tarefa

Em Insertion Sort Part 1 , você inseriu um elemento em uma matriz em sua posição classificada correta. Usando a mesma abordagem repetidamente, você consegue classificar um array inteiro?

Diretriz: você já pode colocar um elemento em um array classificado. Como você pode usar esse código para construir um array ordenado, um elemento de cada vez? Observe que na primeira etapa, quando você considera um array com apenas o primeiro elemento, ele já está classificado, pois não há nada para compará-lo.

Neste desafio, imprima o array após cada iteração da ordenação por inserção, ou seja, sempre que o próximo elemento for inserido em sua posição correta. Como o array composto apenas pelo primeiro elemento já está ordenado, comece a imprimir após colocar o segundo elemento.

Exemplo .



Trabalhando da esquerda para a direita, obtemos a seguinte saída:

3  4  7  5  6  2  1 
3  4  7  5  6  2  1 
3  4  5  7  6  2  1 3 4 5 6 7 2 1 2 3 4 5 6 7 1 1 2 
3 4 5 6 7      
      
      
Descrição da função

Complete a função insertSort2 no editor abaixo.

insertSort2 possui os seguintes parâmetros:

int n: o comprimento de
int arr[n]: uma matriz de inteiros
