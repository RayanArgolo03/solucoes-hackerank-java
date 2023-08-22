# Dia do Programador

Tarefa  

Marie inventou uma Máquina do Tempo e quer testá-la viajando no tempo para visitar a Rússia no Dia do Programador (o 256º dia do ano) durante um ano entre 1700 e 2700.

De 1700 a 1917, o calendário oficial da Rússia foi o calendário juliano ; desde 1919 eles usaram o sistema de calendário gregoriano . A transição do calendário juliano para o gregoriano ocorreu em 1918, quando o dia seguinte a 31 de janeiro era 14 de fevereiro. Isso significa que em 1918, 14 de fevereiro era o 32º dia do ano na Rússia.

Em ambos os sistemas de calendário, fevereiro é o único mês com quantidade variável de dias; tem 29 dias durante um ano bissexto e 28 dias durante todos os outros anos. No calendário juliano, os anos bissextos são divisíveis por 4; no calendário gregoriano, os anos bissextos são um dos seguintes:

Divisível por 400.
Divisível por 4 e não divisível por 100.
Dado um ano,, encontre a data do dia 256 daquele ano de acordo com o calendário oficial russo durante aquele ano . Em seguida, imprima-o no formato dd.mm.yyyy, onde ddé o dia de dois dígitos, mmé o mês de dois dígitos e yyyyé.

Por exemplo, o dado= 1984. 1984 é divisível por 4, portanto é um ano bissexto. O 256º dia de um ano bissexto depois de 1918 é 12 de setembro, então a resposta é.

Descrição da função

Conclua a função dayOfProgrammer no editor abaixo. Ele deve retornar uma string representando a data do 256º dia do ano fornecido.

dayOfProgrammer tem o(s) seguinte(s) parâmetro(s):

ano : um inteiro
Formato de entrada

Um único número inteiro denotando ano.

Restrições

1700 \le e \le 2700
Formato de saída

Imprimir a data completa do Dia do Programador durante o anono formato dd.mm.yyyy, onde ddé o dia de dois dígitos, mmé o mês de dois dígitos e yyyyé.

Exemplo de Entrada 0

2017
Saída de amostra 0

13.09.2017
Explicação 0

No ano= 2017, janeiro tem 31 dias, fevereiro tem 28 dias, março tem 31 dias, abril tem 30 dias, maio tem 31 dias, junho tem 30 dias, julho tem 31 dias e agosto tem 31 dias. Quando somamos o número total de dias nos primeiros oito meses, obtemos 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243. O dia do programador é o 256º dia, então calcule 256 - 243 = 13 para determinar que cai no dia 13 do 9º mês (setembro). Em seguida, imprimimos a data completa no formato especificado, que é 13.09.2017.

Exemplo de entrada 1

2016
Saída de amostra 1

12.09.2016
Explicação 1

Ano= 2016 é um ano bissexto, então fevereiro tem 29 dias, mas todos os outros meses têm o mesmo número de dias de 2017. Quando somamos o número total de dias nos primeiros oito meses, obtemos 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 = 244. O dia do programador é o 256º dia, então calcule 256 - 244 = 12 para determinar que cai no dia 12 do 9º mês (setembro). Em seguida, imprimimos a data completa no formato especificado, que é 12.09.2016.

Exemplo de entrada 2

1800
Saída de amostra 2

12.09.1800
Explicação 2

Desde 1800 é ano bissexto de acordo com o calendário juliano. O dia é 12 de setembro.
