package com.acelerazg.menu

import com.acelerazg.DAO.EmpresaDAO
import com.acelerazg.classes.Empresa

class MenuEmpresa {
    Scanner scanner = new Scanner(System.in)

    MenuVaga vaga = new MenuVaga()

    Empresa empresa
    EmpresaDAO empresaDAO = new EmpresaDAO()

    void gerenciarEmpresa(){

        def scanner = new Scanner(System.in)

        while (true) {
            println('''
              1 - Listar Empresas
              2 - Inserir uma Empresa
              3 - Atualizar uma Empresa
              4 - Remover uma Empresa    
              5 - Sair 
        ''')

            def opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nEmpresas cadastrados:"
                    println empresaDAO.listar()
                    println "Digite 1 para Gerenciar Vaga de Uma empresa"
                    def opcaoVaga = scanner.nextInt()

                    if(opcaoVaga == 1){
                        vaga.gerenciarVaga()
                    }

                    break
                case 2:
                    println "\n Inserir Empresa:"
                    inserirEmpresa()
                    break
                case 3:
                    println "Atualizar uma Empresa"
                    break
                case 4:
                    println "Remover uma Empresa"
                    println empresaDAO.listar()
                    excluirEmpresa()
                    break
                case 5:
                    println "Saindo do programa..."
                    break
                default:
                    println "Opção inválida! Por favor, escolha uma opção válida."
            }
        }

    }
    void inserirEmpresa(){

        Scanner scanner = new Scanner(System.in)

        println "Adicione o País da Empresa:"
        int pais = scanner.nextInt()
        scanner.nextLine()

        println "Nome da Empresa:"
        String nome = scanner.nextLine()

        println "CNPJ:"
        String cnpj = scanner.nextLine()

        println "Email:"
        String email = scanner.nextLine()

        println "CEP:"
        String cep = scanner.nextLine()

        println "Descrição da Empresa:"
        String descricao = scanner.nextLine()

        println "Senha:"
        String senha = scanner.nextLine()

        empresa = new Empresa(cep, descricao, email, senha, nome, pais, cnpj)
        empresaDAO.inserir(empresa)

    }
    void excluirEmpresa(){

        println "Insira o id da Empresa que sera excluido:"

        int id = scanner.nextInt()
        scanner.nextLine()

        empresaDAO.excluir(id)
        println "Empresa Excluida com sucesso"

    }

}
