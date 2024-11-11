package Linketinder.com.acelerazg.Model

import java.time.LocalDate

class Candidato extends Pessoa{
    int id
    String sobrenome
    String cpf
    LocalDate data_nascimento

    Candidato(String cep, String descricao, String email, String senha, String nome, int id_pais, String cpf, LocalDate data_nascimento, String sobrenome, int id) {
        super(cep, descricao, email, senha, nome, id_pais)
        this.cpf = cpf
        this.data_nascimento = data_nascimento
        this.sobrenome = sobrenome
        this.id = id
    }

    Candidato(String cep, String descricao, String email, String senha, String nome, int id_pais, String cpf, LocalDate data_nascimento, String sobrenome) {
        super(cep, descricao, email, senha, nome, id_pais)
        this.cpf = cpf
        this.data_nascimento = data_nascimento
        this.sobrenome = sobrenome
    }


    @Override
    public String toString() {
        return "\nCandidato:" +
                "id =" + id +
                ", nome = " + nome +
                ", sobrenome =" + sobrenome +
                ", email = " + email +
                ", descrição = " + descricao + '\'' ;
    }
}
