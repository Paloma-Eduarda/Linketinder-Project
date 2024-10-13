package com.acelerazg.classes

class Vaga {
    int id
    String nome
    String descricao
    String cidade
    int id_empresa
    int id_estado

    Vaga(String cidade, String descricao, int id_empresa, int id_estado, int id, String nome) {
        this.cidade = cidade
        this.descricao = descricao
        this.id_empresa = id_empresa
        this.id_estado = id_estado
        this.id = id
        this.nome = nome
    }

    Vaga(String cidade, String descricao, int id_empresa, int id_estado, String nome) {
        this.cidade = cidade
        this.descricao = descricao
        this.id_empresa = id_empresa
        this.id_estado = id_estado
        this.nome = nome
    }

    @Override
    public String toString() {
        return "\nVaga:" +
                "cidade = " + cidade + '\'' +
                ", id = " + id +
                ", nome = " + nome + '\'' +
                ", descricao = " + descricao + '\'' +
                ", id_empresa = " + id_empresa +
                ", id_estado = " + id_estado;
    }
}
