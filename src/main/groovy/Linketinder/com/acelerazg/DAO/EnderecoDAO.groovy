package Linketinder.com.acelerazg.DAO

import groovy.sql.Sql

import java.sql.SQLException

class EnderecoDAO {

    ConexaoDAO conexaoDAO = new ConexaoDAO()
    Sql sql = conexaoDAO.conectaBD()

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
    void consultarEstados(){
        try {
            def query = 'SELECT * FROM estado'

            sql.eachRow(query) { row ->
                println "ID: ${row.id}, Código: ${row.codigo}, Nome: ${row.nome}"
            }
        } catch (SQLException e) {
            println "Erro ao consultar estados: ${e.message}"
        }
    }
}
