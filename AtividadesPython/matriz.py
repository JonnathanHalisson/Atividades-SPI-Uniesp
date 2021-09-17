def atividade():
    local = [['uniesp', 'joao pessoa'], ['ufcg', 'campina grande']]
    calcular = [[39, 14, 27], [21, 83, 92], [31, 12, 43]]

    for i in range(0, len(local)):
        for b in range(0, len(local[i])):
            print(local[i][b], end=' ')
    print('\n')

    for i in range(0, len(calcular)):
        for b in range(0, len(calcular[i])):
            calcular[i][b] *= 7
            print(calcular[i][b], end=' ')
    print('')

atividade()

