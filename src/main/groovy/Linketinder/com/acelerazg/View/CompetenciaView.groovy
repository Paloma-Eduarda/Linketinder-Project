package Linketinder.com.acelerazg.View

import Linketinder.com.acelerazg.Controller.CompetenciaControl


class CompetenciaView {
    Scanner scanner = new Scanner(System.in)


    private CompetenciaControl competenciaControl
    CompetenciaView() {
        this.competenciaControl = new CompetenciaControl()
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
            scanner.nextLine()

            switch(opcao) {
                case 1:
                    println "\nCompetências cadastrados:"
                    println competenciaControl.listarCompetencias()

                    break
                case 2:
                    println "\n Inserir Competência:"
                    inserirCompetencia()
                    break
                case 3:
                    println "Atualizar uma Competência"
                    println competenciaControl.listarCompetencias()
                    atualizarCompetencia()

                    break
                case 4:
                    println "Remover uma Competência"
                    println competenciaControl.listarCompetencias()
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

        competenciaControl.cadastrarCompetencia(nome)
        println "Competencia inserida com sucesso!!"
    }
    void excluirCompetencia(){

        println "Insira o id da competência que sera excluida:"

        int id = scanner.nextInt()
        scanner.nextLine()

        competenciaControl.excluirCompetencia(id)
        println "Competência excluida com sucesso!!"

    }
    void atualizarCompetencia(){
        println "Adicione o id da competencia que sera editada"
        int id = scanner.nextInt()
        scanner.nextLine()

        println "Nome da Competencia:"
        String nome = scanner.nextLine()

        competenciaControl.editarCompetencia(nome, id)
        println "Compentencia alterada com sucesso!!"

    }

}
