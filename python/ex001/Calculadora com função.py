#Escreva e utilize uma função que receba um caractere ('+', '-', '*' ou '/') e dois números. 
#A função deverá retornar o resultado da operação, entre os dois números, indicada pelo caractere recebido. 
#Exemplo: se a função receber o caractere '+', deverá efetuar a soma entre os dois números recebidos;
#se receber o caractere '-', deverá efetuar a subtração entre os dois números;
#se receber o caractere '*', deverá efetuar a multiplicação entre os dois números
#e se receber o caractere '/', deverá efetuar a divisão entre os dois números.

print("-------------[ Calculadora ]-------------")
def calc(x, y, z):
    if x == "+":
        r = y + z
    if x == "-":
        r = y - z
    if x == "*":
        r = y * z
    if x == "/":
        r = y / z
    return r
print("'+' = Soma\n'-' = Subtração\n'*' = Multiplicação\n'/' = Divisão")
caractere = str(input("Insira um dos caracteres acima: "))
n1 = int(input("Insira um valor para a operação: "))
n2 = int(input("Insira outro valor para a operação: "))
print("Resultado:", calc(caractere, n1, n2))