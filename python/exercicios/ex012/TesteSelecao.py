#Escreva um programa em Python que realize um teste de seleção de uma empresa.
#O programa deverá fazer perguntas ao candidato e ele só será contratado se atender aos critérios à seguir. 
# - Ser maior de 21 anos e menor de 65;
# - ser brasileiro e ter mais de 5 anos de experiência na função.
#O programa deverá fazer uma pergunta para o primeiro critério e só deverá passar para os próximos critérios caso o canditado atenda ao critério atual. 
#No final, o programa deverá informar se o canditado foi ou não aprovado.

print("-------------[ Teste de seleção ]-------------\n")

id = 0
br = ""
exp = 0

id = int(input("Informe sua idade: "))
while True:
    if id <= 21 or id >= 65:
        print("Você não foi aprovado!")
        break
    else:
        br = str(input("Você é brasileiro? (use S para sim e N para não) "))
    if br in "Nn":
        print("Você não foi aprovado!")
        break
    else:
        exp = int(input("Quantos anos de experiência você tem? "))
    if exp < 5:
        print("Você não foi aprovado!")
        break
    else:
        print("Você foi aprovado!")
        break