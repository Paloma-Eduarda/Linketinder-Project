package com.acelerazg.menu

import com.acelerazg.DAO.CompetenciaDAO
import com.acelerazg.DAO.EnderecoDAO
import com.acelerazg.DAO.VagaDAO
import com.acelerazg.classes.Vaga

class MenuVaga {
    Scanner scanner = new Scanner(System.in)

    Vaga vaga
    VagaDAO vagaDAO = new VagaDAO()

    CompetenciaDAO competenciaDAO = new CompetenciaDAO()
    MenuCompetencia menuCompetencia = new MenuCompetencia()

    EnderecoDAO enderecoDAO = new EnderecoDAO()

    void gerenciarVaga(int id_empresa){

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

                    //melhorar
                    println vagaDAO.listar(id_empresa)

                    break
                case 2:
                    println "\n Inserir Vaga:"
                    inserirVaga(id_empresa)
                    break
                case 3:
                    println "Atualizar uma Vaga"
                    println vagaDAO.listar(id_empresa)
                    atualizarVaga(id_empresa)
                    break
                case 4:
                    println "Remover uma Vaga"
                    println vagaDAO.listar(id_empresa)
                    excluirVaga()
                    break
                case 5:
                    println "Saindo do programa..."
                    return
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
            }
        }

    }
    void inserirVaga(int id){

        println "Adicione o id do  Estado da Vaga:"
        enderecoDAO.consultarEstados()

        int estado = scanner.nextInt()
        scanner.nextLine()

        println "Cidade da Vaga:"
        String cidade = scanner.nextLine()

        println "Nome da Vaga:"
        String nome = scanner.nextLine()

        println "Descrição da Vaga:"
        String descricao = scanner.nextLine()


        vaga = new Vaga(cidade, descricao, id, estado, nome)
        def id_vaga = vagaDAO.inserir(vaga)

        inserirCompetencias(id_vaga)
    }
    void excluirVaga(){

        println "Insira o id da vaga que sera excluida:"

        int id = scanner.nextInt()
        scanner.nextLine()

        vagaDAO.excluir(id)
        println "Vaga excluida com sucesso"

    }
    void inserirCompetencias(int id_vaga){

        while (true){
            println competenciaDAO.listar()
            println "Digite o id da competencias que deseja adicionar"
            println "Não encontrou a competência que precisa?"
            println  "Digite 0 e Adicione uma nova, ou -1 para sair"

            def opcaoComp = scanner.nextInt()

            if(competenciaDAO.listar()*.id.contains(opcaoComp)){
                competenciaDAO.inserirCompetenciaVaga(id_vaga, opcaoComp)
            }else if(opcaoComp == 0){
                menuCompetencia.inserirCompetencia()
            }else if(opcaoComp == -1){
                break
            }
            else{
                println "Opção ou id invalido, digite um id valido"
            }
        }
    }
    void atualizarVaga(int id_empresa){

        println "Insira o id da Vaga que sera editada:"

        int id = scanner.nextInt()
        scanner.nextLine()

        println "Adicione o id do  Estado da Vaga:"
        enderecoDAO.consultarEstados()

        int estado = scanner.nextInt()
        scanner.nextLine()

        println "Cidade da Vaga:"
        String cidade = scanner.nextLine()

        println "Nome da Vaga:"
        String nome = scanner.nextLine()

        println "Descrição da Vaga:"
        String descricao = scanner.nextLine()


        vaga = new Vaga(cidade, descricao, id_empresa, estado, id, nome)
        vagaDAO.alterar(vaga)
    }

}
