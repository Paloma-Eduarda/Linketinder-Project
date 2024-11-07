package Linketinder.com.acelerazg.menu

import Linketinder.com.acelerazg.DAO.CompetenciaDAO
import Linketinder.com.acelerazg.classes.Competencia
import Linketinder.com.acelerazg.service.CompetenciaService

class MenuCompetencia {
    Scanner scanner = new Scanner(System.in)

    Competencia competencia
    private CompetenciaService competenciaService

    MenuCompetencia() {
        CompetenciaDAO competenciaDAO = new CompetenciaDAO("postgresql")
        this.competenciaService = new CompetenciaService(competenciaDAO)
    }

    void gerenciarCompetencia(){


        while (true) {
            println('''
              1 - Listar Competências
              2 - Inserir uma nova competência 
              3 - Atualizar uma competência
              4 - Remover uma competência    
              5 - Sair 
        ''')

            int opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nCompetências cadastrados:"
                    println competenciaService.listarCompetencias()

                    break
                case 2:
                    println "\n Inserir Competência:"
                    inserirCompetencia()
                    break
                case 3:
                    println "Atualizar uma Competência"
                    println competenciaService.listarCompetencias()
                    atualizarCompetencia()

                    break
                case 4:
                    println "Remover uma Competência"
                    println competenciaService.listarCompetencias()
                    excluirCompetencia()
                    break
                case 5:
                    println "Saindo do programa..."
                    return
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
                    break
            }
        }

    }
    void inserirCompetencia(){

        println "Nome da Competencia:"
        String nome = scanner.nextLine()

        competencia = new Competencia(nome)
        competenciaService.cadastrarCompetencia(competencia)
    }
    void excluirCompetencia(){

        println "Insira o id da competência que sera excluida:"

        int id = scanner.nextInt()
        scanner.nextLine()

        competenciaService.excluirCompetencia(id)
        println "Competência excluida com sucesso!!"

    }
    void atualizarCompetencia(){
        println "Adicione o id da competencia que sera editada"
        int id = scanner.nextInt()
        scanner.nextLine()

        println "Nome da Competencia:"
        String nome = scanner.nextLine()

        competencia = new Competencia(nome, id)
        competenciaService.editarCompetencia(competencia)
    }

}
