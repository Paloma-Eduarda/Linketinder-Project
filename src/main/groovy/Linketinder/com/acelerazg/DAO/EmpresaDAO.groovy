package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.classes.Empresa
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
    void excluir(int id) {
        String excluir = 'DELETE FROM empresa WHERE id = ?'
        try {
            sql.execute(excluir, id)

        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }
    void alterar(Empresa empresa){
        String alterar = 'UPDATE empresa SET nome=?, cnpj=?, email=?,  cep=?, descricao=?, id_pais =?, senha=? WHERE id=?'
        int idPais = empresa.id_pais as Integer
        int idEmpresa = empresa.id as Integer

        try{
            sql.executeUpdate(alterar, [
                    empresa.nome,
                    empresa.cnpj,
                    empresa.email,
                    empresa.cep,
                    empresa.descricao,
                    idPais,
                    empresa.senha,
                    idEmpresa
            ])
        }catch (SQLException ex){
            ex.printStackTrace()
        }
    }

}
