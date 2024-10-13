package com.acelerazg.DAO

import com.acelerazg.classes.Competencia
import com.acelerazg.classes.Empresa
import com.acelerazg.classes.Vaga
import groovy.sql.Sql

import java.sql.SQLException

class EmpresaDAO {
    def sql
    EmpresaDAO() {
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

    List<Empresa> listar(){
        List<Empresa> empresas = []

        sql.eachRow('SELECT * FROM empresa') { row ->
            empresas << new Empresa(row.cep, row.descricao, row.email,
                    row.senha, row.nome, row.id_pais, row.cnpj, row.id)
        }

        return empresas
    }
    void inserir(Empresa empresa) {
        String inserir = 'INSERT INTO empresa (nome, cnpj, descricao, cep, senha, id_pais, email) VALUES (?,?,?,?,?,?,?)'
        try {
            sql.executeInsert(inserir, [empresa.nome, empresa.cnpj, empresa.descricao, empresa.cep, empresa.senha,
            empresa.id_pais, empresa.email])
            println("Empresa inserida com sucesso")

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
}
