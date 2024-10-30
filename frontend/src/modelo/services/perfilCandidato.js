"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const vaga_1 = require("../classes/vaga");
// Melhorar, separar funções
function renderVagas() {
    console.log('Renderizando Vagas...');
    const vagas = JSON.parse(localStorage.getItem('vagas') || '[]');
    const listaDeVagas = document.getElementById('lista-vagas');
    if (listaDeVagas) {
        if (Array.isArray(vagas) && vagas.length > 0) {
            listaDeVagas.appendChild(criar_card_vaga(vagas));
        }
        else {
            console.log('Nenhuma vaga disponível para renderizar.');
        }
    }
}
function criar_card_vaga(vagas) {
    const vagasContainer = document.createElement('div');
    vagas.forEach((vagaData) => {
        const vaga = new vaga_1.Vaga(vagaData._empresa, vagaData._titulo, vagaData._formato, vagaData._local, vagaData._descricao, vagaData._competencias, vagaData._qualificacoes);
        const vagaDiv = document.createElement('div');
        vagaDiv.classList.add('vaga');
        vagaDiv.innerHTML = `
            <div class="card border-light mb-3" style="max-width: 50rem; text-align: center; padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
                <h4 class="card-header" style="background-color: #863b67; color: white">${vaga.titulo}</h4>
                <p><strong>Formato: </strong>${vaga.formato}</p>
                <p><strong>Local: </strong>${vaga.local}</p>
                <p><strong>Descrição:</strong> ${vaga.descricao}</p>
                <p><strong>Competências:</strong> ${vaga.competencias}</p>
                <p><strong>Qualificações: </strong>${vaga.qualificacoes}</p>
                <span>
                    <a href="#" class="card-link"><i class="bi bi-x-circle" style="color: darkred;"></i></a>
                    <a href="#" class="card-link"><i class="bi bi-check-circle" style="color: green"></i></a>
                </span>
            </div>
        `;
        vagasContainer.appendChild(vagaDiv);
    });
    return vagasContainer;
}
document.addEventListener("DOMContentLoaded", () => {
    renderVagas();
});
