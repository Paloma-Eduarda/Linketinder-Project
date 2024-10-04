import {Pessoa} from './pessoa.js';

export class Candidato extends Pessoa{
    private static contador: number = 0
    private _idCandidato: number
    private _idade:number
    private _cpf:string
    private _formacao:string
    private _idiomas: string
    private _competencias: string

    constructor(nome: string, email: string, estado: string, cep: string, descricao: string,
                idade: number, cpf: string, formacao:string, idiomas:string, competencias: string ) {
        super(nome, email, estado, cep, descricao)
        this._idCandidato = Candidato.contador++
        this._idade = idade
        this._cpf = cpf
        this._formacao = formacao
        this._idiomas = idiomas
        this._competencias = competencias
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

    get idCandidato(): number {
        return this._idCandidato
    }


    get formacao(): string {
        return this._formacao;
    }

    set formacao(value: string) {
        this._formacao = value;
    }

    get idiomas(): string {
        return this._idiomas;
    }

    set idiomas(value: string) {
        this._idiomas = value;
    }


    get competencias(): string {
        return this._competencias;
    }

    set competencias(value: string) {
        this._competencias = value;
    }
}
