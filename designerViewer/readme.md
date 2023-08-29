# Designer Viewer

Tarefa

Quando um bloco de texto contíguo é selecionado em um visualizador de PDF, a seleção é destacada com um retângulo azul. Neste visualizador de PDF, cada palavra é destacada de forma independente. Por exemplo:

PDF-alta.png

Existe uma lista dealturas dos caracteres alinhadas por índice às suas letras. Por exemplo, 'a' está no índicee 'z' está no índice. Haverá também uma string. Usando as alturas das letras fornecidas, determine a área do retângulo destacado emsupondo que todas as letras sejamlargo.

Exemplo
 

As alturas sãoe. A letra mais alta éalto e hácartas. A área destacada seráentão a resposta é.

Descrição da função

Complete a função designerPdfViewer no editor abaixo.

designerPdfViewer possui os seguintes parâmetros:

int h[26] : as alturas de cada letra
palavra de string : uma string
Devoluções

int: o tamanho da área destacada
Formato de entrada

A primeira linha contéminteiros separados por espaço que descrevem as respectivas alturas de cada letra minúscula consecutiva do inglês, ascii[az].
A segunda linha contém uma única palavra composta por letras minúsculas do alfabeto inglês.

Restrições

, ondeé uma letra minúscula em inglês.
não contém mais do quecartas.
Exemplo de entrada 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 
abc
Exemplo de saída 0

9
Explicação 0

Estamos destacando a palavra abc:

As alturas das letras são,e. A letra mais alta, b, éalto. A área de seleção para esta palavra é.

Nota: Lembre-se de que a largura de cada caractere é.
