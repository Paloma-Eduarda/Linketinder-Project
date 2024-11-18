package Linketinder.com.acelerazg.EndPoints

import Linketinder.com.acelerazg.Controller.VagaControl
import Linketinder.com.acelerazg.Model.Vaga
import groovy.json.JsonSlurper

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/vaga")
class VagaServlet extends HttpServlet{

    private VagaControl vagaControl

    @Override
    void init() throws ServletException {
        this.vagaControl = new VagaControl()
    }
    @Override
    void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.contentType = "application/json"

        try {
            int id = Integer.parseInt(request.getParameter("id"))
            List <Vaga> vagas= vagaControl.listarVagas(id)

            response.writer << vagas.toString()
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

            String cidade = jsonMap.cidade
            String descricao = jsonMap.descricao
            Integer id = jsonMap.id
            Integer estado = jsonMap.estado
            String nome = jsonMap.nome

            vagaControl.salvarVaga(cidade, descricao,id, estado, nome)

            response.writer.write("Vaga Salva com Sucesso")
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

            Integer idVaga = jsonMap.idVaga
            String cidade = jsonMap.cidade
            String descricao = jsonMap.descricao
            Integer id = jsonMap.id
            Integer estado = jsonMap.estado
            String nome = jsonMap.nome

            vagaControl.editarVaga(cidade, descricao,id, estado, idVaga, nome)

            response.writer.write("Vaga atualizada com Sucesso")
            response.status = HttpServletResponse.SC_OK


        }catch (Exception ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("Dados invalidos ${ex.message}")
        }

    }
    void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int id = Integer.parseInt(request.getParameter("id"))
            vagaControl.excluirVaga(id)
            response.status = HttpServletResponse.SC_OK
            response.writer.write("Vaga excluida com sucesso!")

        } catch (NumberFormatException ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("ID inválido: ${ex.message}")
        }
    }
}
