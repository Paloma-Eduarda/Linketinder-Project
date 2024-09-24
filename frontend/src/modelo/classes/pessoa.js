"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Pessoa = void 0;
class Pessoa {
    constructor(nome, email, idade, cpf, cnpj, pais, estato, cep, descricao, competencias) {
        this._nome = nome;
        this._email = email;
        this._idade = idade;
        this._cpf = cpf;
        this._cnpj = cnpj;
        this._pais = pais;
        this._estato = estato;
        this._cep = cep;
        this._descricao = descricao;
        this._competencias = competencias;
    }
    get nome() {
        return this._nome;
    }
    set nome(value) {
        this._nome = value;
    }
    get email() {
        return this._email;
    }
    set email(value) {
        this._email = value;
    }
    get idade() {
        return this._idade;
    }
    set idade(value) {
        this._idade = value;
    }
    get cpf() {
        return this._cpf;
    }
    set cpf(value) {
        this._cpf = value;
    }
    get cnpj() {
        return this._cnpj;
    }
    set cnpj(value) {
        this._cnpj = value;
    }
    get pais() {
        return this._pais;
    }
    set pais(value) {
        this._pais = value;
    }
    get estato() {
        return this._estato;
    }
    set estato(value) {
        this._estato = value;
    }
    get cep() {
        return this._cep;
    }
    set cep(value) {
        this._cep = value;
    }
    get descricao() {
        return this._descricao;
    }
    set descricao(value) {
        this._descricao = value;
    }
    get competencias() {
        return this._competencias;
    }
    set competencias(value) {
        this._competencias = value;
    }
}
exports.Pessoa = Pessoa;
