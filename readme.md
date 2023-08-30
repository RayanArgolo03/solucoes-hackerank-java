# Dias no Cinema

Tarefa

Lily gosta de jogar com números inteiros. Ela criou um novo jogo onde determina a diferença entre um número e seu reverso. Por exemplo, dado o número, seu inverso é. A diferença deles é. O númeroinvertido é, e sua diferença é.

Ela decide aplicar seu jogo à tomada de decisões. Ela verá uma série de dias numerados e só irá ao cinema em um dia bonito .

Dado um intervalo de dias numerados,e um número, determine o número de dias bonitos no intervalo . Números bonitos são definidos como números ondeé igualmente divisível por. Se o valor de um dia é um número bonito, é um dia lindo. Retorne o número de dias bonitos no intervalo.

Descrição da função

Complete a função beautifulDays no editor abaixo.

beautifulDays tem os seguintes parâmetros:

int i: o número do dia inicial
int j: o número do dia final
int k: o divisor
Devoluções

int: o número de dias bonitos no intervalo
Formato de entrada

Uma única linha de três inteiros separados por espaço descrevendo os respectivos valores de,, e.

Restrições

Exemplo de entrada

20 23 6
Saída de amostra

2
Explicação

Lily pode ir ao cinema em dias,,, e. Realizamos os seguintes cálculos para determinar quais dias são bonitos :

Diaé lindo porque o seguinte é avaliado como um número inteiro:
Dianão é bonito porque o seguinte não é avaliado como um número inteiro:
Diaé lindo porque o seguinte é avaliado como um número inteiro:
Dianão é bonito porque o seguinte não é avaliado como um número inteiro:
Apenas dois dias,e, neste intervalo são lindos. Assim, imprimimoscomo nossa resposta.
