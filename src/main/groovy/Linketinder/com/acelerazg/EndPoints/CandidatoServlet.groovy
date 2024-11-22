package Linketinder.com.acelerazg.EndPoints

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

    private CandidatoControl candidatoControl

    @Override
    void init() throws ServletException {
        this.candidatoControl = new CandidatoControl()
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
            response.writer.write("${e.message}")
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

            response.writer.write("Candidato salvo com ID: ${id}")
            response.status = HttpServletResponse.SC_CREATED

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("Dados invalidos ${e.message}")
        }
    }
    @Override
    void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String json = request.reader.text

            Map jsonMap = new JsonSlurper().parseText(json)

            Integer id_candidato = jsonMap.id
            String cep = jsonMap.cep
            String descricao = jsonMap.descricao
            String email = jsonMap.email
            String senha = jsonMap.senha
            String nome = jsonMap.nome
            Integer pais = jsonMap.pais
            String cpf = jsonMap.cpf
            String sobrenome = jsonMap.sobrenome
            LocalDate data = LocalDate.parse(jsonMap.data)


            candidatoControl.editarCandidato(cep, descricao, email, senha, nome, pais, cpf, data, sobrenome, id_candidato)

            response.writer.write("Candidato Atualizado Com Sucesso!")
            response.status = HttpServletResponse.SC_OK

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("Dados invalidos ${e.message}")
        }
    }
    void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try{
           int id = Integer.parseInt(request.getParameter("id"))
           candidatoControl.excluirCandidato(id)
           response.status = HttpServletResponse.SC_OK
           response.writer.write("Candidato excluido com sucesso!")

       } catch (NumberFormatException ex){
           response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
           response.writer.write("ID inválido: ${ex.message}")
       }

    }
}