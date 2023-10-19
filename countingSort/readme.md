# Counting Sort

Tarefa
O Quicksort de classificação por comparação
geralmente tem um tempo de execução de, mas existe um algoritmo que pode classificar ainda mais rápido? Em geral, isso não é possível. A maioria dos algoritmos de ordenação são ordenações por comparação , ou seja, eles ordenam uma lista apenas comparando os elementos entre si. Um algoritmo de classificação por comparação não pode superar(pior caso) tempo de execução, uma vez querepresenta o número mínimo de comparações necessárias para saber onde colocar cada elemento. Para mais detalhes, você pode ver estas notas (PDF).

Classificação alternativa
Outro método de classificação, a classificação por contagem , não requer comparação. Em vez disso, você cria uma matriz de números inteiros cujo intervalo de índice cobre todo o intervalo de valores em sua matriz para classificação. Cada vez que um valor ocorre na matriz original, você incrementa o contador nesse índice. No final, percorra sua matriz de contagem, imprimindo o valor de cada índice com valor diferente de zero esse número de vezes.
