# Pilha Java

Tarefa 

Uma string contendo apenas parênteses é balanceada se o seguinte for verdadeiro: 1. se for uma string vazia 2. se A e B estiverem corretos, AB está correto, 3. se A estiver correto, (A) e {A} e [ A] também estão corretas.

Exemplos de algumas strings balanceadas corretamente são: "{}()", "[{()}]", "({()})"

Exemplos de algumas strings não balanceadas são: "{}(", "({)}", "[[", "}{" etc.

Dada uma string, determine se ela é balanceada ou não.

Formato de entrada

Haverá várias linhas no arquivo de entrada, cada uma com uma única string não vazia. Você deve ler a entrada até o final do arquivo.

A parte do código que lida com a operação de entrada já é fornecida no editor.

Formato de saída

Para cada caso, imprima 'true' se a string for balanceada, 'false' caso contrário.

Entrada de amostra

{}()
({()})
{}(
[]
Saída de amostra

verdadeiro
verdadeiro
falso
verdadeiro
