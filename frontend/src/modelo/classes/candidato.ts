import {Pessoa} from './pessoa.js';

export class Candidato extends Pessoa{
    private static contador: number = 0
    private _idCandidato: number
    private _idade:number
    private _cpf:string


    constructor(nome: string, email: string, estado: string, cep: string, descricao: string, competencias: string,idade: number, cpf: string) {
        super(nome, email, estado, cep, descricao, competencias);
        this._idCandidato = Candidato.contador++;
        this._idade = idade;
        this._cpf = cpf;
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
        return `${this._idCandidato}TECH`; // Retorna o ID formatado
    }
    // get areaDeAtuacao(): string {
    //     return this._areaDeAtuacao;
    // }
    //
    // set areaDeAtuacao(value: string) {
    //     this._areaDeAtuacao = value;
    // }
}
