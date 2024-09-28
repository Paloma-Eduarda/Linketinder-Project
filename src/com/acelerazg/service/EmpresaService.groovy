package com.acelerazg.service
import com.acelerazg.classes.Empresa

class EmpresaService implements PessoaService{

    List<Empresa> empresas = [];
    @Override
    List listar() {
        //return só empresa
        empresas.each { empresa ->
            return empresa
        }
    }


    void cadastrar(Empresa e) {
        empresas.add(e)

    }


}
