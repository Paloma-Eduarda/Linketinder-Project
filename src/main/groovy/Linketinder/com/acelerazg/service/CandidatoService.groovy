package Linketinder.com.acelerazg.service

import Linketinder.com.acelerazg.DAO.CandidatoDAO
import Linketinder.com.acelerazg.Interfaces.ICandidatoService
import Linketinder.com.acelerazg.classes.Candidato

class CandidatoService implements ICandidatoService{

    CandidatoDAO candidatoDAO = new CandidatoDAO()

    @Override
    List listarCandidato() {
        return candidatoDAO.listar()
    }

    int cadastrarCandidato(Candidato candidato) {
           candidatoDAO.inserir(candidato)
    }
    void editarCandidato(Candidato candidato){
        candidatoDAO.alterar(candidato)
    }
    void excluirCandidato(int id){
        candidatoDAO.excluir(id)
    }

}

