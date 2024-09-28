package com.acelerazg.service

import com.acelerazg.classes.Candidato

class CandidatoService implements PessoaService{

        List<Candidato> candidatos = [];
        @Override
        List listar() {
            //return só candidatos
            candidatos.each { pessoa ->
                return pessoa
            }
        }

       void cadastrar(Candidato candidato) {
            candidatos.add(candidato)
        }

    }

