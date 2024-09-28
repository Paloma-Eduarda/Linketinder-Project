import {Pessoa} from './pessoa.js';

export class Candidato extends Pessoa{
    private static contador: number = 0
    private _idCandidato: number

    constructor(nome: string, email: string, private _idade: number, private _cpf: string, estato: string, cep: string, descricao: string, competencias: any) {
        super(nome, email, estato, cep, descricao, competencias);
        this._idCandidato = ++Candidato.contador;
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

    get idCandidato(): string {
        return `${this._idCandidato}TECH`;
    }
    // get areaDeAtuacao(): string {
    //     return this._areaDeAtuacao;
    // }
    //
    // set areaDeAtuacao(value: string) {
    //     this._areaDeAtuacao = value;
    // }
}
