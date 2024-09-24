"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Candidato = void 0;
const pessoa_js_1 = require("./pessoa.js");
class Candidato extends pessoa_js_1.Pessoa {
    constructor(nome, email, idade, cpf, cnpj, pais, estato, cep, descricao, competencias) {
        super(nome, email, idade, cpf, cnpj, pais, estato, cep, descricao, competencias);
    }
}
exports.Candidato = Candidato;
