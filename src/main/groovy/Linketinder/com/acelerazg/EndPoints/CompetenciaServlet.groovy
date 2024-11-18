package Linketinder.com.acelerazg.EndPoints

import Linketinder.com.acelerazg.Controller.CompetenciaControl
import Linketinder.com.acelerazg.Model.Competencia
import groovy.json.JsonSlurper

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/competencia")
class CompetenciaServlet extends HttpServlet{

    private CompetenciaControl competenciaControl

    void init() throws ServletException {
        this.competenciaControl = new CompetenciaControl()
    }
    @Override
    void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.contentType = "application/json"

        try {
            List <Competencia> competencias = competenciaControl.listarCompetencias()

            response.writer << competencias.toString()
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

            String nome = jsonMap.nome

            competenciaControl.cadastrarCompetencia(nome)

            response.writer.write("Competencia Salva com Sucesso")
            response.status = HttpServletResponse.SC_CREATED

        }catch (Exception ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("Dados invalidos ${ex.message}")
        }

    }
    @Override
    void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String json = request.reader.text
            Map jsonMap = new JsonSlurper().parseText(json)

            Integer id = jsonMap.id
            String nome = jsonMap.nome

            competenciaControl.editarCompetencia(nome,id)

            response.writer.write("Competencia Atualizada com Sucesso")
            response.status = HttpServletResponse.SC_OK

        }catch (Exception ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("Dados invalidos ${ex.message}")
        }

    }
    void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"))
        try{
            competenciaControl.excluirCompetencia(id)
            response.status = HttpServletResponse.SC_OK
            response.writer.write("Competencia excluida com sucesso!")

        } catch (NumberFormatException ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("ID inválido: ${ex.message}")
        }
    }
}
