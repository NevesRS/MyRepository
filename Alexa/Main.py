import csv

# Caminho do arquivo de entrada e saída
caminho_entrada = 'Alexa/entrada.csv'
caminho_saida = 'Alexa/saida.csv'


def filtragem_por_nome(entrada, saida):
    with open(entrada, 'r') as arquivo_csv:
        leitor_csv = csv.reader(arquivo_csv)
        cabecalho = next(leitor_csv)
        linhas_nome = [linha for linha in leitor_csv if linha[2] == "Fechadura" or linha[2] == "Motion Sensor"]


    with open(saida, 'w', newline='') as arquivo_saida:
        escritor_csv = csv.writer(arquivo_saida)
        escritor_csv.writerow(cabecalho)
        escritor_csv.writerows(linhas_nome)

# filtragem_por_nome(caminho_entrada, caminho_saida)

def filtragem_sem_erros(entrada, saida):
    with open(entrada, 'r') as arquivo_csv:
        leitor_csv = csv.reader(arquivo_csv)
        cabecalho = next(leitor_csv)
        linhas_nome = [linha for linha in leitor_csv if linha[4] == "Lock State" or linha[4] == "Motion Detection"]


    with open(saida, 'w', newline='') as arquivo_saida:
        escritor_csv = csv.writer(arquivo_saida)
        escritor_csv.writerow(cabecalho)
        escritor_csv.writerows(linhas_nome)

# filtragem_sem_erros(caminho_entrada, caminho_saida)


# def filtragem_contexto_porta(entrada, saida):
#     contLocked = 0
#     linhas_escrever = []

#     with open(entrada, 'r') as arquivo_csv:
#         leitor_csv = csv.reader(arquivo_csv)
#         cabecalho = next(leitor_csv)
#         for linha in leitor_csv:
#             if linha[5] == "LOCKED":
#                 contLocked+=1
#                 print(contLocked)
#                 if contLocked == 1:
#                      linhas_escrever.append(linha)
#             else:
#                 contLocked = 0
        

#     with open(saida, 'w', newline='') as arquivo_saida:
#         escritor_csv = csv.writer(arquivo_saida)
#         escritor_csv.writerow(cabecalho)
#         escritor_csv.writerows(linhas_escrever)

vetor_horarios = []

def separa_hora(hora_str):
    horas, minutos = map(int, hora_str.split(':'))
    return horas, minutos

def filtragem_por_horario(entrada, saida):
    with open(entrada, 'r') as arquivo_csv:
        leitor_csv = csv.reader(arquivo_csv)
        cabecalho = next(leitor_csv)
        for linha in leitor_csv:
            valor = linha[1]
            vetor_horarios.append(valor)
    for horario in vetor_horarios:
            horas, minutos = separa_hora(horario)
            print(minutos)

    # with open(saida, 'w', newline='') as arquivo_saida:
    #     escritor_csv = csv.writer(arquivo_saida)
    #     escritor_csv.writerow(cabecalho)
    #     escritor_csv.writerows(linhas_nome)

# filtragem_contexto_porta(caminho_entrada, caminho_saida)
# filtragem_por_nome(caminho_entrada, caminho_saida)
# filtragem_sem_erros(caminho_entrada, caminho_saida)
filtragem_por_horario(caminho_entrada, caminho_saida)
