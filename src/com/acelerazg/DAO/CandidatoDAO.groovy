package com.acelerazg.DAO

import com.acelerazg.classes.Candidato
import groovy.sql.Sql

import java.sql.SQLException

class CandidatoDAO {
    def sql

    CandidatoDAO() {
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

    List<Candidato> listar(){
        List<Candidato> candidatos = []

        sql.eachRow('SELECT * FROM candidato') { row ->
            candidatos << new Candidato(row.cep, row.descricao, row.email,
                    row.senha, row.nome, row.id_pais, row.cpf, row.data_nascimento, row.sobrenome, row.id)
        }

        return candidatos
    }

    int inserir(Candidato candidato) {
        String inserir = 'INSERT INTO candidato (nome, sobrenome, data_nascimento, cpf, email,' +
                'cep, descricao, id_pais, senha) VALUES (?,?,?,?,?,?,?,?,?)'
        try {
            def generatedKeys = sql.executeInsert(inserir, [
                    candidato.nome,
                    candidato.sobrenome,
                    candidato.data_nascimento,
                    candidato.cpf,
                    candidato.email,
                    candidato.cep,
                    candidato.descricao,
                    candidato.id_pais,
                    candidato.senha
            ])

            candidato.id = generatedKeys[0][0]
            println("Candidato inserido com sucesso. ID gerado: ${candidato.id}")
            return  candidato.id

        } catch (SQLException ex) {
            ex.printStackTrace()
        }

    }

    void excluir(int id) {
        String excluir = 'DELETE FROM candidato WHERE id = ?'
        String exluirComp = 'DELETE FROM competencias_candidato WHERE id_candidato = ?'

        try {
            sql.execute(exluirComp, id)
            sql.execute(excluir, id)

        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }
    void alterar(Candidato candidato){
        String alterar = 'UPDATE candidato SET nome=?, sobrenome=?, data_nascimento=?, email=?, cpf=?, cep=?, descricao=?, id_pais =?, senha=? WHERE id=?'
        int idPais = candidato.id_pais as Integer
        int idCandidato = candidato.id as Integer

        try{
            sql.executeUpdate(alterar, [
                    candidato.nome,
                    candidato.sobrenome,
                    candidato.data_nascimento,
                    candidato.email,
                    candidato.cpf,
                    candidato.cep,
                    candidato.descricao,
                    idPais,
                    candidato.senha,
                    idCandidato
            ])
        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }

}