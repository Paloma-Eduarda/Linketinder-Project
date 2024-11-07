package com.acelerazg.service


import Linketinder.com.acelerazg.DAO.EmpresaDAO
import Linketinder.com.acelerazg.classes.Candidato
import Linketinder.com.acelerazg.classes.Empresa
import Linketinder.com.acelerazg.service.CandidatoService
import Linketinder.com.acelerazg.service.EmpresaService
import spock.lang.Specification

import java.time.LocalDate

class EmpresaServiceTest extends Specification {
    Empresa empresa
    EmpresaDAO empresaDAO = Mock(EmpresaDAO.class)
    EmpresaService empresaService

    void setup() {
        empresaService = new EmpresaService(empresaDAO)
    }
    def "ListarEmpresas"() {
        given:
        List<Empresa> empresasEsperadas = [ empresa = Mock(Empresa.class)]
        empresaDAO.listar() >> empresasEsperadas

        when:
        List<Empresa> resultado = empresaService.listarEmpresas()

        then:
        resultado == empresasEsperadas
    }

//    def "CadastrarEmpresa"() {
//        given:
//        empresa = Mock(Empresa.class)
//        when:
//        empresaService.cadastrarEmpresa(empresa)
//
//        then:
//        1 * empresaDAO.inserir(empresa) >> 1
//
//    }
}
