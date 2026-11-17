# Avaliação continuação do ROBO.


Boa noite professor, nessa atividade fiz o que foi solicitado no enunciado, criei as novas classes, apliquei as heranças, e abaixo vou te demonstrar as formas que fiz isso, um exemplo de ataque e defesa conforme solicitado no enunciado, e comentar sobre o codigo completo.

os robos que eu usei foram 
22 kauezin - ofensivo - ataque 22 defesa 13
13 kuezin - defensivo - ataque 23 defesa 12
30 Carlão - equilibrado - ataque 15 defesa 20

abaixo vou mostrar a forma de cadastro dos robos dentro do terminal no vs code

cadastro de robos  (aqui eu cadastrei o primeiro robo, o robo ofensivo)
1 Cadastrar robo
2 Lista dos robos
3 realizar combate
0 Sair
digite a opção: 1
Digite o código do robo: 22
Digite o nome do robo: kauezin
Informe o poder de ataque: 22
informe o poder de defesa: 13
qual o tipo do robo? 1 ofensivo, 2 defensivo, 3 equilibrado
1
Robo cadastrado.

cadastro de robos  (aqui eu cadastrei o segundo robo, o robo defensivo)
1 Cadastrar robo
2 Lista dos robos
3 realizar combate
0 Sair
digite a opção: 1
Digite o código do robo: 13
Digite o nome do robo: kuezin
Informe o poder de ataque: 23
informe o poder de defesa: 12
qual o tipo do robo? 1 ofensivo, 2 defensivo, 3 equilibrado
2
Robo cadastrado.

cadastro de robos ( e aqui foi o cadastro do terceiro robo, o robo equilibrado)
1 Cadastrar robo
2 Lista dos robos
3 realizar combate
0 Sair
digite a opção: 1
Digite o código do robo: 30
Digite o nome do robo: Carlão
Informe o poder de ataque: 15
informe o poder de defesa: 20
qual o tipo do robo? 1 ofensivo, 2 defensivo, 3 equilibrado
3
Robo cadastrado.

abaixo vou explicar a parte de selecionar o tipo do robo, se é ofensivo, defensivo ou equilibrado.
o tipo é escolhido no proprio cadastro: 1 cria um RoboOfensivo, 2 um RoboDefensivo e 3 um RoboEquilibrado
mas todos vão pro mesmo Array

a ordem das lutas foi essa pq a energia não recupera:
primeiro kauezin x kuezin, depois kuezin x Carlão e por ultimo kauezin x Carlão
o kuezin saiu da primeira com 30 certinho, então ainda deu pra lutar

combate 1 - ofensivo contra defensivo (kauezin x kuezin)
a luta vai ser entre kauezin e kuezin
o robo kuezin vai começar atacando.
rodada 1
kuezin atacou kauezin
dano: 10
A energia do kauezin é: 90
kauezin atacou kuezin
dano: 12
A energia do kuezin é: 88
rodada 2
kuezin atacou kauezin
dano: 15
A energia do kauezin é: 75
kauezin atacou kuezin
dano: 17
A energia do kuezin é: 71
rodada 3
kuezin atacou kauezin
dano: 10
A energia do kauezin é: 65
kauezin atacou kuezin
dano: 12
A energia do kuezin é: 59
rodada 4
kuezin atacou kauezin
dano: 15
A energia do kauezin é: 50
kauezin atacou kuezin
dano: 17
A energia do kuezin é: 42
rodada 5
kuezin atacou kauezin
dano: 10
A energia do kauezin é: 40
kauezin atacou kuezin
dano: 12
A energia do kuezin é: 30
o vencedor é kauezin
o kauzein começou pq  os dois tinham 0 pontos, ai começa o de menor codigo (13)
pq deu 12 (kauezin atacou kuezin na rodada 1):
o kauezin é ofensivo então ganha +5 no ataque só no golpe: 22 + 5 = 27
tira a defesa do kuezin: 27 - 12 = 15
15 já é maior que 5 então fica 15
rodada 1 é impar então não tem bonus
o kuezin é defensivo então tira 3: 15 - 3 = 12
na rodada 2 é a mesma conta mas ganha +5 por ser par: 15 + 5 = 20, 20 - 3 = 17

combate 2 - defensivo contra equilibrado (kuezin x Carlão)
a luta vai ser entre kuezin e Carlão
o robo kuezin vai começar atacando.
rodada 1
kuezin atacou Carlão
dano: 5
A energia do Carlão é: 95
Carlão atacou kuezin
dano: 2
A energia do kuezin é: 28
rodada 2
kuezin atacou Carlão
dano: 10
A energia do Carlão é: 85
Carlão atacou kuezin
dano: 7
A energia do kuezin é: 21
rodada 3
kuezin atacou Carlão
dano: 5
A energia do Carlão é: 80
Carlão atacou kuezin
dano: 2
A energia do kuezin é: 19
rodada 4
kuezin atacou Carlão
dano: 10
A energia do Carlão é: 70
Carlão atacou kuezin
dano: 7
A energia do kuezin é: 12
rodada 5
kuezin atacou Carlão
dano: 5
A energia do Carlão é: 65
Carlão atacou kuezin
dano: 2
A energia do kuezin é: 10
o vencedor é Carlão
pq deu 2 (Carlão atacou kuezin na rodada 1):
o Carlão é equilibrado então o ataque fica 15 normal
tira a defesa do kuezin: 15 - 12 = 3
3 é menor que 5 então vira 5 (dano minimo)
rodada 1 é impar então não tem bonus
o kuezin é defensivo então tira 3: 5 - 3 = 2

combate 3 - ofensivo contra equilibrado kauezin contra Carlão
a luta vai ser entre kauezin e Carlão
o robo kauezin vai começar atacando.
rodada 1
kauezin atacou Carlão
dano: 7
A energia do Carlão é: 58
Carlão atacou kauezin
dano: 5
A energia do kauezin é: 35
rodada 2
kauezin atacou Carlão
dano: 12
A energia do Carlão é: 46
Carlão atacou kauezin
dano: 10
A energia do kauezin é: 25
rodada 3
kauezin atacou Carlão
dano: 7
A energia do Carlão é: 39
Carlão atacou kauezin
dano: 5
A energia do kauezin é: 20
rodada 4
kauezin atacou Carlão
dano: 12
A energia do Carlão é: 27
Carlão atacou kauezin
dano: 10
A energia do kauezin é: 10
rodada 5
kauezin atacou Carlão
dano: 7
A energia do Carlão é: 20
Carlão atacou kauezin
dano: 5
A energia do kauezin é: 5
o vencedor é Carlão
o kauezi começou porque os dois tinham 3 pontos, ai vai o de menor codigo (22)
pq deu 12 (kauezin atacou Carlão na rodada 2):
ofensivo ganha +5: 22 + 5 = 27
tira a defesa do Carlão: 27 - 20 = 7
7 é maior que 5 então fica 7
rodaa 2 é par então ganha +5: 7 + 5 = 12
o Carlão é equilibrado então não tira nada, fica 12

agora vou explicar  onde eu usei herança

o Robo virou abstract, não da pra dar new Robo, só nos filhos
o RoboOfensivo, RoboDefensivo e RoboEquilibrado fazem extends Robo
e usam o super pra mandar codigo, nome, ataque, defesa e o tipo pro Robo
não repeti nenhum atributo nos filhos, tudo fica no Robo
onde eu usei polimorfismo:
no Robo tem o ataqueDoGolpe() e o reduzirDanoRecebido()
o ofensivo sobrescreve o ataqueDoGolpe() com @Override e soma 5
o defensivo sobrescreve o reduzirDanoRecebido() com @Override e tira 3 (minimo 2)
o equilibrado não sobrescreve nada, usa o do Robo mesmo
o calcularDano() só chama esses metodos e o java escolhe o certo de cada robo
todos os robos ficam no mesmo Array
não usei instanceof nem if de tipo pra calcular o dano

onde eu usei encapsulamento:
todos os atributos do Robo tão private
pra pegar os valores usa os get (getNome, getAtaque, getPontos...)
não tem set, a energia só muda pelo receberDano() e nunca fica negativa
pontos, vitorias e derrotas só mudam pelo registrarVitoria(), registrarDerrota() e registrarEmpate()
a validação do ataque e defesa (atributosValidos) e a dos 30 de energia (podeLutar) ficam no Robo
 #
