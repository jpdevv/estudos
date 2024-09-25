#Escreva um programa em Python que pergunte ao usuário se ele quer realizar a operação de soma ou de subtração. 
#Em seguida, o programa deverá solicitar ao usuário que preencha duas listas com números inteiros, cada uma com 6 elementos. 
#Na sequência, o programa deverá efetuar a operação escolhida (soma ou subtração) 
#entre os elementos das listas, sempre seguindo a ordem:
#1° elemento da 1ª lista com o 1° elemento da 2ª lista; 
#2° elemento da 1ª lista com o 2° elemento da 2ª lista; 
#3° elemento da 1ª lista com o 3° elemento da 2ª lista e assim sucessivamente, até realizar a operação com todos os elementos das listas. 
#O programa deverá preencher uma terceira lista com os resultados das operações e, no final, exibir as três listas.

print("-------------[ Calculadora de listas ]-------------")
print()

#-----[ Variáveis ]-----
num = 0
soma1 = 0
soma2 = 0
soma3 = 0
soma4 = 0
soma5 = 0
soma6 = 0
sub1 = 0
sub2 = 0
sub3 = 0
sub4 = 0
sub5 = 0
sub6 = 0
lista1 = []
lista2 = []
lista3 = []
per = ""

#-----[ Sistema ]-----
per = str(input("Você deseja somar[ + ] ou subtrair[ - ]? "))
for n in range(6):
    num = int(input("Insira um número inteiro para preencher a primeira lista: "))
    lista1.append(num)
print()
for r in range(6):
    num = int(input("Insira um número inteiro para preencher a segunda lista: "))
    lista2.append(num)
if per == "+":
    soma1 = lista1[0] + lista2[0]
    soma2 = lista1[1] + lista2[1]
    soma3 = lista1[2] + lista2[2]
    soma4 = lista1[3] + lista2[3]
    soma5 = lista1[4] + lista2[4]
    soma6 = lista1[5] + lista2[5]
    lista3.append(soma1)
    lista3.append(soma2)
    lista3.append(soma3)
    lista3.append(soma4)
    lista3.append(soma5)
    lista3.append(soma6)
if per == "-":
    sub1 = lista1[0] - lista2[0]
    sub2 = lista1[1] - lista2[1]
    sub3 = lista1[2] - lista2[2]
    sub4 = lista1[3] - lista2[3]
    sub5 = lista1[4] - lista2[4]
    sub6 = lista1[5] - lista2[5]
    lista3.append(sub1)
    lista3.append(sub2)
    lista3.append(sub3)
    lista3.append(sub4)
    lista3.append(sub5)
    lista3.append(sub6)
print()
print()
print(f"Primeira lista: {lista1}")
print(f"Segunda lista: {lista2}")
print()
print(f"Soma das duas listas: {lista3}")