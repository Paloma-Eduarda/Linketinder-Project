package com.acelerazg.DAO

import groovy.sql.Sql

import java.sql.SQLException

class PaisDAO {
    def sql

    PaisDAO() {
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

    void consultarPaises(){
        try {
            def query = 'SELECT * FROM pais'

            sql.eachRow(query) { row ->
                println "ID: ${row.id}, Código: ${row.codigo}, Nome: ${row.nome}"
            }
        } catch (SQLException e) {
            println "Erro ao consultar países: ${e.message}"
        }
    }
}
