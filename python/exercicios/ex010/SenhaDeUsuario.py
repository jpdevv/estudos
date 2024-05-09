#Utilizando estruturas de repetição, escreva um programa em Python que leia uma senha do usuário e fique, 
#constantemente, exibindo uma mensagem de erro enquanto a senha digitada for diferente de 1234. 
#O programa só deverá ser encerrado quando o usuário digitar a senha correta.

print("-------------[ Senha de usuário ]-------------\n")

senha = ""
while True:
    senha = input("Digite a senha: ")
    if senha != "1234":
        print("Senha incorreta!")
        print()
    else:
        print("Senha correta!")
        break