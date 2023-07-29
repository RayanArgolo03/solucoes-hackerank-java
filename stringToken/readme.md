# String Token
Tarefa

Dada uma string, , correspondente à expressão regular [A-Za-z !,?._'@]+, divida a string em tokens. Definimos um token como sendo uma ou mais letras consecutivas do alfabeto inglês. Em seguida, imprima o número de tokens, seguido de cada token em uma nova linha.

Observação: você pode achar o método String.split útil para concluir este desafio.

Formato de entrada

Uma única corda, .

Restrições

  é composto por qualquer um dos seguintes: letras do alfabeto inglês, espaços em branco, pontos de exclamação (!), vírgulas (,), pontos de interrogação (?), pontos (.), sublinhados (_), apóstrofos (') e símbolos de arroba (@).
Formato de saída

Na primeira linha, imprima um inteiro, , denotando o número de tokens na string (eles não precisam ser únicos). Em seguida, imprima cada um dos tokens em uma nova linha na mesma ordem em que aparecem na string de entrada.

Entrada de amostra

Ele é um menino muito, muito bom, não é?
Saída de amostra

10
Ele
é
a
muito
muito
bom
garoto
não
t
ele
Explicação

Consideramos um token como sendo um segmento contíguo de caracteres alfabéticos. Há um total desses tokens em string , e cada token é impresso na mesma ordem em que aparece em string .
