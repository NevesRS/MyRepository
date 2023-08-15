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

filtragem_por_nome(caminho_entrada, caminho_saida)