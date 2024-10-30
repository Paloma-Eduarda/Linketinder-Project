import {Candidato} from '../classes/candidato.js'
import {validaEmail, validaIdade, validaNome, validaCpf, validaCep} from "./ValidarDados";

document.addEventListener("DOMContentLoaded",  function() {
    const salvarBtn = document.getElementById('enviar') as HTMLButtonElement;

    salvarBtn.addEventListener("click", function() {

        const nome: string = (document.getElementById('nomeCandidato') as HTMLInputElement).value;
        const email:string = (document.getElementById('emailCandidato') as HTMLInputElement).value;
        const idade:string = (document.getElementById('idade') as HTMLInputElement).value;
        const cpf:string = (document.getElementById('cpf') as HTMLInputElement).value;
        const estado:string = (document.getElementById('estadoCandidato') as HTMLInputElement).value;
        const cep:string = (document.getElementById('cepCandidato') as HTMLInputElement).value;
        const competencias:string = (document.getElementById('competenciaCan') as HTMLInputElement).value;
        const descricao:string = (document.getElementById('descricao') as HTMLInputElement).value;
        const formacao :string= (document.getElementById('formacao') as HTMLInputElement).value;
        const idiomas :string= (document.getElementById('idiomas') as HTMLInputElement).value;


        const novoUsuarioC = new Candidato(
            nome,
            email,
            estado,
            cep,
            descricao,
            Number(idade),
            cpf,
            formacao,
            idiomas,
            competencias
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






