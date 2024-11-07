package com.acelerazg.service

import Linketinder.com.acelerazg.DAO.CandidatoDAO
import Linketinder.com.acelerazg.classes.Candidato
import Linketinder.com.acelerazg.service.CandidatoService
import spock.lang.Specification

import java.time.LocalDate

class CandidatoServiceTest extends Specification {
    Candidato candidato
    CandidatoDAO candidatoDAO = Mock(CandidatoDAO.class)
    CandidatoService candidatoService

    void setup() {
        candidatoService = new CandidatoService(candidatoDAO)
    }

    def "ListarCandidato"() {
        given:
        List<Candidato> candidatosEsperados = [ candidato = Mock(Candidato.class)]
        candidatoDAO.listar() >> candidatosEsperados

        when:
        List<Candidato> resultado = candidatoService.listarCandidato()

        then:
        resultado == candidatosEsperados

    }

    def "CadastrarCandidato"() {
        given:
        LocalDate data = LocalDate.of(2024, 11, 5)
        candidato = new Candidato(
                "590-000",
                "Estudande de Análise e Desenvolvimento de Sistemas",
                "paloma@gmail.com",
                "1241515616",
                "Paloma Eduarda",
                1,
                "000.000.000-00",
                data,
                "Eduarda"
        )

        when:
        candidatoService.cadastrarCandidato(candidato)

        then:
        1 * candidatoDAO.inserir(candidato) >> 1
    }
}
