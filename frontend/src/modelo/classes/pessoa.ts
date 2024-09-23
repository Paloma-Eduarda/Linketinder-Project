import PessoaService from "../services/pessoaService";

export abstract class Pessoa {
    nome: string
    email: string
    estato:string
    cep: string //Pensar sobre o tipo
    descricao: string
    competencias: any


    constructor(nome: string, email: string, estato: string, cep: string, descricao: string, competencias: any) {
        this.nome = nome;
        this.email = email;
        this.estato = estato;
        this.cep = cep;
        this.descricao = descricao;
        this.competencias = competencias;
    }
}
