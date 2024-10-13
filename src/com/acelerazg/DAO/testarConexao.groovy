package com.acelerazg.DAO

import com.acelerazg.classes.Candidato
import com.acelerazg.classes.Empresa
import com.acelerazg.classes.Vaga

CompetenciaDAO competenciaDAO =  new CompetenciaDAO()
//Competencia competencia = new Competencia('Word')
//competenciaDAO.inserir(competencia)
//println competenciaDAO.listar()
//VagaDAO vagaDAO =  new VagaDAO()
//println vagaDAO.listar()
//

//
//CandidatoDAO candidatoDAO = new CandidatoDAO()
//def dataNascimento = Date.parse("yyyy-MM-dd", "2001-12-10")
//def sqlDate = new java.sql.Date(dataNascimento.getTime())
//Candidato candidato1 = new Candidato(
//        '63456345',
//        'Analista de Sistemas',
//        'paloma@gamil.com',
//        '123456',
//        'Paloma',
//        1,
//        '111.111.111-11',
//        sqlDate,
//        'Tavares'
//)
//candidatoDAO.inserir(candidato1)
//println candidatoDAO.listar()
EmpresaDAO empresaDAO = new EmpresaDAO()
//Empresa empresa1 = new Empresa(
//        '285623',
//        'Empresa de Papel Michael',
//        'papel@gmail.com',
//        'asdadgsga',
//        'Dumder Muflen',
//        2,
//        '39457252'
//)
//empresaDAO.inserir(empresa1)
//println empresaDAO.listar()
VagaDAO vagaDAO = new VagaDAO()
//Vaga vaga = new Vaga(
//        'natal',
//        'Recursos Humanos',
//        1,
//        2,
//        'Rh'
//)

println vagaDAO.listar()
