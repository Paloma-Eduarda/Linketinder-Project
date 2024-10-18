package Linketinder.com.acelerazg.service

import Linketinder.com.acelerazg.classes.Candidato
import org.junit.Before;
import org.junit.BeforeClass
import org.junit.Test

import java.text.SimpleDateFormat;

class CandidatoServiceTest {
    private static CandidatoService candidatoService;
    private Candidato c1;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")
    Date dataNascimento = sdf.parse("2001-12-10")

    @BeforeClass
    static void setUpBeforeClass() throws Exception {
     candidatoService = new CandidatoService()
    }
    @Before
    void setUpB() throws Exception {


        c1 = new Candidato(
                "590-000",
                "Estudande de Análise e Desenvolvimento de Sistemas",
                "paloma@gmail.com",
                "1241515616",
                "Paloma Eduarda",
                1,
                "000.000.000-00",
                dataNascimento,
                "Eduarda"
        )
            }
    @Test
   void testCadastrar() {
        candidatoService.cadastrar(c1)
        //contains()
        assert candidatoService.candidatos[0].nome == "Paloma Eduarda"
        assert candidatoService.candidatos[0].email == "paloma@gmail.com"
        assert candidatoService.candidatos[0].cpf == "000.000.000-00"
        assert candidatoService.candidatos[0].id_pais == 1
        assert candidatoService.candidatos[0].senha == "1241515616"
        assert candidatoService.candidatos[0].cep == "590-000"
        //assert candidatoService.candidatos[0].data_nascimento == Date.parse("yyyy-MM-dd", "2001-12-10")
        assert candidatoService.candidatos[0].descricao == "Estudande de Análise e Desenvolvimento de Sistemas"


    }

}