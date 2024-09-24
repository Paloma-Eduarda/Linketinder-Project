import PessoaService from "../services/pessoaService";

export abstract class Pessoa {
    private _nome: string
    private _email: string
    private _idade: number
    private _cpf?:string
    private _cnpj?:string
    private _pais?:string
    private _estato:string
    private _cep: string //Pensar sobre o tipo
    private _descricao?: string
    private _competencias: any


    constructor(nome: string, email: string, idade: number, cpf:string, cnpj:string,pais:string, estato: string, cep: string, descricao: string, competencias: any) {
        this._nome = nome
        this._email = email
        this._idade = idade
        this._cpf = cpf
        this._cnpj = cnpj
        this._pais = pais
        this._estato = estato
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

    get idade(): number {
        return this._idade;
    }

    set idade(value: number) {
        this._idade = value;
    }

    get cpf(): string {
        return <string>this._cpf;
    }

    set cpf(value: string) {
        this._cpf = value;
    }

    get cnpj(): string {
        return <string>this._cnpj;
    }

    set cnpj(value: string) {
        this._cnpj = value;
    }

    get pais(): string {
        return <string>this._pais;
    }

    set pais(value: string) {
        this._pais = value;
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
