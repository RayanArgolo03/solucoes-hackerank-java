# Quebrando Recordes

Tarefa

Maria joga basquete universitário e quer se profissionalizar. Cada temporada ela mantém um registro de seu jogo. Ela tabula o número de vezes que quebrou seu recorde da temporada de mais pontos e menos pontos em um jogo. Os pontos marcados no primeiro jogo estabelecem seu recorde na temporada, e ela começa a contar a partir daí.

Exemplo

As pontuações estão na mesma ordem dos jogos. Ela tabula seus resultados da seguinte forma:

                                     Contar
    Pontuação do jogo Mínimo Máximo Min Max
     0 12 12 12 0 0
     1 24 12 24 0 1
     2 10 10 24 1 1
     3 24 10 24 1 1
Dadas as pontuações de uma temporada, determine o número de vezes que Maria quebra seus recordes de mais e menos pontos marcados durante a temporada.

Descrição da função

Conclua a função de quebra de registros no editor abaixo.

"breakingRecords" tem o(s) seguinte(s) parâmetro(s):

int scores[n]: pontos marcados por jogo
devoluções

int[2]: Uma matriz com o número de vezes que ela quebrou seus recordes. Índiceé para quebrar a maioria dos recordes de pontos e indexaré para quebrar recordes de pontos mínimos .
Formato de entrada

A primeira linha contém um inteiro, o número de jogos.
A segunda linha contéminteiros separados por espaço descrevendo os respectivos valores de.

Restrições

Exemplo de Entrada 0

9 
10 5 20 20 4 5 2 25 1
Saída de amostra 0

2 4
Explicação 0

O diagrama abaixo mostra o número de vezes que Maria quebrou seus melhores e piores recordes ao longo da temporada:

imagem

Ela quebrou seu melhor recorde duas vezes (depois dos jogose) e seu pior recorde quatro vezes (depois de jogos,,, e), então imprimimos 2 4como nossa resposta. Observe que ela não quebrou seu recorde de melhor pontuação durante o jogo, já que sua pontuação naquele jogo não foi estritamente maior do que seu melhor recorde na época.

Exemplo de entrada 1

10 
3 4 21 36 10 28 35 5 24 42
Saída de amostra 1

4 0
Explicação 1

O diagrama abaixo mostra o número de vezes que Maria quebrou seus melhores e piores recordes ao longo da temporada:

imagem

Ela quebrou seu melhor recorde quatro vezes (depois dos jogos,,, e) e seu pior recorde zero vezes (nenhuma pontuação durante a temporada foi menor do que a que ela ganhou em seu primeiro jogo), então imprimimos 4 0como nossa resposta.
