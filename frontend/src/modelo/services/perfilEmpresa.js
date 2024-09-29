"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const candidato_js_1 = require("../classes/candidato.js");
const vaga_1 = require("../classes/vaga");
function renderCandidatos() {
    console.log('Renderizando candidatos...');
    const candidatos = JSON.parse(localStorage.getItem('candidatos') || '[]');
    const candidatoList = document.getElementById('candidato-list');
    if (candidatoList) {
        if (Array.isArray(candidatos) && candidatos.length > 0) {
            candidatos.forEach((candidatoData) => {
                const candidato = new candidato_js_1.Candidato(candidatoData._nome, candidatoData._email, candidatoData._estado, candidatoData._cep, candidatoData._descricao, candidatoData._competencias, candidatoData._idade, candidatoData._cpf, candidatoData._formacao, candidatoData._idiomas);
                const candidatoDiv = document.createElement('div');
                candidatoDiv.classList.add('candidato');
                candidatoDiv.innerHTML = `
                    <br>
                    <div class="card card border-light mb-3" 
                        style="max-width: 50rem; text-align: center;
                        padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
                        <div>
                            <h4 class="card-header" style="background-color: #863b67; color: white">
                                Candidato Anônimo
                            </h4>
                            <p><strong>Formação: </strong>${candidato.formacao}</p>
                            <p><strong>Idiomas: </strong>${candidato.idiomas}</p>
                            <p><strong>Descrição: </strong>${candidato.descricao}</p>
                            <p><strong>Competências: </strong>${candidato.competencias}</p>
                            <span>
                                <a href="#" class="card-link">
                                    <i class="bi bi-x-circle" style="color: darkred;"></i>
                                </a>
                                <a href="#" class="card-link">
                                    <i class="bi bi-check-circle" style="color: green"></i>
                                </a>
                            </span>
                        </div>
                    </div>
                    <br>`;
                candidatoList.appendChild(candidatoDiv);
            });
        }
        else {
            console.log('Nenhum candidato disponível para renderizar.');
        }
    }
    else {
        console.error("Elemento com ID 'candidato-list' não encontrado.");
    }
}
document.addEventListener("DOMContentLoaded", () => {
    renderCandidatos();
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
