"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Empresa = void 0;
const pessoa_1 = require("./pessoa");
class Empresa extends pessoa_1.Pessoa {
    constructor(nome, email, estado, cep, descricao, cnpj, pais) {
        super(nome, email, estado, cep, descricao);
        this._cnpj = cnpj;
        this._pais = pais;
        this._idEmpresa = Empresa.contador++;
    }
    get idEmpresa() {
        return this._idEmpresa;
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
}
exports.Empresa = Empresa;
Empresa.contador = 0;
