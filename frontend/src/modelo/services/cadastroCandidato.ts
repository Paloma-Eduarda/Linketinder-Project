import {Candidato} from '../classes/candidato.js'
import {candidatos} from './listaDeCandidatos'

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

        const novoUsuarioC = new Candidato(nome, email, Number(idade), cpf, estado, cep, descricao, competencias)
        console.log(novoUsuarioC.idCandidato)
        candidatos.push(novoUsuarioC)

        localStorage.setItem(novoUsuarioC.idCandidato, JSON.stringify(novoUsuarioC))
        //console.log(novoUsuarioC.idCandidato)

    })

})


