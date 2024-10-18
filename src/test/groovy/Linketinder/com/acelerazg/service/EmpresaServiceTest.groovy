package Linketinder.com.acelerazg.service

import org.junit.BeforeClass
import Linketinder.com.acelerazg.classes.Empresa
import org.junit.Before
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
                "01100-000",
                "Empresa de desenvolvimento de software, especializada em soluções personalizadas para o setor financeiro.",
                "contato@techsolutions.com.br",
                "1234643636",
                "Tech Solutions Ltda",
                1,
                "12.345.678/0001-99")
    }
    @Test
    void testCadastrar() {
        empresaService.cadastrar(empresa)

        assert empresaService.empresas[0].nome == "Tech Solutions Ltda"
        assert empresaService.empresas[0].email == "contato@techsolutions.com.br"
        assert empresaService.empresas[0].cnpj == "12.345.678/0001-99"
        assert empresaService.empresas[0].senha == "1234643636"
        assert empresaService.empresas[0].id_pais == 1
        assert empresaService.empresas[0].cep == "01100-000"
        assert empresaService.empresas[0].descricao == "Empresa de desenvolvimento de software, especializada em soluções personalizadas para o setor financeiro."


    }
}
