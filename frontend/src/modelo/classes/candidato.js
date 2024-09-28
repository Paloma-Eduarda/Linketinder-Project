"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Candidato = void 0;
const pessoa_js_1 = require("./pessoa.js");
class Candidato extends pessoa_js_1.Pessoa {
    constructor(nome, email, _idade, _cpf, estato, cep, descricao, competencias) {
        super(nome, email, estato, cep, descricao, competencias);
        this._idade = _idade;
        this._cpf = _cpf;
        this._idCandidato = ++Candidato.contador;
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
        return `${this._idCandidato}TECH`;
    }
}
exports.Candidato = Candidato;
Candidato.contador = 0;
