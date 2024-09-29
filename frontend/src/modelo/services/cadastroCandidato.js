"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const candidato_js_1 = require("../classes/candidato.js");
document.addEventListener("DOMContentLoaded", function () {
    const salvarBtn = document.getElementById('enviar');
    salvarBtn.addEventListener("click", function () {
        console.log('evento submit chamdo');
        const nome = document.getElementById('nomeCandidato').value;
        const email = document.getElementById('emailCandidato').value;
        const idade = document.getElementById('idade').value;
        const cpf = document.getElementById('cpf').value;
        const estado = document.getElementById('estadoCandidato').value;
        const cep = document.getElementById('cepCandidato').value;
        const competencias = document.getElementById('competenciaCan').value;
        const descricao = document.getElementById('descricao').value;
        const formacao = document.getElementById('formacao').value;
        const idiomas = document.getElementById('idiomas').value;
        const experiencia = document.getElementById('experiencia').value;
        const novoUsuarioC = new candidato_js_1.Candidato(nome, email, estado, cep, descricao, competencias, Number(idade), cpf, formacao, idiomas);
        salvarCandidato(novoUsuarioC);
    });
});
function salvarCandidato(novoCandidato) {
    const candidatos = JSON.parse(localStorage.getItem('candidatos') || '[]');
    candidatos.push(novoCandidato);
    localStorage.setItem('candidatos', JSON.stringify(candidatos));
    console.log('Candidato salvo no localStorage');
}
