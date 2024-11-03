package Linketinder.com.acelerazg.DAO
import Linketinder.com.acelerazg.classes.Estado
import Linketinder.com.acelerazg.classes.Pais
import groovy.sql.Sql

class EnderecoDAO {

    ConexaoDAO conexaoDAO = new ConexaoDAO()
    Sql sql = conexaoDAO.conectaBD()

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
