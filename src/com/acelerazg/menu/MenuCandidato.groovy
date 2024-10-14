package com.acelerazg.menu

import com.acelerazg.DAO.CandidatoDAO
import com.acelerazg.DAO.CompetenciaDAO
import com.acelerazg.DAO.PaisDAO
import com.acelerazg.classes.Candidato

class MenuCandidato {
    Candidato candidato
    CandidatoDAO candidatoDAO = new CandidatoDAO()

    CompetenciaDAO competenciaDAO = new CompetenciaDAO()
    MenuCompetencia menuCompetencia = new MenuCompetencia()
    PaisDAO paisDAO = new PaisDAO()

    Scanner scanner = new Scanner(System.in)

   void gerenciarCandidato(){

        def scanner = new Scanner(System.in)

        while (true) {
            println('''
              1 - Listar candidatos
              2 - Inserir um candidato
              3 - Atualizar um candidato 
              4 - Remover um candidato
              5 - Sair 
        ''')

            def opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nCandidatos cadastrados:"
                    println candidatoDAO.listar()

                    break
                case 2:
                    println "\n Inserir Candidato:"
                    inserirCandidato()
                    break
                case 3:
                    println "Atualizar um Candidato"
                    break
                case 4:
                    println "Remover um Candidato"
                    println candidatoDAO.listar()
                    excluirCandidato()
                    break
                case 5:
                    println "Saindo..."
                    return
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
            }
        }

    }
    void inserirCandidato(){

        Scanner scanner = new Scanner(System.in)

        println "Adicione o id País do Candidato:"
        paisDAO.consultarPaises()

        int pais = scanner.nextInt()
        scanner.nextLine()

        println "Nome do Candidato:"
        String nome = scanner.nextLine()

        println "Sobrenome:"
        String sobrenome = scanner.nextLine()

        println "Data de Nascimento (yyyy-MM-dd):"
        String dataNascimento = scanner.nextLine()
        Date data = Date.parse("yyyy-MM-dd", dataNascimento)
        def sqlDate = new java.sql.Date(data.getTime())

        println "CPF:"
        String cpf = scanner.nextLine()
2
        println "Email:"
        String email = scanner.nextLine()

        println "CEP:"
        String cep = scanner.nextLine()

        println "Descrição do Candidato:"
        String descricao = scanner.nextLine()

        println "Senha:"
        String senha = scanner.nextLine()

        candidato = new Candidato(cep, descricao, email, senha, nome, pais, cpf, sqlDate, sobrenome)
        def idCandidato = candidatoDAO.inserir(candidato)

        inserirCompetencias(idCandidato)
    }
    void excluirCandidato(){

        println "Insira o id do candidato que sera excluido:"

        int id = scanner.nextInt()
        scanner.nextLine()

        candidatoDAO.excluir(id)
        println "Canidato excluido com sucesso"

    }
    void inserirCompetencias(int id_candidato){
        while (true){
            println competenciaDAO.listar()
            println "Digite o id da competencias que deseja adicionar"
            println "Não encontrou a competência que precisa?"
            println  "Digite 0 e Adicione uma nova, ou -1 para sair"

            def opcaoComp = scanner.nextInt()

            if(competenciaDAO.listar()*.id.contains(opcaoComp)){
                competenciaDAO.inserirCompetenciaCandidato(id_candidato, opcaoComp)
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

}
