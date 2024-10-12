package com.acelerazg.service
import com.acelerazg.classes.Empresa

class EmpresaService implements PessoaService{

    List<Empresa> empresas = [];
    @Override
    List listar() {
        return empresas
    }


    void cadastrar(Empresa e) {
        empresas.add(e)

    }


}
