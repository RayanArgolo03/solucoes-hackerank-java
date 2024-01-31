# Inverse RMQ

Tarefa

A consulta mínima de intervalo é um problema bem conhecido: dado um array de inteiros distintos com tamanhoeconsultas, encontre o elemento mínimo no subsegmento.

Uma das soluções mais eficientes e famosas para este problema é uma árvore de segmentos . Uma árvore de segmentos é uma árvore binária completa comnós onde as folhas contêm os valores da matriz original e cada nó não-folha contém o valor mínimo de toda a sua subárvore.

Normalmente, uma árvore de segmentos é representada como um array de inteiros comelementos. O filho esquerdo donó está nocela, e a criança certa está nacélula. Por exemplo,representa a seguinte árvore de segmentos onde o primeiro número em um nó descreve o índice da matriz,, eme o segundo número denota o valor armazenado no índice(que corresponde ao valor mínimo na subárvore daquele nó):
