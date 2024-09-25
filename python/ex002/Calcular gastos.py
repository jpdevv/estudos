#Escreva uma função que receba a distância total percorrida em uma viagem (em km), o valor do litro do combustível (em R$)
#a quantidade de km que o veículo anda com cada litro de combustível e o valor que o usuário tem para gastar com o combustível de uma viagem. 
#A função deverá retornar um valor lógico (True ou False) indicando se o usuário conseguirá pagar o combustível necessário para realizar a viagem. 
#Faça um programa que utilize a função criada.

print("-------------[ Calcular gastos ]-------------")
def per(w, x, y, z):
    a = z / x
    b = a * y
    if b >= w:
        f = "poderá"
    else:
        f = "não poderá"
    return f
km = float(input("Insira a distância em Km da viagem: "))
vcom = float(input("Insira o valor do litro do combustível em R$: "))
kmporl = float(input("Insira quantos Kms o veículo faz por litro: "))
dinheiro = float(input("Insira quantos R$ você tem para gastar com combustível: "))
print("Você {} realizar a viagem!".format(per(km, vcom, kmporl, dinheiro)))