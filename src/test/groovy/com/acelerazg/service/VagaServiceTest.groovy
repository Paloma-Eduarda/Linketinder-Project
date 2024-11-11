package com.acelerazg.service

import Linketinder.com.acelerazg.DAO.VagaDAO
import Linketinder.com.acelerazg.Model.Empresa
import Linketinder.com.acelerazg.Model.Vaga
import Linketinder.com.acelerazg.Service.VagaService
import spock.lang.Specification

class VagaServiceTest extends Specification {
    Vaga vaga
    VagaDAO vagaDAO = Mock(VagaDAO.class)
    VagaService vagaService

    void setup() {
        vagaService = new VagaService(vagaDAO)
    }

    def "ListarVagas"() {
        given:
        vaga = Mock(Vaga.class)
        List<Vaga> vagasEsperadas = [vaga]
        vagaDAO.listar(1)>> vagasEsperadas

        when:
        List<Empresa> resultado = vagaService.listarVagas(1)

        then:
        resultado == vagasEsperadas
    }

    def "CadastrarVaga"() {
        given:
        vaga = Mock(Vaga.class)
        when:
        vagaService.cadastrarVaga(vaga)

        then:
        1 * vagaDAO.inserir(vaga) >> 1
    }

    def "EditarVaga"() {
    }

    def "ExcluirVaga"() {
    }
}
