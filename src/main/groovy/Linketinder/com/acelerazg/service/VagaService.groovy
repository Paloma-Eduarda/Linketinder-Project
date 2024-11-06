package Linketinder.com.acelerazg.service
import Linketinder.com.acelerazg.DAO.VagaDAO
import Linketinder.com.acelerazg.Interfaces.IVagaService
import Linketinder.com.acelerazg.classes.Vaga

class VagaService implements IVagaService{
    private VagaDAO vagaDAO

    VagaService(VagaDAO vagaDAO) {
        this.vagaDAO = vagaDAO
    }

    List listarVagas(int id) {
       return vagaDAO.listar(id)
    }
    int cadastrarVaga(Vaga vaga) {
       vagaDAO.inserir(vaga)
    }
    void editarVaga(Vaga vaga){
        vagaDAO.alterar(vaga)
    }
    void excluirVaga(int id){
       vagaDAO.excluir(id)
    }
}
