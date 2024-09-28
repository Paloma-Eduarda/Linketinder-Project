"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const candidato_js_1 = require("../classes/candidato.js");
const listaDeCandidatos_1 = require("./listaDeCandidatos");
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
        const novoUsuarioC = new candidato_js_1.Candidato(nome, email, Number(idade), cpf, estado, cep, descricao, competencias);
        console.log(novoUsuarioC.idCandidato);
        listaDeCandidatos_1.candidatos.push(novoUsuarioC);
        localStorage.setItem(novoUsuarioC.idCandidato, JSON.stringify(novoUsuarioC));
        //console.log(novoUsuarioC.idCandidato)
    });
});
