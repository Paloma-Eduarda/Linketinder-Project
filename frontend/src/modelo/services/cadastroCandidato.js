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
        const novoUsuarioC = new candidato_js_1.Candidato(nome, email, estado, cep, descricao, competencias, Number(idade), cpf, formacao, idiomas);
        if (validaEmail(email) && validaNome(nome) && validaCpf(cpf) && validaIdade(idade) && validaCep(cep)) {
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
function validaNome(nome) {
    const regex_nome = /^[A-zÁ-ú]{2,}$/g;
    const match = regex_nome.test(nome);
    if (!match) {
        alert('Nome invalido');
    }
    return match;
}
function validaEmail(email) {
    const regex_email = /\S+@\w+\.\w{2,6}(\.\w{2})?/g;
    const match = regex_email.test(email);
    if (!match) {
        alert('Email invalido');
    }
    return match;
}
function validaCpf(cpf) {
    const regex_cpf = /^\d{3}\.?\d{3}\.?\d{3}-?\d{2}$/g;
    const match = regex_cpf.test(cpf);
    if (!match) {
        alert('CPF invalido');
    }
    return match;
}
function validaCep(cep) {
    const regex_cep = /^\d{5}-?\d{3}$/g;
    const match = regex_cep.test(cep);
    if (!match) {
        alert('CEP invalido');
    }
    return match;
}
function validaIdade(idade) {
    const regex_idade = /^(1[89]|[2-9]\d|100)$/;
    const match = regex_idade.test(idade);
    if (!match) {
        alert('Idade invalido');
    }
    return match;
}
