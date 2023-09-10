# Jumping On Clouds

Tarefa

Há um novo jogo para celular que começa com nuvens numeradas consecutivamente. Algumas das nuvens são nuvens de tempestade e outras são cúmulos. O jogador pode pular em qualquer nuvem cúmulo que tenha um número igual ao número da nuvem atual maisou. O jogador deve evitar as tempestades. Determine o número mínimo de saltos necessários para saltar da posição inicial até a última nuvem. Sempre é possível ganhar o jogo.

Para cada jogo, você receberá uma série de nuvens numeradasse eles estão seguros ouse devem ser evitados.

Exemplo

Indexe a matriz de. O número em cada nuvem é o seu índice na lista, então o jogador deve evitar as nuvens nos índicese. Eles poderiam seguir estes dois caminhos:ou. O primeiro caminho levapula enquanto o segundo leva. Retornar.

Descrição da função

Complete a função jumpingOnClouds no editor abaixo.

jumpingOnClouds tem os seguintes parâmetros:

int c[n] : uma matriz de inteiros binários
Devoluções

int: o número mínimo de saltos necessários
Formato de entrada

A primeira linha contém um inteiro, o número total de nuvens. A segunda linha contéminteiros binários separados por espaço que descrevem nuvensonde.

Restrições

Formato de saída

Imprima o número mínimo de saltos necessários para vencer o jogo.

Exemplo de entrada 0

7
0 0 1 0 0 1 0
Exemplo de saída 0

4
Explicação 0:
O jogador deve evitare. O jogo pode ser ganho com um mínimo desalta:

pular (2).png

Exemplo de entrada 1

6
0 0 0 0 1 0
Exemplo de saída 1

3
Explicação 1:
A única nuvem de tempestade a evitar é. O jogo pode ser ganho emsalta:
