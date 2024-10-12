package com.acelerazg.DAO

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
            println "Conexão bem-sucedida com o banco de dados!"

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
        sql.executeInsert(inserir, [competencia.nome])

        println("Competencia inserida com sucesso")
    }
    void alterar(Competencia competencia){
        String alterar = 'UPDATE competencias SET nome=? WHERE id=?'
        //try {
            sql.excuteUp(alterar, [competencia.nome])
      //  }
    }
    void remover(int id){

    }
}
