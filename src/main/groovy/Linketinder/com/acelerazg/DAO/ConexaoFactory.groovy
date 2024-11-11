package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.Interfaces.IConexaoBDFactory

class ConexaoFactory{
    //Transferir logica da conexãoDao

    static IConexaoBDFactory conect(String dbType) {

        if (dbType.equalsIgnoreCase("postgresql")) {
            return ConexaoPostgres.getInstance()
        } else {
            throw new IllegalArgumentException("Banco de dados não suportado");
        }
    }
}
