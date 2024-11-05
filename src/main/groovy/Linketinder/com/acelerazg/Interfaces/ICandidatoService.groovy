package Linketinder.com.acelerazg.Interfaces

import Linketinder.com.acelerazg.classes.Candidato

interface ICandidatoService {

    List listarCandidato()

    int cadastrarCandidato(Candidato candidato)

    void editarCandidato(Candidato candidato)

    void excluirCandidato(int id)

}