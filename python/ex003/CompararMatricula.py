#Escreva um programa, em Python, que exiba o seu nome completo e a sua matrícula do IFPB. 
#O programa deverá ler, do usuário, um número inteiro e deverá informar se o número lido é maior ou menor que os 3 últimos dígitos da sua matrícula.

print("-------------[ Comparar matrícula ]-------------\n")

print("Nome: João Paulo de Sousa Araújo")
print("Matrícula: 202213710001")
n = int(input("Insira um número: "))

if n < 1:
    print(f"O número {n} é menor que 001!")
else:
    print(f"O número {n} é maior que 001!")