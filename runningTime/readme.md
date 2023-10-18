# Running Time in Insertion Sort Algorithm

Tarefa

Em um desafio anterior você implementou o algoritmo Insertion Sort . É um algoritmo de classificação simples que funciona bem com dados pequenos ou quase todos classificados. No entanto, leva muito tempo para classificar grandes dados não classificados. Para ver por quê, analisaremos seu tempo de execução.

Tempo de execução de algoritmos
O tempo de execução de um algoritmo para uma entrada específica depende do número de operações executadas. Quanto maior o número de operações, maior será o tempo de execução de um algoritmo. Geralmente queremos saber quantas operações um algoritmo executará em proporção ao tamanho de sua entrada, o que chamaremos.

Qual é a proporção entre o tempo de execução da classificação por inserção e o tamanho da entrada? Para responder a esta pergunta, precisamos examinar o algoritmo.

Análise da classificação de inserção
para cada elementoem uma matriz denúmeros, a classificação por inserção compara o número com aqueles à sua esquerda até atingir um elemento de valor inferior ou o início. Nesse ponto, ele muda tudo para a direita e inserena matriz.

Quanto tempo leva toda essa mudança?

Na melhor das hipóteses, onde o array já foi classificado, nenhum elemento precisará ser movido, então o algoritmo apenas percorrerá o array uma vez e retornará o array classificado. O tempo de execução seria diretamente proporcional ao tamanho da entrada, então podemos dizer que levarátempo.

No entanto, geralmente nos concentramos no pior tempo de execução (os cientistas da computação são bastante pessimistas). O pior caso para classificação por inserção ocorre quando a matriz está na ordem inversa. Para inserir cada número, o algoritmo terá que deslocar esse número para o início do array. Classificando todo o array deos números levarão, portanto,operações, o que é(quase). Os cientistas da computação simplesmente resumem isso (escolha o termo dominante) parae diga que a classificação por inserção é um "algoritmo de tempo".

imagem em tempo de execução

O que isso significa
O tempo de execução do algoritmo em relação a uma matriz deelementos é. Paraelementos, será. A classificação por inserção pode funcionar bem para entradas pequenas ou se você sabe que os dados provavelmente serão quase classificados, como números de cheques recebidos por um banco. O tempo de execução torna-se irracional para entradas maiores.

Desafio
Você pode modificar sua implementação anterior de classificação por inserção para controlar o número de mudanças que ela faz durante a classificação? A única coisa que você deve imprimir é o número de mudanças feitas pelo algoritmo para classificar completamente o array. Uma mudança ocorre quando a posição de um elemento muda na matriz. Não mude um elemento se não for necessário.
