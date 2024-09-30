import {Vaga} from "../classes/vaga";

document.addEventListener("DOMContentLoaded", () => {

    const btnCadVaga= document.getElementById('cad_vaga') as HTMLButtonElement;

    btnCadVaga.addEventListener("click", function() {
        console.log('evento click chamdo')
        const titulo = (document.getElementById('titulo_vaga') as HTMLInputElement).value;
        const formato = (document.getElementById('formato_vaga') as HTMLInputElement).value;
        const local = (document.getElementById('local_vaga') as HTMLInputElement).value;
        const descricaoVaga = (document.getElementById('descricao_vaga') as HTMLInputElement).value;
        const competenciasVaga = (document.getElementById('competencia_vaga') as HTMLInputElement).value;
        const qualificacoesVaga = (document.getElementById('qualificacoes_vaga') as HTMLInputElement).value;

        const novaVaga = new Vaga(
            "anomina",
            titulo,
            formato,
            local,
            descricaoVaga,
            competenciasVaga,
            qualificacoesVaga,
        )

        salvarVaga(novaVaga)

    })

})

function salvarVaga(novaVaga: Vaga) {
    const vagas = JSON.parse(localStorage.getItem('vagas') || '[]');
    vagas.push(novaVaga)
    localStorage.setItem('vagas', JSON.stringify(vagas))
    console.log('Vaga salva no localStorage');
}