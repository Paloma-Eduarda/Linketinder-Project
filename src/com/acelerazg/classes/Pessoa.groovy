package com.acelerazg.classes

class Pessoa {
    String nome
    String email
    String cep
    String descricao
    String senha
    int id_pais
    //List competencias = ["Python", "Java", "Spring Framework"]
    Pessoa(String cep, String descricao, String email, String senha, String nome, int id_pais) {
        this.cep = cep
        this.descricao = descricao
        this.email = email
        this.senha = senha
        this.nome = nome
        this.id_pais = id_pais
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", descricao='" + descricao + '\n';
    }
}
