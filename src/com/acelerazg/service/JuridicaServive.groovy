package com.acelerazg.service

import com.acelerazg.classes.PessoaFisica
import com.acelerazg.classes.PessoaJuridica

class JuridicaServive implements Pessoa{
    List<PessoaJuridica> empresas = [];
    @Override
    List listar() {
        empresas.each { empresa ->
            return empresa
        }
    }

    @Override
    void cadastrar(Object p) {
        empresas.add(p)
    }


}
