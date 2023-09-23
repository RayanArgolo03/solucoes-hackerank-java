# Kaprekar Numbers

Tarefa

Um número de Kaprekar modificado é um número inteiro positivo com uma propriedade especial. Se você elevar ao quadrado, dividir o número em dois inteiros e somar esses inteiros, você terá o mesmo valor com o qual começou.

Considere um número inteiro positivocomdígitos. Nós quadramospara chegar a um número que sejadígitos longos oudígitos longos. Divida a representação em string do quadrado em duas partes,e. A parte da mão direita,devemos serdígitos longos. A esquerda é a substring restante. Converta essas duas substrings de volta em números inteiros, adicione-as e veja se consegue.

Exemplo



Primeiro calcule isso. Divida isso em duas strings e converta-as novamente em números inteirose. Teste, portanto este não é um número Kaprekar modificado. Se, ainda, e. Isso nos dá, o original.

Nota: r pode ter zeros à esquerda.

Aqui está uma explicação da Wikipedia sobre o Número Kaprekar ORIGINAL (identifique a diferença!):

Em matemática, um número de Kaprekar para uma determinada base é um número inteiro não negativo, cuja representação de cujo quadrado nessa base pode ser dividida em duas partes que somam novamente o número original. Por exemplo, 45 é um número de Kaprekar, porque 45² = 2025 e 20+25 = 45.

Dados dois inteiros positivoseondeé inferior a, escreva um programa para imprimir os números Kaprekar modificados no intervalo entree, inclusive. Se não existirem números Kaprekar modificados no intervalo fornecido, imprima INVALID RANGE.

Descrição da função

Complete a função kaprekarNumbers no editor abaixo.

kaprekarNumbers tem os seguintes parâmetros:

int p: o limite inferior
int q: o limite superior
Impressões

Deve imprimir a lista de números Kaprekar modificados, separados por espaços em uma linha e em ordem crescente. Se não existirem números Kaprekar modificados no intervalo fornecido, imprima INVALID RANGE. Nenhum valor de retorno é necessário.

Formato de entrada

A primeira linha contém o limite inteiro inferior.
A segunda linha contém o limite inteiro superior.

Nota : Seu intervalo deve incluir os limites.

Restrições


Exemplo de entrada

STDIN   Function
-----   --------
1       p = 1
100     q = 100
Saída de amostra

1 9 45 55 99

Explicação

,,,, esão os números de Kaprekar modificados no intervalo fornecido.
