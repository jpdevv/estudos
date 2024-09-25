#Escreva um programa em Python que receba a idade de uma pessoa e exiba a sua classificação, de acordo com a tabela abaixo

print("=================[ Verificar classificação ]=================\n")

Idade = int(input("Insira sua idade: "))
Resultado = 0

if(Idade < 18):
    Resultado = "Menor de idade"
if(Idade >= 18):
    Resultado = "Adulto(a)"
if(Idade >= 59):
    Resultado = "Idoso(a)"

print("\n=================[ Resultado ]=================\n")

print(f"Sua classificação é: {Resultado}")