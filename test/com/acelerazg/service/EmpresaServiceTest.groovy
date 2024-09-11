package com.acelerazg.service

import com.acelerazg.classes.Candidato
import com.acelerazg.classes.Empresa
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class EmpresaServiceTest {
    private static EmpresaService empresaService;
    private Empresa empresa;

    @BeforeClass
    static void setUpBeforeClass() throws Exception {
        empresaService = new EmpresaService()
    }

    @Before
    void setUpB() throws Exception {

        empresa = new Empresa(
                nome:"Tech Solutions Ltda",
                email:"contato@techsolutions.com.br",
                cnpj:"12.345.678/0001-99",
                estado: "São Paulo",
                pais:"Brasil",
                cep:"01100-000",
                descricao: "Empresa de desenvolvimento de software, especializada em soluções personalizadas para o setor financeiro."
        )

    }
    @Test
    void testCadastrar() {
        empresaService.cadastrar(empresa)

        assert empresaService.empresas[0].nome == "Tech Solutions Ltda"
        assert empresaService.empresas[0].email == "contato@techsolutions.com.br"
        assert empresaService.empresas[0].cnpj == "12.345.678/0001-99"
        assert empresaService.empresas[0].estado == "São Paulo"
        assert empresaService.empresas[0].pais == "Brasil"
        assert empresaService.empresas[0].cep == "01100-000"
        assert empresaService.empresas[0].descricao == "Empresa de desenvolvimento de software, especializada em soluções personalizadas para o setor financeiro."


    }
}
