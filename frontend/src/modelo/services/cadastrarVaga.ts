import {Vaga} from "../classes/vaga";

document.addEventListener("DOMContentLoaded", () => {

    const btnCadVaga= document.getElementById('cad_vaga') as HTMLButtonElement;

    btnCadVaga.addEventListener("click", function() {
        console.log('evento click chamdo')
        const titulo: string = (document.getElementById('titulo_vaga') as HTMLInputElement).value;
        const formato: string = (document.getElementById('formato_vaga') as HTMLInputElement).value;
        const local: string = (document.getElementById('local_vaga') as HTMLInputElement).value;
        const descricaoVaga: string = (document.getElementById('descricao_vaga') as HTMLInputElement).value;
        const competenciasVaga: string = (document.getElementById('competencia_vaga') as HTMLInputElement).value;
        const qualificacoesVaga:string = (document.getElementById('qualificacoes_vaga') as HTMLInputElement).value;

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

