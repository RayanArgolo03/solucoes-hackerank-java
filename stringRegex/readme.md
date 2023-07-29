# String Regex Validator

Tarefa

Usando o Regex, podemos facilmente combinar ou pesquisar padrões em um texto. Antes de procurar por um padrão, temos que especificar um usando alguma sintaxe bem definida.

Neste problema, você recebe um padrão. Você deve verificar se a sintaxe do padrão fornecido é válida.

Nota: Neste problema, um regex só é válido se você puder compilá-lo usando o método Pattern.compile.

Formato de entrada

A primeira linha de entrada contém um inteiro , denotando o número de casos de teste. As próximas linhas contêm uma sequência de quaisquer caracteres imprimíveis que representam o padrão de um regex.

Formato de saída

Para cada caso de teste, imprima Valid se a sintaxe do padrão fornecido estiver correta. Caso contrário, imprima Inválido. Não imprima as citações.

Entrada de amostra

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Saída de amostra

Válido
Inválido
Inválido
