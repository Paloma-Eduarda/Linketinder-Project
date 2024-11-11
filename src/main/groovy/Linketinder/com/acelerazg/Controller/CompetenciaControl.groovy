package Linketinder.com.acelerazg.Controller

import Linketinder.com.acelerazg.DAO.CompetenciaDAO
import Linketinder.com.acelerazg.Model.Competencia
import Linketinder.com.acelerazg.Service.CompetenciaService

class CompetenciaControl {

    private Competencia competencia
    private  CompetenciaService competenciaService

    CompetenciaControl() {
        this.competencia = competencia
        this.competenciaService = new CompetenciaService(new CompetenciaDAO("postgresql"))
    }

    List listarCompetencias(){

        competenciaService.listarCompetencias()
    }

    void cadastrarCompetencia(String  nomeCompetencia){

        competencia = new Competencia(nomeCompetencia)
        competenciaService.cadastrarCompetencia(competencia)
    }

    void editarCompetencia(String nomeCompetencia, int idCompentencia){

        competencia = new Competencia(nomeCompetencia, idCompentencia)
        competenciaService.editarCompetencia(competencia)
    }

    void excluirCompetencia(int id){
        competenciaService.excluirCompetencia(id)
    }

    void inserirCompetenciaCandidato(int idCandidato, int idCompetencia){
        competenciaService.inserirCompetenciaCandidato(idCandidato, idCompetencia)
    }

    void inserirCompetenciaVaga(int idVaga, int idCompetencia){
        competenciaService.inserirCompetenciaVaga(idVaga, idCompetencia)

    }

}
