import PessoaService from "../services/pessoaService";

export abstract class Pessoa {

    private _nome: string
    private _email: string
    private _estato:string
    private _cep: string
    private _descricao?: string
    private _competencias: any

    constructor(_nome: string, _email: string, _estado: string, _cep:string, _descricao:string, _competencias:string) {
        this._nome = _nome
        this._email = _email
        this._estato = _estado
        this._cep = _cep
        this._descricao = _descricao
        this._competencias = _competencias
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

    get estato(): string {
        return this._estato;
    }

    set estato(value: string) {
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
