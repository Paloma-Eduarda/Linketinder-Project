"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Pessoa = void 0;
class Pessoa {
    constructor(nome, email, estato, cep, descricao, competencias) {
        this._nome = nome;
        this._email = email;
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
