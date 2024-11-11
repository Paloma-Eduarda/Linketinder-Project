package Linketinder.com.acelerazg.View

import Linketinder.com.acelerazg.Controller.CandidatoControl
import Linketinder.com.acelerazg.Controller.CompetenciaControl
import Linketinder.com.acelerazg.DAO.EnderecoDAO


import java.time.LocalDate

class CandidatoView {

    private CandidatoControl candidatoControl
    private CompetenciaControl competenciaControl
    private CompetenciaView menuCompetencia

    EnderecoDAO enderecoDAO = new EnderecoDAO("postgresql")

    Scanner scanner = new Scanner(System.in)

    CandidatoView() {
        this.competenciaControl = new CompetenciaControl()
        this.candidatoControl = new CandidatoControl()
        this.menuCompetencia = new CompetenciaView()
    }

    void gerenciarCandidato(){

        while (true) {
            println('''
              1 - Listar candidatos
              2 - Inserir um candidato
              3 - Atualizar um candidato 
              4 - Remover um candidato
              5 - Sair 
        ''')

            int opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nCandidatos cadastrados:"
                    println candidatoControl.listarCandidato()
                    break
                case 2:
                    println "\n Inserir Candidato:"
                    inserirCandidato()
                    break
                case 3:
                    println "Atualizar um Candidato"
                    println candidatoControl.listarCandidato()
                    atualizarCandidato()
                    break
                case 4:
                    println "Remover um Candidato"
                    println candidatoControl.listarCandidato()
                    excluirCandidato()
                    break
                case 5:
                    println "Saindo..."
                    return
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
                    break
            }
        }

    }
    void inserirCandidato(){

        println "Adicione o id País do Candidato:"
        println enderecoDAO.consultarPaises()

        int pais = scanner.nextInt()
        scanner.nextLine()

        println "Nome do Candidato:"
        String nome = scanner.nextLine()

        println "Sobrenome:"
        String sobrenome = scanner.nextLine()

        println "Data de Nascimento (yyyy-MM-dd):"
        String dataNascimento = scanner.nextLine()
        LocalDate data = LocalDate.parse(dataNascimento)

        println "CPF:"
        String cpf = scanner.nextLine()

        println "Email:"
        String email = scanner.nextLine()

        println "CEP:"
        String cep = scanner.nextLine()

        println "Descrição do Candidato:"
        String descricao = scanner.nextLine()

        println "Senha:"
        String senha = scanner.nextLine()

        int idCandidato = candidatoControl.salvarCandidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome)
        inserirCompetenciasCandidato(idCandidato)
    }

    void excluirCandidato(){

        println "Insira o id do candidato que sera excluido:"

        int id = scanner.nextInt()
        scanner.nextLine()

        candidatoControl.excluirCandidato(id)
        println "Canidato excluido com sucesso"

    }
    void inserirCompetenciasCandidato(int id_candidato){
        while (true){
            println competenciaControl.listarCompetencias()
            println "Digite o id da competencias que deseja adicionar"
            println "Não encontrou a competência que precisa?"
            println  "Digite 0 e Adicione uma nova, ou -1 para sair"

            int opcaoComp = scanner.nextInt()

            if(competenciaControl.listarCompetencias()*.id.contains(opcaoComp)){
                competenciaControl.inserirCompetenciaCandidato(id_candidato, opcaoComp)
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
    void atualizarCandidato(){

        println "Insira o id do candidato que sera editado:"

        int id = scanner.nextInt()
        scanner.nextLine()

        println "Adicione o novo id País do Candidato:"
        println enderecoDAO.consultarPaises()

        int pais = scanner.nextInt()
        scanner.nextLine()

        println "Nome do Candidato:"
        String nome = scanner.nextLine()

        println "Sobrenome:"
        String sobrenome = scanner.nextLine()

        println "Data de Nascimento (yyyy-MM-dd):"
        String dataNascimento = scanner.nextLine()
        LocalDate data = LocalDate.parse(dataNascimento)

        println "CPF:"
        String cpf = scanner.nextLine()

        println "Email:"
        String email = scanner.nextLine()

        println "CEP:"
        String cep = scanner.nextLine()

        println "Descrição do Candidato:"
        String descricao = scanner.nextLine()

        println "Senha:"
        String senha = scanner.nextLine()

        candidatoControl.editarCandidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome, id)

    }

}
