import {Candidato} from '../classes/candidato.js'
import {nodeName} from "jquery";

document.addEventListener("DOMContentLoaded",  function() {
    const salvarBtn = document.getElementById('enviar') as HTMLButtonElement;

    salvarBtn.addEventListener("click", function() {
        console.log('evento submit chamdo')
        const nome = (document.getElementById('nomeCandidato') as HTMLInputElement).value;
        const email = (document.getElementById('emailCandidato') as HTMLInputElement).value;
        const idade = (document.getElementById('idade') as HTMLInputElement).value;
        const cpf = (document.getElementById('cpf') as HTMLInputElement).value;
        const estado = (document.getElementById('estadoCandidato') as HTMLInputElement).value;
        const cep = (document.getElementById('cepCandidato') as HTMLInputElement).value;
        const competencias = (document.getElementById('competenciaCan') as HTMLInputElement).value;
        const descricao = (document.getElementById('descricao') as HTMLInputElement).value;
        const formacao = (document.getElementById('formacao') as HTMLInputElement).value;
        const idiomas = (document.getElementById('idiomas') as HTMLInputElement).value;


        const novoUsuarioC = new Candidato(
            nome,
            email,
            estado,
            cep,
            descricao,
            competencias,
            Number(idade),
            cpf,
            formacao,
            idiomas,
            )
        if(validaEmail(email) && validaNome(nome) && validaCpf(cpf) && validaIdade(idade) && validaCep(cep)){
            salvarCandidato(novoUsuarioC)
        }

    })

})

function salvarCandidato(novoCandidato: Candidato) {
    const candidatos = JSON.parse(localStorage.getItem('candidatos') || '[]');
    candidatos.push(novoCandidato)
    localStorage.setItem('candidatos', JSON.stringify(candidatos))
    console.log('Candidato salvo no localStorage');

}
function validaNome(nome:string): boolean{
    const regex_nome = /^[A-zÁ-ú]{2,}$/g
    const  match = regex_nome.test(nome)

    if(!match){
        alert('Nome invalido')
    }
    return match
}
function validaEmail(email:string): boolean{
    const regex_email = /\S+@\w+\.\w{2,6}(\.\w{2})?/g

    const  match = regex_email.test(email)

    if(!match){
        alert('Email invalido')
    }
    return match

}
function validaCpf(cpf:string): boolean{
    const regex_cpf = /^\d{3}\.?\d{3}\.?\d{3}-?\d{2}$/g
    const match = regex_cpf.test(cpf)

    if(!match){
        alert('CPF invalido')
    }
    return match
}
function validaCep(cep: string): boolean{
    const regex_cep = /^\d{5}-?\d{3}$/g
    const match = regex_cep.test(cep)

    if(!match){
        alert('CEP invalido')
    }
    return match
}

function validaIdade(idade:string){
    const regex_idade = /^(1[89]|[2-9]\d|100)$/
    const match = regex_idade.test(idade)

    if(!match){
        alert('Idade invalido')
    }
    return match
}





