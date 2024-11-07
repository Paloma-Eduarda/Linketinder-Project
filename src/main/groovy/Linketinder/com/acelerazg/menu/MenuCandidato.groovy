package Linketinder.com.acelerazg.menu

import Linketinder.com.acelerazg.DAO.CandidatoDAO
import Linketinder.com.acelerazg.DAO.CompetenciaDAO
import Linketinder.com.acelerazg.DAO.ConexaoDAO
import Linketinder.com.acelerazg.DAO.ConexaoFactory
import Linketinder.com.acelerazg.DAO.EnderecoDAO
import Linketinder.com.acelerazg.classes.Candidato
import Linketinder.com.acelerazg.service.CandidatoService
import Linketinder.com.acelerazg.service.CompetenciaService

import java.time.LocalDate

class MenuCandidato {
    Candidato candidato

    private CandidatoService candidatoService
    private CompetenciaService competenciaService
    private MenuCompetencia menuCompetencia

    EnderecoDAO enderecoDAO = new EnderecoDAO("postgresql")

    Scanner scanner = new Scanner(System.in)

    MenuCandidato() {
        CandidatoDAO candidatoDAO = new CandidatoDAO("postgresql");
        CompetenciaDAO competenciaDAO = new CompetenciaDAO("postgresql")
        this.candidatoService = new CandidatoService(candidatoDAO)
        this.competenciaService = new CompetenciaService(competenciaDAO)
        this.menuCompetencia = new MenuCompetencia()
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
                    println candidatoService.listarCandidato()

                    break
                case 2:
                    println "\n Inserir Candidato:"
                    inserirCandidato()
                    break
                case 3:
                    println "Atualizar um Candidato"
                    println candidatoService.listarCandidato()
                    atualizarCandidato()
                    break
                case 4:
                    println "Remover um Candidato"
                    println candidatoService.listarCandidato()
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

        candidato = new Candidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome)
        int idCandidato = candidatoService.cadastrarCandidato(candidato)
        inserirCompetencias(idCandidato)
    }

    void excluirCandidato(){

        println "Insira o id do candidato que sera excluido:"

        int id = scanner.nextInt()
        scanner.nextLine()

        candidatoService.excluirCandidato(id)
        println "Canidato excluido com sucesso"

    }
    void inserirCompetencias(int id_candidato){
        while (true){
            println competenciaService.listarCompetencias()
            println "Digite o id da competencias que deseja adicionar"
            println "Não encontrou a competência que precisa?"
            println  "Digite 0 e Adicione uma nova, ou -1 para sair"

            int opcaoComp = scanner.nextInt()

            if(competenciaService.listarCompetencias()*.id.contains(opcaoComp)){
                competenciaService.inserirCompetenciaCandidato(id_candidato, opcaoComp)
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

        candidato = new Candidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome, id)
        candidatoService.editarCandidato(candidato)

    }

}
