package Linketinder.com.acelerazg.EndPoints

import Linketinder.com.acelerazg.Controller.EmpresaControl
import Linketinder.com.acelerazg.Model.Empresa
import groovy.json.JsonSlurper

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/empresa")
class EmpresaServlet extends HttpServlet{
    private EmpresaControl empresaControl


    @Override
    void init() throws ServletException {
        this.empresaControl = new EmpresaControl()
    }

    @Override
    void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.contentType = "application/json"

        try {
            List <Empresa> empresas= empresaControl.listarEmpresas()

            response.writer << empresas.toString()
            response.status = HttpServletResponse.SC_OK

        } catch (Exception ex) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
            response.writer.write("ID inválido: ${ex.message}")
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
            String cnpj = jsonMap.cnpj

            empresaControl.salvarEmpresa(cep, descricao, email, senha, nome, pais, cnpj)

            response.writer.write("Empresa Salva com Sucesso")
            response.status = HttpServletResponse.SC_CREATED

        }catch (Exception ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("ID inválido: ${ex.message}")
        }

    }
    @Override
    void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String json = request.reader.text
            Map jsonMap = new JsonSlurper().parseText(json)

            Integer id_empresa = jsonMap.id
            String cep = jsonMap.cep
            String descricao = jsonMap.descricao
            String email = jsonMap.email
            String senha = jsonMap.senha
            String nome = jsonMap.nome
            Integer pais = jsonMap.pais
            String cnpj = jsonMap.cnpj

            empresaControl.editarEmpresa(cep, descricao, email, senha, nome, pais, cnpj, id_empresa)

            response.writer.write("Empresa Atualizada com Sucesso")
            response.status = HttpServletResponse.SC_OK

        }catch (Exception ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("ID inválido: ${ex.message}")
        }

    }
    void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // http://localhost:8080/MeuWebApp/empresa?id=1
        try{
            int id = Integer.parseInt(request.getParameter("id"))
            empresaControl.excluirEmpresa(id)
            response.status = HttpServletResponse.SC_OK
            response.writer.write("Empresa excluida com sucesso!")

        } catch (NumberFormatException ex){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST)
            response.writer.write("ID inválido: ${ex.message}")
        }
    }

}
