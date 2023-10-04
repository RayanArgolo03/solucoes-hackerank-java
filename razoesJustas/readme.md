# Razões Justas

Tarefa

Você é o governante benevolente do Castelo Rankhacker e hoje está distribuindo pão. Seus súditos estão em fila e alguns deles já têm alguns pães. Os tempos estão difíceis e os estoques de alimentos do seu castelo estão diminuindo, então você deve distribuir o mínimo de pães possível de acordo com as seguintes regras:

Toda vez que você dá um pão para alguém, você também deve dar um pão para a pessoa imediatamente à frente ou atrás dela na fila (ou seja, pessoasou).
Depois de distribuídos todos os pães, cada pessoa deverá receber um número par de pães.
Dado o número de pães que cada cidadão já possui, encontre e imprima o número mínimo de pães que você deve distribuir para satisfazer as duas regras acima. Se isso não for possível, imprima NO.

Exemplo

Podemos primeiro dar um pão paraeentão.
Em seguida, damos um pão paraee temque satisfaz nossas condições.
Todas as contagens agora são números pares. Tivemos que distribuirpães.

Descrição da função

Complete a função fairRations no editor abaixo.

fairRations tem os seguintes parâmetros:

int B[N]: o número de pães com os quais cada pessoa começa
Devoluções

string: o número mínimo de pães necessários, expresso como uma string ou 'NÃO'
Formato de entrada

A primeira linha contém um inteiro, o número de assuntos na fila do pão.

A segunda linha contéminteiros separados por espaço.

Restrições

, onde
Formato de saída

Exemplo de entrada 0

Função STDIN 
----- -------- 
5 B[] tamanho N = 5 
2 3 4 5 6 B = [2, 3, 4, 5, 6]   
Exemplo de saída 0

4
Explicação 0

A distribuição inicial é. Os requisitos podem ser atendidos da seguinte forma:

Darpão para cada uma das segundas e terceiras pessoas, para que a distribuição seja.
Darpão para cada uma, para a terceira e quarta pessoas, para que a distribuição seja.
Cada um dossujeitos tem um número par de pães depoispães foram distribuídos.

Exemplo de entrada 1

2
1 2
Exemplo de saída 1

NO
Explicação 1

A distribuição inicial é. Como existem apenaspessoas na fila, sempre que você dá um pão para uma pessoa, você deve sempre dar um pão para a outra pessoa. Como a primeira pessoa tem um número ímpar de pães e a segunda pessoa um número par de pães, nenhuma quantidade de pães distribuídos resultará em que ambos os sujeitos tenham um número par de pães.
