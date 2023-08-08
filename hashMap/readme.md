# Java Hash Map

Tarefa

Você recebe uma lista telefônica que consiste nos nomes das pessoas e seus números de telefone. Depois disso, você receberá o nome de uma pessoa como consulta. Para cada consulta, imprima o número de telefone dessa pessoa.

Formato de entrada

A primeira linha terá um número inteiro indicando o número de entradas na lista telefônica. Cada entrada consiste em duas linhas: um nome e o número de telefone correspondente.

Depois disso, haverá algumas perguntas. Cada consulta conterá o nome de uma pessoa. Leia as consultas até o final do arquivo.

Restrições:
O nome de uma pessoa consiste apenas em letras minúsculas do inglês e pode estar no formato 'primeiro nome, sobrenome' ou no formato 'primeiro nome'. Cada número de telefone tem exatamente 8 dígitos sem nenhum zero à esquerda.




Formato de saída

Para cada caso, imprima "Não encontrado" se a pessoa não tiver nenhuma entrada na lista telefônica. Caso contrário, imprima o nome e o número de telefone da pessoa. Veja a saída de exemplo para o formato exato.

Para facilitar o problema, disponibilizamos uma parte do código no editor. Você pode completar esse código ou escrever completamente por conta própria.

Entrada de amostra

3
tio Sam
99912222
Tom
11122222
atormentar
12299933
tio Sam
Tio Tom
atormentar
Saída de amostra

tio sam=99912222
Não encontrado
Harry = 12299933
