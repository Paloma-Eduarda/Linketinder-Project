package com.acelerazg.classes

class Pessoa {
    String nome
    String email
    String estado
    String cep
    String descricao
    List competencias = ["Python", "Java", "Spring Framework"]





    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", descricao='" + descricao + '\n';
    }
}
