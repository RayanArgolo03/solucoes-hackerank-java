# String Tags

Tarefa

Em uma linguagem baseada em tags como XML ou HTML, o conteúdo é colocado entre uma tag inicial e uma tag final como <tag>conteúdo</tag>. Observe que a tag final correspondente começa com /.

Dada uma sequência de texto em uma linguagem baseada em tags, analise esse texto e recupere o conteúdo contido em sequências de tags bem organizadas que atendem ao seguinte critério:

O nome das tags de início e fim deve ser o mesmo. O código HTML <h1>Hello World</h2> não é válido porque o texto começa com uma tag h1 e termina com uma tag h2 não correspondente.

As tags podem ser aninhadas, mas o conteúdo entre as tags aninhadas é considerado inválido. Por exemplo, em <h1><a>conteúdo</a>inválido</h1>, o conteúdo é válido, mas inválido não é válido.

As tags podem consistir em qualquer caractere imprimível.

Formato de entrada

A primeira linha de entrada contém um único inteiro (o número de linhas).
Cada uma das linhas subseqüentes contém uma linha de texto.

Restrições

Cada linha contém um máximo de caracteres imprimíveis.
O número total de caracteres em todos os casos de teste não excederá .
Formato de saída

Para cada linha, imprima o conteúdo incluído em tags válidas.
Se uma linha contiver várias instâncias de conteúdo válido, imprima cada instância de conteúdo válido em uma nova linha; se nenhum conteúdo válido for encontrado, imprima Nenhum.

Entrada de amostra

4
<h1>Nayeem adora aconselhamento</h1>
<h1><h1>Sanjay não tem relógio</h1></h1><par>Então espere um pouco</par>
<Amee>códigos safat como um ninja</amee>
<SA premium>Imtiaz tem uma paixão secreta</SA premium>
Saída de amostra

Nayeem adora aconselhamento
Sanjay não tem relógio
Então espere um pouco
Nenhum
Imtiaz tem uma paixão secreta
