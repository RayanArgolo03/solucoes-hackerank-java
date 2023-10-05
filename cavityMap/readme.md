# Cavity Map

Tarefa

Você recebe um mapa quadrado como uma matriz de strings inteiras. Cada célula do mapa possui um valor que indica sua profundidade. Chamaremos uma célula do mapa de cavidade se e somente se esta célula não estiver na borda do mapa e cada célula adjacente a ela tiver profundidade estritamente menor . Duas células são adjacentes se tiverem um lado ou aresta comum .

Encontre todas as cavidades no mapa e substitua suas profundidades pelo caractere maiúsculo X .

Exemplo

A grade é reorganizada para maior clareza:

989
191
111
Retornar:

989
1X1
111
A célula central era mais profunda do que as das bordas: [8,1,1,1] . As células profundas nos dois cantos superiores não compartilham uma borda com a célula central e nenhuma das células da borda é elegível.

Descrição da função

Complete a função cavidadeMap no editor abaixo.

cavidadeMap tem os seguintes parâmetros:

string grid[n]: cada string representa uma linha da grade
Devoluções

string{n}: a grade modificada
Formato de entrada

A primeira linha contém um inteiro, o número de linhas e colunas na grade.

Cada um dos seguinteslinhas ( linhas ) contémdígitos positivos sem espaços ( colunas ) que representam a profundidade em.

Restrições


Exemplo de entrada

STDIN   Function
-----   --------
4       grid[] size n = 4
1112    grid = ['1112', '1912', '1892', '1234']
1912
1892
1234
Saída de amostra

1112
1X12
18X2
1234
Explicação

As duas células com profundidade 9 não estão na borda e são cercadas por todos os lados por células mais rasas. Seus valores são substituídos por X.
