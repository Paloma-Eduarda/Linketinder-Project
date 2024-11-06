package Linketinder.com.acelerazg.service

import Linketinder.com.acelerazg.DAO.CompetenciaDAO
import Linketinder.com.acelerazg.Interfaces.ICompetenciaService
import Linketinder.com.acelerazg.classes.Competencia

class CompetenciaService implements  ICompetenciaService {

    private CompetenciaDAO competenciaDAO

    CompetenciaService(CompetenciaDAO competenciaDAO) {
        this.competenciaDAO = competenciaDAO
    }

    @Override
    List listarCompetencias() {
        return competenciaDAO.listar()
    }

    @Override
    int cadastrarCompetencia(Competencia competencia) {
        competenciaDAO.inserir(competencia)
    }

    @Override
    void editarCompetencia(Competencia competencia) {
        competenciaDAO.alterar(competencia)
    }

    @Override
    void excluirCompetencia(int id) {
        competenciaDAO.excluir(id)
    }

    @Override
    void inserirCompetenciaCandidato(int idCandidato, int idCompetencia) {
        competenciaDAO.inserirCompetenciaCandidato(idCandidato, idCompetencia)

    }

    @Override
    void inserirCompetenciaVaga(int idVaga, int idCompetencia) {
        competenciaDAO.inserirCompetenciaVaga(idVaga, idCompetencia)

    }
}
