package Linketinder.com.acelerazg.Controller

import Linketinder.com.acelerazg.DAO.VagaDAO
import Linketinder.com.acelerazg.Model.Vaga
import Linketinder.com.acelerazg.Service.VagaService

class VagaControl {

    private Vaga vaga
    private VagaService vagaService

    VagaControl() {
        this.vaga = vaga
        this.vagaService = new VagaService(new VagaDAO("postgresql"))
    }

    List listarVagas(int id) {
        return vagaService.listarVagas(id)
    }

    int salvarVaga(String cidade, String descricao, int id, int estado, String nome){

        vaga = new Vaga(cidade, descricao, id, estado, nome)
        int idVaga = vagaService.cadastrarVaga(vaga)

        return idVaga
    }

    void editarVaga(String cidade, String descricao, int id_empresa, int estado, int idVaga, String nome){

        vaga = new Vaga(cidade, descricao, id_empresa, estado, idVaga, nome)
        vagaService.editarVaga(vaga)

    }

    void excluirVaga(int id){
        vagaService.excluirVaga(id)
    }
}
