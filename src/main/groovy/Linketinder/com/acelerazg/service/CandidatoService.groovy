package Linketinder.com.acelerazg.service

import Linketinder.com.acelerazg.classes.Candidato

class CandidatoService implements PessoaService{

        List<Candidato> candidatos = [];
        @Override
        List listar() {
           return candidatos
        }

       void cadastrar(Candidato candidato) {
            candidatos.add(candidato)
        }

    }

