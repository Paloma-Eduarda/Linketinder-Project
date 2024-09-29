"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const candidato_js_1 = require("../classes/candidato.js");
function renderCandidatos() {
    console.log('Renderizando candidatos...');
    const can = JSON.parse(localStorage.getItem('can') || '[]');
    const candidatoList = document.getElementById('candidato-list');
    if (candidatoList) {
        if (Array.isArray(can) && can.length > 0) {
            can.forEach((candidatoData) => {
                const candidato = new candidato_js_1.Candidato(candidatoData._nome, candidatoData._email, candidatoData._estado, candidatoData._cep, candidatoData._descricao, candidatoData._competencias, candidatoData._idade, candidatoData._cpf);
                const candidatoDiv = document.createElement('div');
                candidatoDiv.classList.add('candidato');
                candidatoDiv.innerHTML = `
                    <br>
                    <div class="card card border-light mb-3" 
                        style="max-width: 50rem; text-align: center;
                        padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
                        <div>
                            <h4 class="card-header" style="background-color: #863b67; color: white">
                                Candidato Anônimo ${candidato.nome}
                            </h4>
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
});
