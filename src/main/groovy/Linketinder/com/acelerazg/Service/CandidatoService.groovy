package Linketinder.com.acelerazg.Service

import Linketinder.com.acelerazg.DAO.CandidatoDAO
import Linketinder.com.acelerazg.Interfaces.ICandidatoService
import Linketinder.com.acelerazg.Model.Candidato

class CandidatoService implements ICandidatoService{

    private CandidatoDAO candidatoDAO

    CandidatoService(CandidatoDAO candidatoDAO) {
        this.candidatoDAO = candidatoDAO
    }

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

