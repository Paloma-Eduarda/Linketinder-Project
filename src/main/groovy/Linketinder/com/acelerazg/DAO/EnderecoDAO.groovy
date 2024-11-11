package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.Interfaces.IConexaoBDFactory
import Linketinder.com.acelerazg.Model.Estado
import Linketinder.com.acelerazg.Model.Pais
import groovy.sql.Sql

class EnderecoDAO {


    private IConexaoBDFactory iConexaoBDFactory
    private  Sql sql

   EnderecoDAO(String dbType) {
        this.iConexaoBDFactory = ConexaoFactory.conect(dbType)
        this.sql = iConexaoBDFactory.conectar()
    }


    List<Pais> consultarPaises(){
        List<Pais> paises = []

        sql.eachRow('SELECT * FROM pais') { row ->
            paises << new Pais(row.id, row.codigo, row.nome)

        }
        return paises
    }
    List<Estado> consultarEstados(){
        List<Estado> estados = []

        sql.eachRow('SELECT * FROM estado') { row ->
            estados << new Pais(row.id, row.codigo, row.nome)

        }
        return estados
    }
}
