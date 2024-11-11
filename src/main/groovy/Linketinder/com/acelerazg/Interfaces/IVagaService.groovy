package Linketinder.com.acelerazg.Interfaces

import Linketinder.com.acelerazg.Model.Vaga

interface IVagaService {

    List listarVagas(int id)

    int cadastrarVaga(Vaga vaga)

    void editarVaga(Vaga vaga)

    void excluirVaga(int id)

}