package Linketinder.com.acelerazg.DAO

import Linketinder.com.acelerazg.Interfaces.IConexaoBDFactory

class ConexaoFactory{

    static IConexaoBDFactory conect(String dbType) {

        if (dbType.equalsIgnoreCase("postgresql")) {
            return ConexaoDAO.getInstance()
        } else {
            throw new IllegalArgumentException("Banco de dados não suportado");
        }
    }
}
