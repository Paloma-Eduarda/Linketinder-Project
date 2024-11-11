package Linketinder.com.acelerazg.Service

import Linketinder.com.acelerazg.DAO.EmpresaDAO
import Linketinder.com.acelerazg.Interfaces.IEmpresaService
import Linketinder.com.acelerazg.Model.Empresa

class EmpresaService implements IEmpresaService{

    private EmpresaDAO empresaDAO

    EmpresaService(EmpresaDAO empresaDAO) {
        this.empresaDAO = empresaDAO
    }

    List listarEmpresas() {
        return empresaDAO.listar()
    }
    void cadastrarEmpresa(Empresa empresa) {
        empresaDAO.inserir(empresa)
    }
    void editarEmpresa(Empresa empresa){
        empresaDAO.alterar(empresa)
    }
    void excluirEmpresa(int id){
        empresaDAO.excluir(id)
    }

}
