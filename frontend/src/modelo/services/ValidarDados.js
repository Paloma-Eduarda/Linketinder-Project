"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.validaNome = validaNome;
exports.validaEmail = validaEmail;
exports.validaCpf = validaCpf;
exports.validaCep = validaCep;
exports.validaIdade = validaIdade;
exports.validaCnpj = validaCnpj;
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
function validaCnpj(cnpj) {
    const regex_cnpj = /^\d{2}\.?\d{3}\.?\d{3}\/?\d{4}-?\d{2}$/g;
    const match = regex_cnpj.test(cnpj);
    if (!match) {
        alert('CNPJ invalido');
    }
    return match;
}
