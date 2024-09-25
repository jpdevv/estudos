#Utilizando estruturas de repetição, escreva um programa em Python que peça para o usuário digitar um caractere e um número inteiro X. 
#O programa deverá exibir o caractere digitado X vezes na tela.

print("-------------[ Repetição de caracteres ]-------------\n")

parar = 0
caractere = str(input("Insira um caractere: "))
numero = int(input("Insira um valor inteiro: "))
print()

while True:
    if numero == 0:
        print("Você inseriu o caractere '{}' porém não foi possível exibir o caractere, pois o valor inserido foi 0.".format(caractere))
        break

    print("  {}".format(caractere))
    parar += 1

    if numero == parar:
        print()
        if numero == 1:
            print("Você inseriu o caractere '{}' e o programa o repetiu {} vez.".format(caractere, numero))
        else:
            print("Você inseriu o caractere '{}' e o programa o repetiu {} vezes.".format(caractere, numero))
        break