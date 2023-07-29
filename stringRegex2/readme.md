# String Regex 2

Tarefa


Neste desafio, usamos expressões regulares (RegEx) para remover instâncias de palavras que são repetidas mais de uma vez, mas retemos a primeira ocorrência de qualquer palavra repetida sem distinção entre maiúsculas e minúsculas. Por exemplo, as palavras love e to são repetidas na frase I love Love to To to to code. Você pode completar o código no editor para que ele transforme o código I love to To tO em I love to code?

Para resolver este desafio, complete as três linhas a seguir:

Escreva um RegEx que corresponda a qualquer palavra repetida.
Conclua o segundo argumento de compilação para que o RegEx compilado não diferencie maiúsculas de minúsculas.
Escreva os dois argumentos necessários para replaceAll de modo que cada palavra repetida seja substituída pela primeira instância da palavra encontrada na frase. Deve ser a primeira ocorrência exata da palavra, pois a saída esperada diferencia maiúsculas de minúsculas.
Observação: este desafio usa um verificador personalizado; você falhará no desafio se modificar qualquer coisa além dos três locais que os comentários o direcionam para concluir. Para restaurar o código stub original do editor, crie um novo buffer clicando no ícone de ramificação no canto superior esquerdo do editor.

Formato de entrada

A entrada a seguir é tratada para você com o código stub fornecido:

A primeira linha contém um inteiro, , denotando o número de sentenças.
Cada uma das linhas subseqüentes contém uma única frase que consiste em letras do alfabeto inglês e caracteres de espaço em branco.

Restrições

Cada frase consiste no máximo em letras do alfabeto inglês e espaços em branco.
Formato de saída

O código stub no editor imprime a frase modificada pela linha replaceAll para stdout. A string modificada deve ser uma versão modificada da frase inicial onde todas as ocorrências repetidas de cada palavra são removidas.

Entrada de amostra

5
Adeus adeus mundo mundo mundo
Sam foi foi para o seu negócio
Reya é a melhor jogadora no jogo eye eye
no no
Alô Alô Ab aB
Saída de amostra

adeus mundo
Sam foi para o seu negócio
Reya é a melhor jogadora no jogo dos olhos
no no
Olá Ab

Este repositório contém minhas soluções para diversos desafios de programação da plataforma HackerRank. Essas soluções foram desenvolvidas em java e são categorizadas de acordo com os diferentes domínios de problemas do HackerRank.

Cada desafio possui seu próprio diretório, que inclui o código da solução, uma breve descrição do problema e informações sobre a linguagem de programação usada.
