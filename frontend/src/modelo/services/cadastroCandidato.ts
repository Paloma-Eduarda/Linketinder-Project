import {Candidato} from '../classes/candidato.js'

export let can:Array<Candidato>

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

        const novoUsuarioC = new Candidato(nome, email,estado, cep, descricao, competencias, Number(idade), cpf)

        salvarCandidato(novoUsuarioC)

    })

})

function salvarCandidato(novoCandidato: Candidato) {
    can = JSON.parse(localStorage.getItem('can') || '[]');
    can.push(novoCandidato);
    localStorage.setItem('can', JSON.stringify(can))
    console.log('Candidato salvo no localStorage');
}


