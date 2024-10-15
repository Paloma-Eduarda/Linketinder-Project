package com.acelerazg.DAO

import com.acelerazg.classes.Candidato
import com.acelerazg.classes.Competencia
import groovy.sql.Sql

import java.sql.SQLException

class CompetenciaDAO {

    def sql
    CompetenciaDAO() {
        try {
            def url = 'jdbc:postgresql://localhost:5432/linketinder'
            def user = 'postgres'
            def password = 'admin'
            def driver = 'org.postgresql.Driver'

            this.sql = Sql.newInstance(url, user, password, driver)

        } catch (SQLException exception) {
            exception.printStackTrace()
        }
    }

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
            println("Competencia inserida com sucesso")

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
            println("Competencia inserida com sucesso")

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
    void inserirCompetenciaVaga(int idVaga, int idCompetencia){
        String inserir = 'INSERT INTO competencias_vagas (id_competencias, id_vagas) VALUES (?,?)'
        try {
            sql.executeInsert(inserir, [idCompetencia, idVaga])
            println("Competencia inserida com sucesso")

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
