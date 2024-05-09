#Utilizando estruturas de repetição, escreva um programa em Python que leia 100 números pares e exiba a soma e a média entres os números lidos;

print("-------------[ Soma e média dos números pares de 0 à 100 ]-------------\n")

soma = 0
media = 0

for n in range(101):
    if n % 2 == 0:
        soma += n
media = soma / 2

print("Soma dos números: {}".format(soma))
print("Média dos números: {}".format(media))