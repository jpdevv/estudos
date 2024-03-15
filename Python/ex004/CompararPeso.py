#Escreva um programa em Python que receba a capacidade suportada por um elevador e o peso de 4 pessoas. 
#O programa deverá informar se o elevador vai ou não suportar o peso das quatro pessoas;

print("=================[ Comparar peso ]=================\n")

CapacidadeMax = int(input("Insira a capacidade máxima do elevador: "))
Peso1 = int(input("Insira o peso da primeira pessoa: "))
Peso2 = int(input("Insira o peso da segunda pessoa: "))
Peso3 = int(input("Insira o peso da terceira pessoa: "))
Peso4 = int(input("Insira o peso da quarta pessoa: "))
SomaPesos = Peso1 + Peso2 + Peso3 + Peso4
Resultado = 0

if(SomaPesos > CapacidadeMax):
    Resultado = "não suportará"
if(SomaPesos <= CapacidadeMax):
    Resultado = "suportará"

print("\n=================[ Resultado ]=================\n")

print(f"Pesos somados: {SomaPesos}Kg")
print(f"Capacidade máxima do elevador: {CapacidadeMax}Kg")
print(f"O elevador {Resultado}!")
print(f"Peso restante: {CapacidadeMax - SomaPesos}Kg")