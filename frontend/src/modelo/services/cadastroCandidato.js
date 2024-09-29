"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.can = void 0;
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
        const novoUsuarioC = new candidato_js_1.Candidato(nome, email, estado, cep, descricao, competencias, Number(idade), cpf);
        salvarCandidato(novoUsuarioC);
    });
});
function salvarCandidato(novoCandidato) {
    exports.can = JSON.parse(localStorage.getItem('can') || '[]');
    exports.can.push(novoCandidato);
    localStorage.setItem('can', JSON.stringify(exports.can));
    console.log('Candidato salvo no localStorage');
}
