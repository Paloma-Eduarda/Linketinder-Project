import PessoaService from "../services/pessoaService";

export abstract class Pessoa {

    private _nome: string
    private _email: string
    private _estato:string
    private _cep: string
    private _descricao?: string
    private _competencias: any

    constructor(nome: string, email: string, estado: string, cep:string, descricao:string, competencias:string) {
        this._nome = nome
        this._email = email
        this._estato = estado
        this._cep = cep
        this._descricao = descricao
        this._competencias = competencias
    }

    get nome(): string {
        return this._nome;
    }

    set nome(value: string) {
        this._nome = value;
    }

    get email(): string {
        return this._email;
    }

    set email(value: string) {
        this._email = value;
    }
    get estado(): string {
        return this._estato;
    }

    set estado(value: string) {
        this._estato = value;
    }

    get cep(): string {
        return this._cep;
    }

    set cep(value: string) {
        this._cep = value;
    }

    get descricao(): string {
        return <string>this._descricao;
    }

    set descricao(value: string) {
        this._descricao = value;
    }

    get competencias(): any {
        return this._competencias;
    }

    set competencias(value: any) {
        this._competencias = value;
    }

}
