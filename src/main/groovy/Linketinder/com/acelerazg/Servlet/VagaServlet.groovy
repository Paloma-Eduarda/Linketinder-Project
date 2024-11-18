package Linketinder.com.acelerazg.Servlet

import Linketinder.com.acelerazg.Controller.CandidatoControl
import Linketinder.com.acelerazg.Controller.VagaControl

import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
@WebServlet("/vaga")
class VagaServlet extends HttpServlet{

    private VagaControl vagaControl

    @Override
    void init() throws ServletException {
        this.vagaControl = new VagaControl()
    }


}
