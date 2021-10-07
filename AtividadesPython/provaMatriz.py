def main():
    pesquisa = [
        ['Caoa Chery', 60000, 48],
        ['Capital Fiat', 80000, 60],
        ['Mais', 50000, 48],
        ['Monte Carlo Peugeot', 75000, 60],
        ['Fiori', 36000, 36],
        ['Tambaí', 48000, 40],
        ['Cavalcante Primo', 77000, 60],
        ['Promac', 150000, 60]
    ]

    entrada = 20000
    comparador = 80000
    escolha = []

    adicionar = input('Deseja adicionar mais uma pesquisa, s/n? ')
    while adicionar == 's':
        nova = []
        c = str(input('Informe a concessionária: '))
        v = int(input('Informe o valor do carro: '))
        p = int(input('Informe em quantas vezes: '))
        nova.append(c)
        nova.append(v)
        nova.append(p)
        pesquisa.append(nova)
        adicionar = input('Deseja adicionar mais uma pesquisa, s/n? ')

    for i in range(0, len(pesquisa)):
        parcelas = int((pesquisa[i][1] - entrada) / pesquisa[i][2])
        pesquisa[i].append(parcelas)

        if parcelas < comparador:
            comparador = parcelas
            escolha = pesquisa[i]
    print()
    print(f'Maria, a melhor proposta é o carro da {escolha[0]} em {escolha[2]} parcelas de R${escolha[3]},00 reais.')


main()
