package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.classes.Competencia
import groovy.sql.Sql

import java.sql.SQLException

class CompetenciaDAO {

    ConexaoDAO conexaoDAO = new ConexaoDAO()
    Sql sql = conexaoDAO.conectaBD()

    List<Competencia> listar(){
        List<Competencia> competencias = []

        sql.eachRow('SELECT * FROM competencias') { row ->
            competencias << new Competencia(row.nome, row.id)
        }

        return competencias
    }
    void inserir(Competencia competencia) {
        String inserir = 'INSERT INTO competencias (nome) VALUES (?)'
        try {
            sql.executeInsert(inserir, [competencia.nome])

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
    void excluir(int id){
        String excluir = 'DELETE FROM competencias WHERE id = ?'
        try {
            sql.execute(excluir, id)

        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }
    void inserirCompetenciaCandidato(int idCandidato, int idCompetencia){
        String inserir = 'INSERT INTO competencias_candidato (id_competencias, id_candidato) VALUES (?,?)'
        try {
            sql.executeInsert(inserir, [idCompetencia, idCandidato])

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
    void inserirCompetenciaVaga(int idVaga, int idCompetencia){
        String inserir = 'INSERT INTO competencias_vagas (id_competencias, id_vagas) VALUES (?,?)'
        try {
            sql.executeInsert(inserir, [idCompetencia, idVaga])

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
    void alterar(Competencia competencia){
        String alterar = 'UPDATE competencias SET nome=? WHERE id=?'
        int idCompetencia = competencia.id as Integer

        try{
            sql.executeUpdate(alterar, [
                    competencia.nome,
                    idCompetencia
            ])
        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }

}
