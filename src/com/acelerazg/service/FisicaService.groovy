package com.acelerazg.service

import com.acelerazg.classes.PessoaFisica

class FisicaService implements Pessoa{

        List<PessoaFisica> pessoas = [];
        @Override
        List listar() {
            pessoas.each { pessoa ->
                return pessoa
            }
        }
        @Override
       void cadastrar(Object pessoa) {
            pessoas.add(pessoa)
        }

    }

