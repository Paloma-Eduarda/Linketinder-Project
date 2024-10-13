package com.acelerazg.menu

import com.acelerazg.DAO.CandidatoDAO
import com.acelerazg.classes.Candidato

class MenuCandidato {
    Candidato candidato

    CandidatoDAO candidatoDAO = new CandidatoDAO()
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
                    println "Saindo do programa..."
                    break
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
            }
        }

    }
    void inserirCandidato(){

        Scanner scanner = new Scanner(System.in)

        println "Adicione o País do Candidato:"
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
        candidatoDAO.inserir(candidato)
    }
    void excluirCandidato(){

        println "Insira o id do candidato que sera excluido:"

        int id = scanner.nextInt()
        scanner.nextLine()

        candidatoDAO.excluir(id)
        println "Canidato excluido com sucesso"

    }

}
