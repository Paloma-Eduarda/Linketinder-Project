package Linketinder.com.acelerazg.Controller


import Linketinder.com.acelerazg.DAO.EmpresaDAO
import Linketinder.com.acelerazg.Model.Empresa
import Linketinder.com.acelerazg.Service.EmpresaService


class EmpresaControl {
    private Empresa empresa
    private EmpresaService empresaService

    EmpresaControl() {
        this.empresa = empresa
        this.empresaService = new EmpresaService(new EmpresaDAO("postgresql"))
    }

    List listarEmpresas() {
        return empresaService.listarEmpresas()
    }

    void salvarEmpresa(String cep, String descricao, String email, String senha, String nome, int pais, String cnpj){

        empresa = new Empresa(cep, descricao, email, senha, nome, pais, cnpj)
        empresaService.cadastrarEmpresa(empresa)
    }

    void editarEmpresa(String cep, String descricao, String email, String senha, String nome, int pais, String cnpj, int id){

        empresa = new Empresa(cep, descricao, email, senha, nome, pais, cnpj, id)
        empresaService.editarEmpresa(empresa)

    }
    void excluirEmpresa(int id){
        empresaService.excluirEmpresa(id)
    }
}
