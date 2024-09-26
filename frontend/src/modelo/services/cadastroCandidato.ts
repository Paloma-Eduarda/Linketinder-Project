import {Candidato} from '../classes/candidato.js'
import {candidatos} from './listaDeCandidatos'

document.addEventListener("DOMContentLoaded", function() {
    const salvarBtn = document.getElementById('enviar') as HTMLButtonElement;
    salvarBtn.addEventListener("click", function() {
        console.log('evento submit chamdo')
        const nome = (document.getElementById('nome') as HTMLInputElement).value;
        const email = (document.getElementById('email') as HTMLInputElement).value;
        const idade = (document.getElementById('idade') as HTMLInputElement).value;
        const cpf = (document.getElementById('cpf') as HTMLInputElement).value;
        const estado = (document.getElementById('estado') as HTMLInputElement).value;
        const cep = (document.getElementById('cep') as HTMLInputElement).value;
        const competencias = (document.getElementById('competencia') as HTMLInputElement).value;
        const descricao = (document.getElementById('descricao') as HTMLInputElement).value;

        let novoUsuarioC = new Candidato(nome, email, Number(idade), cpf, estado, cep, descricao, competencias)
        candidatos.push(novoUsuarioC)

        console.log('candidato cadastrado com sucesso!')
        console.log(candidatos);
    })
})

