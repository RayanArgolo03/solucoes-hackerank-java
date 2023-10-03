# Space Stations

Tarefa

Flatland é um país com várias cidades, algumas das quais possuem estações espaciais. As cidades são numeradas consecutivamente e cada uma tem uma estrada decomprimento conectando-o à próxima cidade. Não é uma rota circular, portanto a primeira cidade não se conecta com a última cidade. Determine a distância máxima de qualquer cidade até a estação espacial mais próxima.

Exemplo


Hácidades e cidadetem uma estação espacial. Eles ocorrem consecutivamente ao longo de uma rota. Cidadeéunidade de distância e cidadeéunidades de distância. Cidadeéunidades de sua estação espacial mais próxima, pois uma está localizada lá. A distância máxima é.

Descrição da função

Complete a função flatlandSpaceStations no editor abaixo.

flatlandSpaceStations tem os seguintes parâmetros:

int n: o número de cidades
int c[m]: os índices de cidades com estação espacial
Retorna
- int: a distância máxima que qualquer cidade está de uma estação espacial

Formato de entrada

A primeira linha consiste em dois inteiros separados por espaço,e.
A segunda linha contéminteiros separados por espaço, os índices de cada cidade que possui uma estação espacial. Esses valores são desordenados e distintos.

Restrições

Haverá pelo menoscidade com uma estação espacial.
Nenhuma cidade tem mais de uma estação espacial.
Formato de saída

Exemplo de entrada 0

Função STDIN 
----- -------- 
5 2 n = 5, c[] tamanho m = 2 
0 4 c = [0, 4]
Exemplo de saída 0

2
Explicação 0

Este exemplo corresponde ao gráfico a seguir:

fácil(5).png

A distância até a estação espacial mais próxima para cada cidade está listada abaixo:

tem distância, pois contém uma estação espacial.
tem distânciapara a estação espacial em.
tem distânciapara as estações espaciais eme.
tem distânciapara a estação espacial em.
tem distância, pois contém uma estação espacial.
Tomamos então.

Exemplo de entrada 1

6 6
0 1 2 4 3 5
Exemplo de saída 1

0
Explicação 1

Nesta amostra,então toda cidade tem estação espacial e nós imprimimoscomo nossa resposta.
