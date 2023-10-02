# Lisa Workbook

Tarefa 

Lisa acabou de receber uma nova apostila de matemática. Uma apostila contém problemas de exercícios, agrupados em capítulos. Lisa acredita que um problema é especial se seu índice (dentro de um capítulo) for igual ao número da página onde está localizado. O formato do livro de Lisa é o seguinte:

Hácapítulos da apostila de Lisa, numerados depara.
Ocapítulo temproblemas, numerados depara.
Cada página pode conter até problemas. Somente a última página de exercícios de um capítulo pode conter menos deproblemas.
Cada novo capítulo começa em uma nova página, portanto uma página nunca conterá problemas de mais de um capítulo.
A indexação do número da página começa em.
Dados os detalhes da apostila de Lisa, você consegue contar o número de problemas especiais ?

Exemplo


A apostila de Lisa contémproblemas para o capítulo, eproblemas para o capítulo. Cada página pode conterproblemas.

A primeira página conteráproblemas para o capítulo. Problemaestá na página, então é especial . Páginacontém apenas capítulo, Problema, então nenhum problema especial está na página. Capítuloproblemas começam na páginae háproblemas. Como não há problemana página, também não há nenhum problema especial nessa página. Há problema especial em sua pasta de trabalho.

Nota: Consulte o diagrama na seção Explicação para obter mais detalhes.

Descrição da função

Conclua a função da pasta de trabalho no editor abaixo.

pasta de trabalho tem os seguintes parâmetros:

int n: o número de capítulos
int k: o número máximo de problemas por página
int arr[n]: o número de problemas em cada capítulo
Retorna
- int: o número de problemas especiais na pasta de trabalho

Formato de entrada

A primeira linha contém dois inteirose, o número de capítulos e o número máximo de problemas por página.
A segunda linha contéminteiros separados por espaçoondedenota o número de problemas nocapítulo.

Restrições

Exemplo de entrada

Função STDIN 
----- -------- 
5 3 n = 5, k = 3 
4 2 6 1 10 arr = [4, 2, 6, 1, 10]
Saída de amostra

4
Explicação

O diagrama abaixo mostra a apostila de Lisa comcapítulos e no máximoproblemas por página. Os problemas especiais estão destacados em vermelho e os números das páginas estão em quadrados amarelos.

bear_workbook.png

Háproblemas especiais e assim imprimimos o númeroem uma nova linha.
