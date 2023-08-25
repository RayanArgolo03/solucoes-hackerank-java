# Counting Vallyes

Tarefa

Um caminhante ávido mantém registros meticulosos de suas caminhadas. Durante a última caminhada que durou exatamentedegraus, para cada degrau anotava-se se era uma subida ,, ou uma descida ,etapa. As caminhadas sempre começam e terminam ao nível do mar, e cada degrau acima ou abaixo representa ummudança de unidade na altitude. Definimos os seguintes termos:

Uma montanha é uma sequência de degraus consecutivos acima do nível do mar, começando com uma subida do nível do mar e terminando com uma descida até o nível do mar.
Um vale é uma sequência de degraus consecutivos abaixo do nível do mar, começando com um degrau abaixo do nível do mar e terminando com um degrau até o nível do mar.
Dada a sequência de subidas e descidas de degraus durante uma caminhada, encontre e imprima o número de vales percorridos.

Exemplo

 

O caminhante entra primeiro em um valeunidades de profundidade. Então eles escalam e sobem uma montanhaunidades de altura. Por fim, o caminhante retorna ao nível do mar e encerra a caminhada.

Descrição da função

Complete a função countValleys no editor abaixo.

countValleys tem os seguintes parâmetros:

int steps : o número de passos na caminhada
string path : uma string que descreve o caminho
Devoluções

int: o número de vales percorridos
Formato de entrada

A primeira linha contém um inteiro, o número de passos na caminhada.
A segunda linha contém uma única string, decaracteres que descrevem o caminho.

Restrições

Exemplo de entrada

8
UDDDUDUU
Saída de amostra

1
Explicação

Se representarmos _como nível do mar, um degrau para cima como /e um degrau para baixo como \, a caminhada pode ser desenhada como:

_/\      _
   \    /
    \/\/
O caminhante entra e sai de um vale
