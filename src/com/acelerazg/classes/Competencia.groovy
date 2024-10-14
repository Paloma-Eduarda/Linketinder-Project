package com.acelerazg.classes

class Competencia {
    int id
    String nome

    Competencia(String nome, int id) {
        this.nome = nome
        this.id = id
    }
    Competencia(String nome) {
        this.nome = nome
    }


    @Override
    public String toString() {
        return "\nCompetencia:" +
                "id=" + id +
                ", nome='" + nome + '\'';
    }
}
