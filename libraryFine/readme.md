# Library Fine

Tarefa

# Library Fine

Tarefa

Sua biblioteca local precisa de sua ajuda! Dadas as datas de devolução esperadas e reais de um livro da biblioteca, crie um programa que calcule a multa (se houver). A estrutura de taxas é a seguinte:

Se o livro for devolvido na data prevista de devolução ou antes, nenhuma multa será cobrada (ou seja:.
Se o livro for devolvido após o dia esperado de devolução , mas ainda dentro do mesmo mês e ano da data prevista de devolução,.
Se o livro for devolvido após o mês esperado de devolução , mas ainda dentro do mesmo ano civil da data prevista de devolução, o.
Se o livro for devolvido após o ano civil em que era esperado, há multa fixa de.
As cobranças são baseadas apenas na medida menos precisa de atraso. Por exemplo, se um livro vence em 1º de janeiro de 2017 ou 31 de dezembro de 2017, se for devolvido em 1º de janeiro de 2018, isso significa um ano de atraso e a multa seria.

Exemplo


Os primeiros valores são a data de retorno e os segundos são a data de vencimento. Os anos são iguais e os meses são iguais. O livro édias atrasado. Retornar.

Descrição da função

Complete a função libraryFine no editor abaixo.

libraryFine tem os seguintes parâmetros:

d1, m1, y1 : data retornada dia, mês e ano, cada um um número inteiro
d2, m2, y2 : data de vencimento, dia, mês e ano, cada um um número inteiro
Devoluções

int: o valor da multa ouse não houver nenhum
Formato de entrada

A primeira linha contéminteiros separados por espaço,, denotando o respectivo,, eem que o livro foi devolvido.
A segunda linha contéminteiros separados por espaço,, denotando o respectivo,, eem que o livro deveria ser devolvido.

Restrições

Exemplo de entrada

9 6 2015
6 6 2015
Saída de amostra

45
Explicação
