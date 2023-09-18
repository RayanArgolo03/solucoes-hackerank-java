# Taum Day

Tarefa

aum está planejando comemorar o aniversário de seu amigo Diksha. Existem dois tipos de presentes que Diksha deseja de Taum: um é preto e o outro é branco. Para fazê-la feliz, Taum tem que comprarpresentes negros epresentes brancos.

O custo de cada presente preto éunidades.
O custo de cada presente branco éunidades.
O custo para converter um presente preto em branco ou vice-versa éunidades.
Determine o custo mínimo dos presentes de Diksha.

Exemplo





Ele pode comprar um presente preto parae convertê-lo em um presente branco para, fazendo com que o custo total de cada presente branco. Isso corresponde ao custo de um presente branco, então ele pode fazer isso ou apenas comprar presentes pretos e presentes brancos. De qualquer forma, o custo total é.

Descrição da função

Complete a função taumBday no editor abaixo. Deve retornar o custo mínimo de obtenção dos presentes desejados.

taumBday possui os seguintes parâmetros:

int b : o número de presentes pretos
int w : o número de presentes brancos
int bc : o custo de um presente preto
int wc : o custo de um presente branco
int z : o custo para converter um presente de cor em outra cor
Devoluções

int: o custo mínimo para comprar os presentes
Formato de entrada

A primeira linha conterá um número inteiro, o número de casos de teste.

Nas próximaspares de linhas são os seguintes:
- A primeira linha contém os valores dos inteirose.
- A próxima linha contém os valores dos inteiros,, e.

Restrições



Formato de saída

linhas, cada uma contendo um número inteiro: a quantidade mínima de unidades que Taum precisa gastar em presentes.

Exemplo de entrada

STDIN   Function
-----   --------
5       t = 5
10 10   b = 10, w = 10
1 1 1   bc = 1, wc = 1, z = 1
5 9     b = 5, w = 5
2 3 4   bc = 2, wc = 3, z = 4
3 6     b = 3, w = 6
9 1 1   bc = 9, wc = 1, z = 1
7 7     b = 7, w = 7
4 2 1   bc = 4, wc = 2, z = 1
3 3     b = 3, w = 3
1 9 2   bc = 1, wc = 9, z = 2
Saída de amostra

20
37
12
35
12
Explicação

Caso de teste nº 01:
Como os presentes pretos custam o mesmo que os brancos, não há benefício em convertê-los. Taum terá que comprar cada presente por 1 unidade. O custo de compra de todos os presentes será:.

Caso de teste nº 02:
Novamente, ele não pode diminuir o custo de presentes em preto ou branco convertendo cores.É muito alto. Ele comprará presentes pelos preços originais, então o custo de compra de todos os presentes será:.

Caso de teste nº 03:
desde, ele vai comprarpresentes brancos pelo preço original de.dos presentes deve ser preto e o custo por conversão,. O custo total é.

Caso de teste nº 04:
Da mesma forma, ele comprarápresentes brancos pelo preço original,. Para presentes pretos, ele primeiro comprará os brancos e os colorirá de preto, para que seu custo seja reduzido para. Portanto, o custo de compra de todos os presentes será:.

Caso de teste nº 05: Ele comprará presentes pretos pelo preço original,. Para presentes brancos, ele primeiro receberá presentes pretos no valorunidade e pinte-os de branco paraunidades. O custo dos presentes brancos é reduzido paraunidades. O custo de compra de todos os presentes será:.
