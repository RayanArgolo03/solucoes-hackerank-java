# Hurdle Race 

Tarefa

Um player de vídeo joga um jogo no qual o personagem compete em uma corrida de obstáculos. Os obstáculos têm alturas variadas e os personagens têm uma altura máxima que podem saltar. Existe uma poção mágica que eles podem tomar que aumentará a altura máxima do salto emunidade para cada dose. Quantas doses da poção o personagem deve tomar para conseguir superar todos os obstáculos. Se o personagem já conseguir superar todos os obstáculos, retorne.

Exemplo


O personagem pode pularunidade alta inicialmente e deve levardoses de poção para poder superar todos os obstáculos.

Descrição da função

Complete a função hurdleRace no editor abaixo.

hurdleRace tem os seguintes parâmetros:

int k : a altura que o personagem pode saltar naturalmente
int height[n] : as alturas de cada obstáculo
Devoluções

int: o número mínimo de doses necessárias, sempreou mais
Formato de entrada

A primeira linha contém dois inteiros separados por espaçoe, o número de obstáculos e a altura máxima que o personagem pode saltar naturalmente.
A segunda linha contéminteiros separados por espaçoonde.

Restrições

Exemplo de entrada 0

5 4 
1 6 3 5 2
Exemplo de saída 0

2
Explicação 0

O personagem de Dan pode pular no máximounidades, mas o obstáculo mais alto tem uma altura de:

imagem

Para poder superar todos os obstáculos, Dan deve beberdoses.

Exemplo de entrada 1

5 7 
2 5 4 5 2
Exemplo de saída 1

0
Explicação 1

O personagem de Dan pode pular no máximounidades, o que é suficiente para superar todos os obstáculos:
