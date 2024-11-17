package Linketinder.com.acelerazg.Servlet

import Linketinder.com.acelerazg.Controller.CandidatoControl
import Linketinder.com.acelerazg.Model.Candidato
import groovy.json.JsonSlurper

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import java.time.LocalDate


@WebServlet("/candidato")
class CandidatoServlet extends HttpServlet {

    private CandidatoControl candidatoControl;

    @Override
    void init() throws ServletException {
        this.candidatoControl = new CandidatoControl();
    }

    @Override
    void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.contentType = "application/json"

        try {
            List<Candidato> candidatos = candidatoControl.listarCandidato()

            response.writer << candidatos.toString()
            response.status = HttpServletResponse.SC_OK

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
            response.getWriter().write("$e")
        }


    }

    @Override
    void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String json = request.reader.text

            Map jsonMap = new JsonSlurper().parseText(json)

            String cep = jsonMap.cep
            String descricao = jsonMap.descricao
            String email = jsonMap.email
            String senha = jsonMap.senha
            String nome = jsonMap.nome
            Integer pais = jsonMap.pais
            String cpf = jsonMap.cpf
            String sobrenome = jsonMap.sobrenome
            LocalDate data = LocalDate.parse(jsonMap.data)

            int id = candidatoControl.salvarCandidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome)

            response.getWriter().write("Candidato salvo com ID: ${id}")
            response.status = HttpServletResponse.SC_CREATED

        } catch (Exception e) {


        }
    }
}