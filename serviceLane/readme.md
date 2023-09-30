# Service Lane

Tarefa

Um motorista está dirigindo na rodovia. A luz de verificação do motor de seu veículo está acesa e o motorista deseja obter atendimento imediatamente. Felizmente, uma faixa de serviço corre paralela à rodovia. Varia em largura ao longo de seu comprimento.

Rodovia do Paraíso

Você receberá uma matriz de larguras em pontos ao longo da estrada ( índices ) e, em seguida, uma lista dos índices dos pontos de entrada e saída. Considerando cada par de pontos de entrada e saída, calcule o tamanho máximo do veículo que pode percorrer aquele trecho da faixa de serviço com segurança.

Exemplo



Se o índice de entrada,e a saída,, existem duas larguras de segmento deerespectivamente. O veículo mais largo que pode passar por ambos é. See, as larguras sãoque limita a largura do veículo a.

Descrição da função

Conclua a função serviceLane no editor abaixo.

serviceLane tem os seguintes parâmetros:

int n: o tamanho dovariedade
int cases[t][2]: cada elemento contém os índices inicial e final de um segmento a ser considerado, inclusive
Devoluções

int[t]: a largura máxima do veículo que pode passar por cada segmento da faixa de serviço descrita
Formato de entrada

A primeira linha de entrada contém dois inteiros,e, ondedenota o número de medidas de largura e, o número de casos de teste. A próxima linha teminteiros separados por espaço que representam a matriz.

Nas próximaslinhas contêm dois inteiros,e, ondeé o índice inicial eé o índice final do segmento a ser verificado.
