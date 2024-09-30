"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const vaga_1 = require("../classes/vaga");
document.addEventListener("DOMContentLoaded", () => {
    const btnCadVaga = document.getElementById('cad_vaga');
    btnCadVaga.addEventListener("click", function () {
        console.log('evento click chamdo');
        const titulo = document.getElementById('titulo_vaga').value;
        const formato = document.getElementById('formato_vaga').value;
        const local = document.getElementById('local_vaga').value;
        const descricaoVaga = document.getElementById('descricao_vaga').value;
        const competenciasVaga = document.getElementById('competencia_vaga').value;
        const qualificacoesVaga = document.getElementById('qualificacoes_vaga').value;
        const novaVaga = new vaga_1.Vaga("anomina", titulo, formato, local, descricaoVaga, competenciasVaga, qualificacoesVaga);
        salvarVaga(novaVaga);
    });
});
function salvarVaga(novaVaga) {
    const vagas = JSON.parse(localStorage.getItem('vagas') || '[]');
    vagas.push(novaVaga);
    localStorage.setItem('vagas', JSON.stringify(vagas));
    console.log('Vaga salva no localStorage');
}
