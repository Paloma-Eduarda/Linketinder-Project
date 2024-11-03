"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const empresa_js_1 = require("../classes/empresa.js");
const ValidarDados_1 = require("./ValidarDados");
document.addEventListener("DOMContentLoaded", function () {
    const btSalvarEmpresa = document.getElementById('salvarEmpresa');
    btSalvarEmpresa.addEventListener("click", function () {
        console.log('evento submit chamdo');
        const nome = document.getElementById('nome').value;
        const email = document.getElementById('email').value;
        const cnpj = document.getElementById('cnpj').value;
        const pais = document.getElementById('pais').value;
        const estado = document.getElementById('estado').value;
        const cep = document.getElementById('cep').value;
        const descricao = document.getElementById('descricaoEmp').value;
        const novaEmpresa = new empresa_js_1.Empresa(nome, email, estado, cep, descricao, cnpj, pais);
        if ((0, ValidarDados_1.validaEmail)(email) && (0, ValidarDados_1.validaNome)(nome) && (0, ValidarDados_1.validaCnpj)(cnpj) && (0, ValidarDados_1.validaCep)(cep)) {
            salvarEmpresa(novaEmpresa);
        }
        console.log('Salvando empresa');
    });
});
function salvarEmpresa(novaEmpresa) {
    //criar classe para json???
    const empresas = JSON.parse(localStorage.getItem('empresas') || '[]');
    empresas.push(novaEmpresa);
    localStorage.setItem('empresas', JSON.stringify(empresas));
    console.log('Empresa salvo no localStorage');
}
