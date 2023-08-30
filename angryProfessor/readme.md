# Professor Irritado

Tarefa

Um professor de Matemática Discreta tem uma turma de alunos. Frustrado com a falta de disciplina, o professor decide cancelar a aula se menos de um certo número de alunos estiverem presentes no início da aula. Os horários de chegada vão desde o horário () chegar atrasado ().

Dado o horário de chegada de cada aluno e um número limite de participantes, determine se a aula foi cancelada.

Exemplo




O primeiroos alunos chegaram. O últimoestamos atrasados. O limite éalunos, então a aula continuará. Retornar YES.

Nota: Tempos de chegada não positivos () indicar que o aluno chegou cedo ou na hora certa; tempos de chegada positivos () indica que o aluno chegouminutos atrasado.

Descrição da função

Complete a função irritadoProfessor no editor abaixo. Deve retornar YESse a aula for cancelada ou NOnão.

irritadoProfessor tem os seguintes parâmetros:

int k : o número limite de alunos
int a[n] : os horários de chegada doestudantes
Devoluções

string: ou YESouNO
Formato de entrada

A primeira linha de entrada contém, o número de casos de teste.

Cada caso de teste consiste em duas linhas.

A primeira linha tem dois inteiros separados por espaço,e, o número de alunos (tamanho de) e o limite de cancelamento.
A segunda linha contéminteiros separados por espaço () que descrevem os horários de chegada de cada aluno.

Restrições

Exemplo de entrada

2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Saída de amostra

YES
NO
Explicação

Para o primeiro caso de teste,. O professor quer pelo menosalunos presentes, mas apenaschegaram na hora certa (e) então a aula é cancelada.

Para o segundo caso de teste,. O professor quer pelo menosalunos presentes, e háque chegou na hora certa (e). A aula não foi cancelada.
