package com.acelerazg.menu

import com.acelerazg.DAO.CompetenciaDAO
import com.acelerazg.classes.Competencia

class MenuCompetencia {
    Scanner scanner = new Scanner(System.in)

    Competencia competencia
    CompetenciaDAO competenciaDAO = new CompetenciaDAO()

    void gerenciarCompetencia(){

        def scanner = new Scanner(System.in)

        while (true) {
            println('''
              1 - Listar Competências
              2 - Inserir uma nova competência 
              3 - Atualizar uma competência
              4 - Remover uma competência    
              5 - Sair 
        ''')

            def opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nCompetências cadastrados:"
                    println competenciaDAO.listar()

                    break
                case 2:
                    println "\n Inserir Competência:"
                    inserirCompetencia()
                    break
                case 3:
                    println "Atualizar uma Competência"
                    println competenciaDAO.listar()
                    atualizarCompetencia()

                    break
                case 4:
                    println "Remover uma Competência"
                    println competenciaDAO.listar()
                    excluirCompetencia()
                    break
                case 5:
                    println "Saindo do programa..."
                    break
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
                    return
            }
        }

    }
    void inserirCompetencia(){

        println "Nome da Competencia:"
        String nome = scanner.nextLine()

        competencia = new Competencia(nome)
        competenciaDAO.inserir(competencia)
    }
    void excluirCompetencia(){

        println "Insira o id da competência que sera excluida:"

        int id = scanner.nextInt()
        scanner.nextLine()

        competenciaDAO.excluir(id)
        println "Competência excluida com sucesso!!"

    }
    void atualizarCompetencia(){
        println "Adicione o id da competencia que sera editada"
        int id = scanner.nextInt()
        scanner.nextLine()

        println "Nome da Competencia:"
        String nome = scanner.nextLine()

        competencia = new Competencia(nome, id)
        competenciaDAO.alterar(competencia)
    }

}
