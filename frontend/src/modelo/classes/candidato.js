"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Candidato = void 0;
const pessoa_js_1 = require("./pessoa.js");
class Candidato extends pessoa_js_1.Pessoa {
    constructor(nome, email, estado, cep, descricao, competencias, idade, cpf) {
        super(nome, email, estado, cep, descricao, competencias);
        this._idCandidato = Candidato.contador++;
        this._idade = idade;
        this._cpf = cpf;
    }
    get cpf() {
        return this._cpf;
    }
    set cpf(value) {
        this._cpf = value;
    }
    get idade() {
        return this._idade;
    }
    set idade(value) {
        this._idade = value;
    }
    get idCandidato() {
        return `${this._idCandidato}TECH`; // Retorna o ID formatado
    }
}
exports.Candidato = Candidato;
Candidato.contador = 0;
