package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.classes.Candidato
import groovy.sql.Sql

import java.sql.SQLException

class CandidatoDAO {

    ConexaoDAO conexaoDAO = new ConexaoDAO()
    Sql sql = conexaoDAO.conectaBD()

    List<Candidato> listar(){
        List<Candidato> candidatos = []

        sql.eachRow('SELECT * FROM candidato') { row ->
            candidatos << new Candidato(row.cep, row.descricao, row.email,
                    row.senha, row.nome, row.id_pais, row.cpf, row.data_nascimento.toLocalDate(), row.sobrenome, row.id)

        }

        return candidatos
    }

    int inserir(Candidato candidato) {
        String inserir = 'INSERT INTO candidato (nome, sobrenome, data_nascimento, cpf, email,' +
                'cep, descricao, id_pais, senha) VALUES (?,?,?,?,?,?,?,?,?)'
        try {
            List generatedKeys = sql.executeInsert(inserir, [
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
            return  candidato.id

        } catch (SQLException ex) {
            ex.printStackTrace()
        }

    }

    void excluir(int id) {
        //usar cascate
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