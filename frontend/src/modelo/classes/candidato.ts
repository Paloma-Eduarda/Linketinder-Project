import {Pessoa} from './pessoa.js';

export class Candidato extends Pessoa{
   // private _cnpj?:string
   // private _pais?:string

    constructor(nome: string, email: string, private _idade: number, private _cpf: string, estato: string, cep: string, descricao: string, competencias: any) {
        super(nome, email, estato, cep, descricao, competencias);
    }

    get cpf(): string {
        return this._cpf;
    }

    set cpf(value: string) {
        this._cpf = value;
    }

    get idade(): number {
        return this._idade;
    }

    set idade(value: number) {
        this._idade = value;
    }
}
