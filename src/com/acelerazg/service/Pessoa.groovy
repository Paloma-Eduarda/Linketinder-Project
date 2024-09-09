package com.acelerazg.service

import com.acelerazg.classes.PessoaFisica
import com.acelerazg.classes.PessoaJuridica

interface Pessoa {
    List listar()

    void cadastrar(Object p)

}