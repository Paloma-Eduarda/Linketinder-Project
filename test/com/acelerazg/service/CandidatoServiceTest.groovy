package com.acelerazg.service

import com.acelerazg.classes.Candidato;
import org.junit.Before;
import org.junit.BeforeClass
import org.junit.Test;

class CandidatoServiceTest {
    private static CandidatoService candidatoService;
    private Candidato c1;

    @BeforeClass
    static void setUpBeforeClass() throws Exception {
     candidatoService = new CandidatoService()
    }
    @Before
    void setUpB() throws Exception {
        c1 = new Candidato(nome:"Paloma Eduarda",
                email:"paloma@gmail.com",
                cpf: "000.000.000-00",
                idade: 22,
                estado:"RN",
                cep:"590-000",
                descricao:"Estudande de Análise e Desenvolvimento de Sistemas"
        )
    }
    @Test
   void testCadastrar() {
        candidatoService.cadastrar(c1)
        //contains()
        assert candidatoService.candidatos[0].nome == "Paloma Eduarda"
        assert candidatoService.candidatos[0].email == "paloma@gmail.com"
        assert candidatoService.candidatos[0].cpf == "000.000.000-00"
        assert candidatoService.candidatos[0].idade == 22
        assert candidatoService.candidatos[0].estado == "RN"
        assert candidatoService.candidatos[0].cep == "590-000"
        assert candidatoService.candidatos[0].descricao == "Estudande de Análise e Desenvolvimento de Sistemas"


    }

}