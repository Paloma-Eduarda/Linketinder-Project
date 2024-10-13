package com.acelerazg.classes

class Empresa extends Pessoa {
    int id
    String cnpj

    Empresa(String cep, String descricao, String email, String senha, String nome, int id_pais, String cnpj, int id) {
        super(cep, descricao, email, senha, nome, id_pais)
        this.cnpj = cnpj
        this.id = id
    }

    Empresa(String cep, String descricao, String email, String senha, String nome, int id_pais, String cnpj) {
        super(cep, descricao, email, senha, nome, id_pais)
        this.cnpj = cnpj
    }


    @Override
    public String toString() {
        return "\nEmpresa: " + "id = " + id +
                ", nome = " + nome +
                ", cnpj = " + cnpj +
                ", email = " + email;

    }
}
