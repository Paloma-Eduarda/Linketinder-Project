package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.Interfaces.IConexaoBDFactory
import groovy.sql.Sql
import java.sql.SQLException

class ConexaoDAO implements IConexaoBDFactory{

    @Override
    Sql conectar() {
        try {
            String url = 'jdbc:postgresql://localhost:5432/linketinder'
            String user = 'postgres'
            String password = 'admin'
            String driver = 'org.postgresql.Driver'

            return Sql.newInstance(url, user, password, driver)

            } catch (SQLException exception) {

                return exception.printStackTrace()

            }
    }
}
