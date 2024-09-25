#Utilizando estruturas de repetição, escreva um programa em Python que exiba, em ordem descrescente, todos os números ímpares existentes entre 100 e 200.

print("-------------[ Números ímpares em ordem decrescente ]-------------")
print()

num = 200

while num > 0:
    num -= 1
    if num % 2 != 0:
        print(num)
    if num == 0:
        break