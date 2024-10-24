package Linketinder.com.acelerazg.DAO

import groovy.sql.Sql

import java.sql.SQLException

class ConexaoDAO {

    Sql conectaBD(){
            try {
                String url = 'jdbc:postgresql://localhost:5432/linketinder'
                String user = 'postgres'
                String password = 'admin'
                String driver = 'org.postgresql.Driver'

                Sql sql = Sql.newInstance(url, user, password, driver)
                return sql
            } catch (SQLException exception) {
                return exception.printStackTrace()

            }
    }
}
