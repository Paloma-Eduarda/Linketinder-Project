import {Pessoa} from './pessoa.js';

export class Candidato extends Pessoa{

    constructor(nome: string, email: string, idade: number, cpf: string, cnpj: string, pais: string, estato: string, cep: string, descricao: string, competencias: any) {
        super(nome, email, idade, cpf, cnpj, pais, estato, cep, descricao, competencias);
    }

}
