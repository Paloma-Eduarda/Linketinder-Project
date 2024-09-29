import {Pessoa} from './pessoa.js';

export class Candidato extends Pessoa{
    private static contador: number = 0
    private _idCandidato: number
    private _idade:number
    private _cpf:string
    private _formacao:string
    private _idiomas: string
   // private _experiencias: string


    constructor(nome: string, email: string, estado: string, cep: string, descricao: string,
                competencias: string,idade: number, cpf: string, formacao:string, idiomas:string) {
        super(nome, email, estado, cep, descricao, competencias)
        this._idCandidato = Candidato.contador++
        this._idade = idade
        this._cpf = cpf
        this._formacao = formacao
        this._idiomas = idiomas
        //this._experiencias = experiencias
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

    // get experiencias(): string {
    //     return this._experiencias;
    // }
    //
    // set experiencias(value: string) {
    //     this._experiencias = value;
    // }
}
