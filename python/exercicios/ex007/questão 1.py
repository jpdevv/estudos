#Utilizando estruturas de repetição, escreva um programa em Python que pergunte ao usuário se ele quer realizar uma soma ou uma subtração entre dois números. 
#Dependendo da escolha do usuário, o programa deverá solicitar os dois números, realizar a operação escolhida, exibir o resultado e, em seguida, perguntar se o usuário deseja realizar uma nova operação. 
#Caso o usuário deseje realizar uma nova operação, o programa deverá começar todo o processo novamente e, caso contrário, o programa deverá ser encerrado.
print("-------------[ Calculadora ]-------------\n")

#-----[ Variáveis ]-----
per = ""
soma = 0
sub = 0
continuar = ""
num1 = 0
num2 = 0

#-----[ Sistema ]-----
while True:
    per = str(input("Você deseja somar[ + ] ou subtrair[ - ]? "))
    print()
    print()
    print()
    if per == "-":
        num1 = int(input("Insira o primeiro número a ser subtraído: "))
        num2 = int(input("Insira o segundo número a ser subtraído: "))
        sub = num1 - num2
        print()
        print(f"Resultado: {sub}")
        print()
        print()
        continuar = str(input("Deseja continuar o programa?[S/N] "))
    if per == "+":
        num1 = int(input("Insira o primeiro número a ser somado: "))
        num2 = int(input("Insira o segundo número a ser somado: "))
        soma = num1 + num2
        print()
        print(f"Resultado: {soma}")
        print()
        print()
        continuar = str(input("Deseja continuar o programa?[S/N] "))
    if continuar in "Nn":
        print()
        break