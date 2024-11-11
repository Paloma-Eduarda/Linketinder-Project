package Linketinder.com.acelerazg.Controller

import Linketinder.com.acelerazg.DAO.CandidatoDAO
import Linketinder.com.acelerazg.Model.Candidato
import Linketinder.com.acelerazg.Service.CandidatoService

import java.time.LocalDate

class CandidatoControl {
    private Candidato candidato
    private CandidatoService candidatoService

    CandidatoControl() {
        this.candidato = candidato
        this.candidatoService = new CandidatoService(new CandidatoDAO("postgresql"))
    }

    List listarCandidato()
    {
        return candidatoService.listarCandidato()
    }
     int salvarCandidato(String cep, String descricao, String email, String senha, String nome, int pais, String cpf, LocalDate data, String sobrenome){

        candidato = new Candidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome)
        int idCandidato = candidatoService.cadastrarCandidato(candidato)

        return idCandidato
    }

    void editarCandidato(String cep, String descricao, String email, String senha, String nome, int pais, String cpf, LocalDate data, String sobrenome, int id){

        candidato = new Candidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome, id)
        candidatoService.editarCandidato(candidato)

    }
    void excluirCandidato(int id){
        candidatoService.excluirCandidato(id)
    }

}
