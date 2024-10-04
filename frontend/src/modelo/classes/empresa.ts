import {Pessoa} from "./pessoa";

export class Empresa extends Pessoa{
    private static contador: number = 0
    private _idEmpresa: number
    private _cnpj: string
    private _pais: string


    constructor(nome: string, email: string, estado: string, cep: string, descricao: string, cnpj: string, pais: string) {
        super(nome, email, estado, cep, descricao);
        this._cnpj = cnpj;
        this._pais = pais;
        this._idEmpresa = Empresa.contador++
    }


    get idEmpresa(): number {
        return this._idEmpresa;
    }

    get cnpj(): string {
        return this._cnpj;
    }

    set cnpj(value: string) {
        this._cnpj = value;
    }

    get pais(): string {
        return this._pais;
    }

    set pais(value: string) {
        this._pais = value;
    }
}