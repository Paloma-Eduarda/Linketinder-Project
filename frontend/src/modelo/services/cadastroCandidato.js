"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const candidato_js_1 = require("../classes/candidato.js");
const ValidarDados_1 = require("./ValidarDados");
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
        const novoUsuarioC = new candidato_js_1.Candidato(nome, email, estado, cep, descricao, Number(idade), cpf, formacao, idiomas, competencias);
        if ((0, ValidarDados_1.validaEmail)(email) && (0, ValidarDados_1.validaNome)(nome) && (0, ValidarDados_1.validaCpf)(cpf) && (0, ValidarDados_1.validaIdade)(idade) && (0, ValidarDados_1.validaCep)(cep)) {
            salvarCandidato(novoUsuarioC);
        }
    });
});
function salvarCandidato(novoCandidato) {
    const candidatos = JSON.parse(localStorage.getItem('candidatos') || '[]');
    candidatos.push(novoCandidato);
    localStorage.setItem('candidatos', JSON.stringify(candidatos));
    console.log('Candidato salvo no localStorage');
}
