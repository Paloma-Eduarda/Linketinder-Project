"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const candidatosCadastrados_js_1 = require("./candidatosCadastrados.js");
const nome = document.getElementById('nome');
const email = document.getElementById('email');
const idade = document.getElementById('idade');
const cpf = document.getElementById('cpf');
const estado = document.getElementById('estado');
const cep = document.getElementById('cep');
const competencias = document.getElementById('competencia');
const descricao = document.getElementById('descricao');
function renderCandidatos() {
    const candidatoList = document.getElementById('candidato-list');
    if (candidatoList) {
        candidatosCadastrados_js_1.candidatos.forEach(candidato => {
            const candidatoDiv = document.createElement('div');
            candidatoDiv.classList.add('candidato');
            candidatoDiv.innerHTML = `
        <h2>${candidato.nome}</h2>
        <p><strong>Email:</strong> ${candidato.email}</p>
        <p><strong>Idade:</strong> ${candidato.idade}</p>
        <p><strong>CPF:</strong> ${candidato.cpf}</p>
        <p><strong>CNPJ:</strong> ${candidato.cnpj}</p>
        <p><strong>País:</strong> ${candidato.pais}</p>
        <p><strong>CEP:</strong> ${candidato.cep}</p>
        <p><strong>Descrição:</strong> ${candidato.descricao}</p>
        <p><strong>Competências:</strong> ${candidato.competencias.join(', ')}</p>
      `;
            candidatoList.appendChild(candidatoDiv);
        });
    }
}
renderCandidatos();
