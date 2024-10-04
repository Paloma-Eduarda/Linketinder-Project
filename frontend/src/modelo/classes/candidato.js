"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Candidato = void 0;
const pessoa_js_1 = require("./pessoa.js");
class Candidato extends pessoa_js_1.Pessoa {
    constructor(nome, email, estado, cep, descricao, idade, cpf, formacao, idiomas, competencias) {
        super(nome, email, estado, cep, descricao);
        this._idCandidato = Candidato.contador++;
        this._idade = idade;
        this._cpf = cpf;
        this._formacao = formacao;
        this._idiomas = idiomas;
        this._competencias = competencias;
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
        return this._idCandidato;
    }
    get formacao() {
        return this._formacao;
    }
    set formacao(value) {
        this._formacao = value;
    }
    get idiomas() {
        return this._idiomas;
    }
    set idiomas(value) {
        this._idiomas = value;
    }
    get competencias() {
        return this._competencias;
    }
    set competencias(value) {
        this._competencias = value;
    }
}
exports.Candidato = Candidato;
Candidato.contador = 0;
