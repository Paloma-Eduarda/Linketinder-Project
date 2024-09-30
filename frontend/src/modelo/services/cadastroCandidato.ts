import {Candidato} from '../classes/candidato.js'


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
        const experiencia = (document.getElementById('experiencia') as HTMLInputElement).value;

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

        salvarCandidato(novoUsuarioC)

    })

})

function salvarCandidato(novoCandidato: Candidato) {
    const candidatos = JSON.parse(localStorage.getItem('candidatos') || '[]');
    candidatos.push(novoCandidato)
    localStorage.setItem('candidatos', JSON.stringify(candidatos))
    console.log('Candidato salvo no localStorage');


}


