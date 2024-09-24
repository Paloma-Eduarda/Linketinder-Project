"use strict";
class Vaga {
    constructor(_empresa, _titulo, _formato, _local, _descricao, _competencias, _qualificacoes) {
        this._empresa = _empresa;
        this._titulo = _titulo;
        this._formato = _formato;
        this._local = _local;
        this._descricao = _descricao;
        this._competencias = _competencias;
        this._qualificacoes = _qualificacoes;
    }
    get empresa() {
        return this._empresa;
    }
    set empresa(value) {
        this._empresa = value;
    }
    get titulo() {
        return this._titulo;
    }
    set titulo(value) {
        this._titulo = value;
    }
    get formato() {
        return this._formato;
    }
    set formato(value) {
        this._formato = value;
    }
    get local() {
        return this._local;
    }
    set local(value) {
        this._local = value;
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
    get qualificacoes() {
        return this._qualificacoes;
    }
    set qualificacoes(value) {
        this._qualificacoes = value;
    }
}
