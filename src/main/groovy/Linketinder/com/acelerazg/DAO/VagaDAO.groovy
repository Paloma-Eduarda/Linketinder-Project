package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.classes.Vaga
import groovy.sql.Sql

import java.sql.SQLException

class VagaDAO {

    ConexaoDAO conexaoDAO = new ConexaoDAO()
    Sql sql = conexaoDAO.conectaBD()

    List<Vaga> listar(int id){
        List<Vaga> vagas = []

        sql.eachRow('SELECT * FROM vagas WHERE id_empresa = ?', [id]) { row ->
            vagas << new Vaga(row.cidade, row.descricao, row.id_empresa, row.id_estado, row.id, row.nome)
        }

        return vagas
    }

    int inserir(Vaga vaga) {
        String inserir = 'INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa) VALUES (?,?,?,?,?)'
        try {
            def generatedKeys = sql.executeInsert(inserir, [
                    vaga.nome,
                    vaga.descricao,
                    vaga.cidade,
                    vaga.id_estado,
                    vaga.id_empresa])

            vaga.id = generatedKeys[0][0]
            return vaga.id

        }catch(SQLException ex){
            ex.printStackTrace()
        }
    }
    void excluir(int id) {

        //Cascade
        String excluir = 'DELETE FROM vagas WHERE id = ?'
        String exluirComp = 'DELETE FROM competencias_vagas WHERE id_vagas = ?'

        try {
            sql.execute(exluirComp, id)
            sql.execute(excluir, id)

        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }
    void alterar(Vaga vaga){

        String alterar = 'UPDATE vagas SET nome=?, descricao=?, cidade=?, id_estado=? WHERE id=?'
        int idEstado = vaga.id_estado as Integer
        int idVaga = vaga.id as Integer

        try{
            sql.executeUpdate(alterar, [
                    vaga.nome,
                    vaga.descricao,
                    vaga.cidade,
                    idEstado,
                    idVaga,
            ])
        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }
}
