# String Regex 3

Tarefa

Você está atualizando a política de nome de usuário na plataforma de rede interna da sua empresa. De acordo com a política, um nome de usuário é considerado válido se todas as seguintes restrições forem atendidas:

O nome de usuário consiste em até caracteres, inclusive. Se o nome de usuário consistir em caracteres menores ou maiores, então é um nome de usuário inválido.
O nome de usuário pode conter apenas caracteres alfanuméricos e sublinhados (_). Os caracteres alfanuméricos descrevem o conjunto de caracteres que consiste em caracteres minúsculos, maiúsculos e dígitos.
O primeiro caractere do nome de usuário deve ser um caractere alfabético, ou seja, caractere minúsculo ou maiúsculo .
Por exemplo:

Validade do nome de usuário
INVÁLIDO; Comprimento do nome de usuário < 8 caracteres
VÁLIDO
VÁLIDO
INVÁLIDO; O nome de usuário começa com um caractere não alfabético
INVÁLIDO; '?' personagem não permitido
Atualize o valor do campo regularExpression na classe UsernameValidator para que a expressão regular corresponda apenas a nomes de usuário válidos.

Formato de entrada

A primeira linha de entrada contém um inteiro , descrevendo o número total de nomes de usuário. Cada uma das próximas linhas contém uma string que descreve o nome de usuário. O código stub bloqueado lê as entradas e valida o nome de usuário.

Restrições

O nome de usuário consiste em quaisquer caracteres imprimíveis.
Formato de saída

Para cada um dos nomes de usuário, o código stub bloqueado imprime Válido se o nome de usuário for válido; caso contrário, inválido cada um em uma nova linha.

Exemplo de Entrada 0

8
Júlia
samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Júlia@007
_Julia007
Saída de amostra 0

Inválido
Válido
Válido
Inválido
Inválido
Válido
Inválido
Inválido
ele
Explicação

Consideramos um token como sendo um segmento contíguo de caracteres alfabéticos. Há um total desses tokens em string , e cada token é impresso na mesma ordem em que aparece em string .
