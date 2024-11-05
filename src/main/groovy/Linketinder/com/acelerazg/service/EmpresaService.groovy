package Linketinder.com.acelerazg.service

import Linketinder.com.acelerazg.DAO.EmpresaDAO
import Linketinder.com.acelerazg.Interfaces.IEmpresaService
import Linketinder.com.acelerazg.classes.Empresa

class EmpresaService implements IEmpresaService{

    EmpresaDAO empresaDAO = new EmpresaDAO()

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
