package com.acelerazg.DAO
import com.acelerazg.classes.Vaga
import groovy.sql.Sql

import java.sql.SQLException

class VagaDAO {
    def sql

    VagaDAO() {
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

    List<Vaga> listar(int id){
        List<Vaga> vagas = []

        sql.eachRow('SELECT * FROM vagas') { row ->
            vagas << new Vaga(row.cidade, row.descricao, row.id_empresa, row.id_estado, row.id, row.nome)
        }

        return vagas
    }
    void inserir(Vaga vaga) {
        String inserir = 'INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa) VALUES (?,?,?,?,?)'
        try {
            sql.executeInsert(inserir, [vaga.nome, vaga.descricao, vaga.cidade, vaga.id_estado, vaga.id_empresa])
            println("Vaga inserida com sucesso")

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
    void excluir(int id) {
        String excluir = 'DELETE FROM vagas WHERE id = ?'
        try {
            sql.execute(excluir, id)

        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }
}
