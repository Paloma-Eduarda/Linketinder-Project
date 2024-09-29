"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Pessoa = void 0;
class Pessoa {
    constructor(_nome, _email, _estado, _cep, _descricao, _competencias) {
        this._nome = _nome;
        this._email = _email;
        this._estato = _estado;
        this._cep = _cep;
        this._descricao = _descricao;
        this._competencias = _competencias;
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
