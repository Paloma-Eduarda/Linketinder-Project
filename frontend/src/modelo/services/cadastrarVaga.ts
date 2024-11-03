import {Vaga} from "../classes/vaga";

document.addEventListener("DOMContentLoaded", () => {

    const botaoCadastrarVaga= document.getElementById('cad_vaga') as HTMLButtonElement;

    botaoCadastrarVaga.addEventListener("click", function() {
        const titulo: string = (document.getElementById('titulo_vaga') as HTMLInputElement).value;
        const formato: string = (document.getElementById('formato_vaga') as HTMLInputElement).value;
        const local: string = (document.getElementById('local_vaga') as HTMLInputElement).value;
        const descricaoVaga: string = (document.getElementById('descricao_vaga') as HTMLInputElement).value;
        const competenciasVaga: string = (document.getElementById('competencia_vaga') as HTMLInputElement).value;
        const qualificacoesVaga:string = (document.getElementById('qualificacoes_vaga') as HTMLInputElement).value;

        const novaVaga = new Vaga(
            1,
            titulo,
            formato,
            local,
            descricaoVaga,
            competenciasVaga,
            qualificacoesVaga,
        )

        salvarVagaNoLocalStorage(novaVaga)

    })

})

function salvarVagaNoLocalStorage(novaVaga: Vaga) {
    const vagas = JSON.parse(localStorage.getItem('vagas') || '[]');
    vagas.push(novaVaga)
    localStorage.setItem('vagas', JSON.stringify(vagas))
    console.log('Vaga salva no localStorage');
}

