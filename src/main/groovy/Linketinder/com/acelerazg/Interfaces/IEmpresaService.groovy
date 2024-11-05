package Linketinder.com.acelerazg.Interfaces

import Linketinder.com.acelerazg.classes.Empresa

interface IEmpresaService {

    List listarEmpresas()

    void cadastrarEmpresa(Empresa empresa)

    void editarEmpresa(Empresa empresa)

    void excluirEmpresa(int id)

}