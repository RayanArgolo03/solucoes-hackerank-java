# ACM Team

Tarefa

Várias pessoas estarão presentes nas Finais Mundiais ACM-ICPC . Cada um deles pode ser bem versado em vários tópicos. Dada uma lista de tópicos conhecidos por cada participante, apresentada como sequências binárias, determine o número máximo de tópicos que uma equipe de 2 pessoas pode conhecer. Cada assunto possui uma coluna na string binária, e '1' significa que o assunto é conhecido, enquanto '0' significa que não é. Determine também o número de equipes que conhecem o número máximo de tópicos. Retorna uma matriz inteira com dois elementos. O primeiro é o número máximo de tópicos conhecidos e o segundo é o número de equipes que conhecem esse número de tópicos.

Exemplo



Os dados do participante estão alinhados para maior clareza abaixo:

10101
11110
00010
Estas são todas as equipes possíveis que podem ser formadas:

Members Subjects
(1,2)   [1,2,3,4,5]
(1,3)   [1,3,4,5]
(2,3)   [1,2,3,4]
Neste caso, a primeira equipe conhecerá todas as 5 disciplinas. Eles são a única equipe que pode ser criada que conhece tantos assuntos, entãoé retornado.

Descrição da função

Complete a função acmTeam no editor abaixo.
acmTeam possui os seguintes parâmetros:

tópico de string: uma string de dígitos binários
Devoluções

int[2]: o máximo de tópicos e o número de equipes que conhecem tantos tópicos
Formato de entrada

A primeira linha contém dois inteiros separados por espaçoe, ondeé o número de participantes eé o número de tópicos.

Cada um dos próximoslinhas contém uma string binária de comprimento.

Restrições



Exemplo de entrada

4 5
10101
11100
11010
00101
Saída de amostra

5
2
Explicação

Calculando tópicos conhecidos para todas as permutações de 2 participantes, obtemos:







As 2 equipes ( 1, 3 ) e ( 3, 4 ) conhecem todos os 5 tópicos, o que é máximo.
