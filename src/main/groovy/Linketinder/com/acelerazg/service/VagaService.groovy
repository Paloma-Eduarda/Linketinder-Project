package Linketinder.com.acelerazg.service
import Linketinder.com.acelerazg.DAO.VagaDAO
import Linketinder.com.acelerazg.Interfaces.IVagaService
import Linketinder.com.acelerazg.classes.Vaga

class VagaService implements IVagaService{
    VagaDAO vagaDAO = new VagaDAO()

    List listarVagas(int id) {
       return vagaDAO.listar()
    }
    void cadastrarVaga(Vaga vaga) {
       vagaDAO.inserir(vagaDAO)
    }
    void editarVaga(Vaga vaga){
        vagaDAO.alterar(vaga)
    }
    void excluirVaga(int id){
       vagaDAO.excluir(id)
    }
}
