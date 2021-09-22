agendaContatos = {}
agendaContatosF = []
opcao = None

print('Agenda de contatos para facilitar sua vida')
print('============================================')
print('-> Digite 1 para cadastrar um novo contato')
print('-> Digite 2 para pesquisar um contato')
print('-> Digite 3 para alterar um contato')
print('-> Digite 4 para excluir um contato')
print('-> Dgitite 5 para imprimir todos os contatos')
print('-> Digite 6 para imprimir só os favoritos')
print('-> Digite 0 para sair. =(', end='\n\n')

# opcao = input('Qual opção você deseja? ')

while opcao != '0':

    opcao = input('Qual opção você deseja? ')
    if opcao == '1':
        favoritoContato = False
        nomeContato = input('Digite seu nome: ')
        numeroTelefone = input('Digite o numero: ')
        nomeCidade = input('Digite o nome da cidade: ')
        favorito = input('Deseja adicionar seu contato aos favoritos? s/n: ')
        if favorito == 's':
            favoritoContato = True

        agendaContatos[nomeContato] = dict(nome=nomeContato, telefone=numeroTelefone, cidade=nomeCidade, favorito=favoritoContato)

        if favoritoContato:
            agendaContatosF.append(agendaContatos[nomeContato])
        print(agendaContatos)

    elif opcao == '2':
        pesquisarContato = input('Qual nome você deseja pesquisar? ')

        if agendaContatos[pesquisarContato]:
            print('Contato encontrado!')
            print(agendaContatos[pesquisarContato])

    elif opcao == '3':
        mudarContato = input('Qual contato você deseja alterar? ')

        favoritoContato = False
        nomeContato = input('Digite seu nome: ')
        numeroTelefone = input('Digite o numero: ')
        nomeCidade = input('Digite o nome da cidade: ')
        favorito = input('Deseja adicionar seu contato aos favoritos? s/n: ')
        if favorito == 's':
            favoritoContato = True
        agendaContatos[mudarContato] = dict(nome=nomeContato, telefone=numeroTelefone, cidade=nomeCidade, favorito=favoritoContato)
        print(agendaContatos)

    elif opcao == '4':
        deletarContato = input('Qual contato você deseja deletar? ')

        del agendaContatos[deletarContato]
        print(agendaContatos)

    elif opcao == '5':
        print(agendaContatos, end='\n')

    elif opcao == '6':
        print(agendaContatosF)
        
print('xau')
