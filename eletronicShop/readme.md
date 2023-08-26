# Eletronic Shop

Tarefa

Uma pessoa deseja determinar o teclado de computador e a unidade USB mais caros que podem ser adquiridos com um determinado orçamento. Dadas as listas de preços de teclados e unidades USB e um orçamento, encontre o custo para comprá-los. Caso não seja possível comprar os dois itens, devolva.

Exemplo



A pessoa pode comprar um, ou um. Escolha esta última como a opção mais cara e devolva.

Descrição da função

Complete a função getMoneySpent no editor abaixo.

getMoneySpent tem os seguintes parâmetros:

int teclados[n] : os preços dos teclados
int drives[m] : os preços dos drives
int b : o orçamento
Devoluções

int: o máximo que pode ser gasto, ouse não for possível comprar os dois itens
Formato de entrada

A primeira linha contém três inteiros separados por espaço,, e, o orçamento, o número de modelos de teclado e o número de modelos de unidades USB.
A segunda linha contéminteiros separados por espaço, os preços de cada modelo de teclado.
A terceira linha contéminteiros separados por espaço, os preços das unidades USB.

Restrições

O preço de cada item está na faixa inclusiva.
Exemplo de entrada 0

10 2 3
3 1
5 2 8
Exemplo de saída 0

9
