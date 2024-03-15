#Escreva um programa em Python que receba o placar de um jogo e informe se houve empate, vitória do time da casa ou vitória do time visitante.

print("=================[ Comparar placar de jogo ]=================\n")
Placar1 = int(input("Insira os pontos do Time da Casa: "))
Placar2 = int(input("Insira os pontos do Time Visitante: "))
nMaior = 0
tVencedor = 0

print("\n=================[ Resultado ]=================\n")

if(Placar1 == Placar2):
    print("Houve um empate no jogo!")
else:
    if(Placar1 > nMaior):
        nMaior = Placar1
        tVencedor = "Time da Casa"
    if(Placar2 > nMaior):
        nMaior = Placar2
        tVencedor = "Time Visitante"

print(f"O time vencedor é o {tVencedor} com {nMaior} pontos!")