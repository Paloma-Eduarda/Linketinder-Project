package Linketinder.com.acelerazg.Interfaces

import Linketinder.com.acelerazg.classes.Vaga

interface IVagaService {

    List listarVagas(int id)

    void cadastrarVaga(Vaga vaga)

    void editarVaga(Vaga vaga)

    void excluirVaga(int id)

}