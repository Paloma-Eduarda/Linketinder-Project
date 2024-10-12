package com.acelerazg.classes

class Candidato extends Pessoa{
    String sobrenome
    String cpf
    Date data

    Candidato(String cep, String descricao, String email, String senha, String nome, int id_pais, String cpf, Date data, String sobrenome) {
        super(cep, descricao, email, senha, nome, id_pais)
        this.cpf = cpf
        this.data = data
        this.sobrenome = sobrenome
    }
}
