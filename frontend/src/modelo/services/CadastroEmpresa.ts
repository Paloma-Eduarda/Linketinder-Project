import {Empresa} from '../classes/empresa.js'
import {validaNome, validaEmail, validaCep, validaCnpj} from "./ValidarDados";


document.addEventListener("DOMContentLoaded",  function() {
    const btSalvarEmpresa = document.getElementById('salvarEmpresa') as HTMLButtonElement;

    btSalvarEmpresa.addEventListener("click", function() {
        console.log('evento submit chamdo')
        const nome = (document.getElementById('nome') as HTMLInputElement).value;
        const email = (document.getElementById('email') as HTMLInputElement).value;
        const cnpj = (document.getElementById('cnpj') as HTMLInputElement).value;
        const pais = (document.getElementById('pais') as HTMLInputElement).value;
        const estado = (document.getElementById('estado') as HTMLInputElement).value;
        const cep = (document.getElementById('cep') as HTMLInputElement).value;
        const descricao = (document.getElementById('descricaoEmp') as HTMLInputElement).value;


        const novaEmpresa = new Empresa(
            nome,
            email,
            estado,
            cep,
            descricao,
            cnpj,
            pais
        )
        if(validaEmail(email) && validaNome(nome) && validaCnpj(cnpj) && validaCep(cep)){
            salvarEmpresa(novaEmpresa)
        }
        console.log('Salvando empresa')
    })

})

function salvarEmpresa(novaEmpresa: Empresa) {
    const empresas = JSON.parse(localStorage.getItem('empresas') || '[]');
    empresas.push(novaEmpresa)
    localStorage.setItem('empresas', JSON.stringify(empresas))
    console.log('Empresa salvo no localStorage');

}