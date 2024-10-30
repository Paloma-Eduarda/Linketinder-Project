"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.comp = void 0;
const candidato_js_1 = require("../classes/candidato.js");
const candidatoList = document.getElementById('candidato-list');
function renderCandidatos() {
    console.log('Renderizando candidatos...');
    const candidatos = JSON.parse(localStorage.getItem('candidatos') || '[]');
    if (candidatoList) {
        if (Array.isArray(candidatos) && candidatos.length > 0) {
            listaCandidatos(candidatos);
        }
        else {
            console.log('Nenhum candidato disponível para renderizar.');
        }
    }
    else {
        console.error("Elemento com ID 'candidato-list' não encontrado.");
    }
}
function listaCandidatos(candidate) {
    candidate.forEach((candidatoData) => {
        const candidato = new candidato_js_1.Candidato(candidatoData._nome, candidatoData._email, candidatoData._estado, candidatoData._cep, candidatoData._descricao, candidatoData._idade, candidatoData._cpf, candidatoData._formacao, candidatoData._idiomas, candidatoData._competencias);
        const arrays = candidato.competencias.split(',');
        exports.comp = arrays.flat();
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
document.addEventListener("DOMContentLoaded", () => {
    renderCandidatos();
});
