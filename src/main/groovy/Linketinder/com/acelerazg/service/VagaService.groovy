package Linketinder.com.acelerazg.service
import Linketinder.com.acelerazg.DAO.VagaDAO
import Linketinder.com.acelerazg.Interfaces.IVagaService
import Linketinder.com.acelerazg.classes.Vaga

class VagaService implements IVagaService{
    private IVagaService iVagaService

    VagaService(IVagaService iVagaService) {
        this.iVagaService = iVagaService
    }

    List listarVagas(int id) {
       return iVagaService.listarVagas(id)
    }
    void cadastrarVaga(Vaga vaga) {
        iVagaService.cadastrarVaga(vaga)
    }
    void editarVaga(Vaga vaga){
        iVagaService.editarVaga(vaga)
    }
    void excluirVaga(int id){
       iVagaService.excluirVaga(id)
    }
}
