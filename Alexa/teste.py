def hora_para_minutos(hora_str):
    horas, minutos = map(int, hora_str.split(':'))
    horasValor = horas
    minutosValor = minutos
    return horasValor, minutosValor

hora1_str = "11:56"
hora2_str = "11:57"

horas_hora1, minutos_hora1 = hora_para_minutos(hora1_str)
horas_hora2, minutos_hora2 = hora_para_minutos(hora2_str)

diferencaHorario = abs(minutos_hora1 - minutos_hora2)

if horas_hora1 == horas_hora2:
    if diferencaHorario == 1 or diferencaHorario == 0:
        print("Horário válido!")
