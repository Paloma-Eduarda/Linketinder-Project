package Linketinder.com.acelerazg.View

import Linketinder.com.acelerazg.Controller.CompetenciaControl
import Linketinder.com.acelerazg.Controller.VagaControl
import Linketinder.com.acelerazg.DAO.CompetenciaDAO
import Linketinder.com.acelerazg.DAO.EnderecoDAO
import Linketinder.com.acelerazg.Service.CompetenciaService


class VagaView {
    Scanner scanner = new Scanner(System.in)
    EnderecoDAO enderecoDAO = new EnderecoDAO("postgresql")

    private CompetenciaView menuCompetencia
    private CompetenciaControl competenciaControl
    private VagaControl vagaControl

    VagaView() {
        this.menuCompetencia = new CompetenciaView()
        this.vagaControl = new VagaControl()
        this.competenciaControl = new CompetenciaControl()
    }

    void gerenciarVaga(int id_empresa){

        while (true) {
            println('''
              1 - Listar Vagas
              2 - Inserir uma Vaga
              3 - Atualizar uma Vaga
              4 - Remover uma Vaga    
              5 - Sair 
        ''')

            int opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nVagas cadastrados:"

                    println vagaControl.listarVagas(id_empresa)

                    break
                case 2:
                    println "\n Inserir Vaga:"
                    inserirVaga(id_empresa)
                    break
                case 3:
                    println "Atualizar uma Vaga"
                    println vagaControl.listarVagas(id_empresa)
                    atualizarVaga(id_empresa)
                    break
                case 4:
                    println "Remover uma Vaga"
                    println vagaControl.listarVagas(id_empresa)
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
        println enderecoDAO.consultarEstados()

        int estado = scanner.nextInt()
        scanner.nextLine()

        println "Cidade da Vaga:"
        String cidade = scanner.nextLine()

        println "Nome da Vaga:"
        String nome = scanner.nextLine()

        println "Descrição da Vaga:"
        String descricao = scanner.nextLine()

        int id_vaga = vagaControl.salvarVaga(cidade, descricao, id, estado, nome)
        inserirCompetenciasVaga(id_vaga)

    }
    void excluirVaga(){

        println "Insira o id da vaga que sera excluida:"

        int id = scanner.nextInt()
        scanner.nextLine()

        vagaControl.excluirVaga(id)
        println "Vaga excluida com sucesso"

    }
    void inserirCompetenciasVaga(int id_vaga){

        while (true){
            println competenciaControl.listarCompetencias()
            println "Digite o id da competencias que deseja adicionar"
            println "Não encontrou a competência que precisa?"
            println  "Digite 0 e Adicione uma nova, ou -1 para sair"

            int opcaoComp = scanner.nextInt()

            if(competenciaControl.listarCompetencias()*.id.contains(opcaoComp)){
                competenciaControl.inserirCompetenciaVaga(id_vaga, opcaoComp)
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
        println enderecoDAO.consultarEstados()

        int estado = scanner.nextInt()
        scanner.nextLine()

        println "Cidade da Vaga:"
        String cidade = scanner.nextLine()

        println "Nome da Vaga:"
        String nome = scanner.nextLine()

        println "Descrição da Vaga:"
        String descricao = scanner.nextLine()

        vagaControl.editarVaga(cidade, descricao, id_empresa, estado, id, nome)
    }

}
