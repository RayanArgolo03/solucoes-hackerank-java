# String Encryption

Tarefa 

Um texto em inglês precisa ser criptografado usando o seguinte esquema de criptografia.
Primeiro, os espaços são removidos do texto. Deixarseja o comprimento deste texto.
Em seguida, os caracteres são escritos em uma grade, cujas linhas e colunas possuem as seguintes restrições:

Exemplo


Depois de remover os espaços, a string écaracteres longos. está entree, portanto está escrito na forma de uma grade com 7 linhas e 8 colunas.

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
Garanta que
Se múltiplas grades satisfizerem as condições acima, escolha aquela com a área mínima, ou seja,.
A mensagem codificada é obtida exibindo os caracteres de cada coluna, com espaço entre os textos das colunas. A mensagem codificada para a grade acima é:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

Crie uma função para codificar uma mensagem.

Descrição da função

Conclua a função de criptografia no editor abaixo.

a criptografia tem os seguintes parâmetros:

string s: uma string para criptografar
Devoluções

string: a string criptografada
Formato de entrada

Uma linha de texto, a string

Restrições


contém caracteres no intervalo ascii[az] e espaço, ascii(32).

Exemplo de entrada

haveaniceday
Exemplo de saída 0

hae and via ecy
Explicação 0

,está entree.
Reescrito comlinhas ecolunas:

have
anic
eday
Exemplo de entrada 1

feedthedog    
Exemplo de saída 1

fto ehg ee dd
Explicação 1

,está entree.
Reescrito comlinhas ecolunas:

feed
thed
og
Exemplo de entrada 2

chillout
Exemplo de saída 2

clu hlt io
Explicação 2

,está entree.
Reescrito comcolunas elinhas (então temos que usar.)

chi
llo
ut
