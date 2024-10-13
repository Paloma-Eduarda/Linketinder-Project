package com.acelerazg.menu
import com.acelerazg.DAO.VagaDAO
import com.acelerazg.classes.Empresa
import com.acelerazg.classes.Vaga

class MenuVaga {
    Vaga vaga

    VagaDAO vagaDAO = new VagaDAO()

    void gerenciarVaga(){

        def scanner = new Scanner(System.in)

        while (true) {
            println('''
              1 - Listar Vagas
              2 - Inserir uma Vaga
              3 - Atualizar uma Vaga
              4 - Remover uma Vaga    
              5 - Sair 
        ''')

            def opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nVagas cadastrados:"
                    println vagaDAO.listar()

                    break
                case 2:
                    println "\n Inserir Vaga:"
                    inserirVaga()
                    break
                case 3:
                    println "Atualizar uma Vaga"
                    break
                case 4:
                    println "Remover uma Vaga"
                    break
                case 5:
                    println "Saindo do programa..."
                    break
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
            }
        }

    }
    void inserirVaga(){

        Scanner scanner = new Scanner(System.in)

        println "Digite o id da Empresa"
        int empresa = scanner.nextInt()
        scanner.nextLine()

        println "Adicione a Estado da Vaga:"
        int estado = scanner.nextInt()
        scanner.nextLine()

        println "Cidade da Vaga:"
        String cidade = scanner.nextLine()

        println "Nome da Vaga:"
        String nome = scanner.nextLine()

        println "Descrição da Vaga:"
        String descricao = scanner.nextLine()

        vaga = new Vaga(cidade, descricao, empresa, estado, nome)
        vagaDAO.inserir(vaga)
    }

}