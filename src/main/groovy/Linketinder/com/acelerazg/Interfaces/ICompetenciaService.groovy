package Linketinder.com.acelerazg.Interfaces


import Linketinder.com.acelerazg.Model.Competencia

interface ICompetenciaService {

    List listarCompetencias()

    void cadastrarCompetencia(Competencia competencia)

    void editarCompetencia(Competencia competencia)

    void excluirCompetencia(int id)

    void inserirCompetenciaCandidato(int idCandidato, int idCompetencia)

    void inserirCompetenciaVaga(int idVaga, int idCompetencia)

}