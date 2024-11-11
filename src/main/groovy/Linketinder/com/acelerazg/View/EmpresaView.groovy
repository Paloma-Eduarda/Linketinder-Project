package Linketinder.com.acelerazg.View

import Linketinder.com.acelerazg.Controller.EmpresaControl
import Linketinder.com.acelerazg.DAO.EnderecoDAO


class EmpresaView {
    Scanner scanner = new Scanner(System.in)

    private VagaView vagaView
    private  EmpresaControl empresaControl

    EmpresaView() {
        this.empresaControl = new EmpresaControl()
        this.vagaView = new VagaView()
    }

    EnderecoDAO enderecoDAO = new EnderecoDAO("postgresql")


    void gerenciarEmpresa(){

        while (true) {
            println('''
              1 - Listar Empresas
              2 - Inserir uma Empresa
              3 - Atualizar uma Empresa
              4 - Remover uma Empresa    
              5 - Sair 
        ''')

            int opcao = scanner.nextInt()

            switch(opcao) {
                case 1:
                    println "\nEmpresas cadastrados:"
                    println empresaControl.listarEmpresas()
                    println "Digite o id da empresa que deseja Gerenciar uma Vaga, ou adicionar uma vaga"
                    println "Digite 0 para voltar ao menu principal"

                    int opcaoVaga = scanner.nextInt()

                    if(empresaControl.listarEmpresas()*.id.contains(opcaoVaga)){
                        vagaView.gerenciarVaga(opcaoVaga)

                    }else if(opcaoVaga == 0){
                        return
                    }else{
                        println "Opçao invalida"
                    }

                    break
                case 2:
                    println "\n Inserir Empresa:"
                    inserirEmpresa()
                    break
                case 3:
                    println "Atualizar uma Empresa"
                    println empresaControl.listarEmpresas()
                    atualizarEmpresa()
                    break
                case 4:
                    println "Remover uma Empresa"
                    println empresaControl.listarEmpresas()
                    excluirEmpresa()
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
    void inserirEmpresa(){

        println "Adicione o País da Empresa:"
        println enderecoDAO.consultarPaises()

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

        empresaControl.salvarEmpresa(cep, descricao, email, senha, nome, pais, cnpj)

    }
    void excluirEmpresa(){

        println "Insira o id da Empresa que sera excluida:"

        int id = scanner.nextInt()
        scanner.nextLine()

        empresaControl.excluirEmpresa(id)
        println "Empresa excluida com sucesso"

    }
    void atualizarEmpresa(){

        println "Insira o id da Empresa que sera editada:"

        int id = scanner.nextInt()
        scanner.nextLine()

        println "Adicione o País da Empresa:"
        enderecoDAO.consultarPaises()

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

        empresaControl.editarEmpresa(cep, descricao, email, senha, nome, pais, cnpj, id)

    }

}
