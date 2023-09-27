# Minimum Distances

Tarefa

A distância entre dois valores de array é o número de índices entre eles. Dado, encontre a distância mínima entre qualquer par de elementos iguais na matriz. Se tal valor não existir, retorne.

Exemplo

Existem dois pares de valores correspondentes:e. Os índices dosãoe, então a distância deles é. Os índices dosãoe, então a distância deles é. A distância mínima é.

Descrição da função

Complete a função mínimaDistances no editor abaixo.

mínimaDistances tem os seguintes parâmetros:

int a[n]: uma matriz de inteiros
Devoluções

int: a distância mínima encontrada ouse não houver elementos correspondentes
Formato de entrada

A primeira linha contém um inteiro, o tamanho da matriz.
A segunda linha contéminteiros separados por espaço.

Restrições

Formato de saída

Imprima um único número inteiro denotando o mínimoem. Se esse valor não existir, imprima.

Exemplo de entrada

STDIN           Function
-----           --------
6               arr[] size n = 6
7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]
Saída de amostra

3
Explicação
Existem dois pares a considerar:

esão ambos, então.
esão ambos, então.
A resposta é.
