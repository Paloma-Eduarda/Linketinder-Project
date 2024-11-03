import { Vaga } from "../classes/vaga";

function renderizarVagas() {
    console.log('Renderizando Vagas...');

    const vagas = JSON.parse(localStorage.getItem('vagas') || '[]');
    const listaDeVagas = document.getElementById('lista-vagas') as HTMLElement;

    if (listaDeVagas) {
        if (Array.isArray(vagas) && vagas.length > 0) {
            listaDeVagas.appendChild(criarCardVaga(vagas));
        } else {
            console.log('Nenhuma vaga disponível para renderizar.');
        }
    }
}

function criarCardVaga(vagas: any[]): HTMLDivElement {
    const vagasContainer: HTMLDivElement = document.createElement('div');

    vagas.forEach((vagaData: any) => {
        const vaga = new Vaga(
            vagaData._empresa,
            vagaData._titulo,
            vagaData._formato,
            vagaData._local,
            vagaData._descricao,
            vagaData._competencias,
            vagaData._qualificacoes
        );

        const vagaDiv: HTMLDivElement = document.createElement('div');
        vagaDiv.classList.add('vaga');
        vagaDiv.innerHTML = `
            <div class="card border-light mb-3" style="max-width: 50rem; text-align: center; padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
                <h4 class="card-header" style="background-color: #863b67; color: white">${vaga.titulo}</h4>
                <p><strong>Formato: </strong>${vaga.formato}</p>
                <p><strong>Local: </strong>${vaga.local}</p>
                <p><strong>Descrição:</strong> ${vaga.descricao}</p>
                <p><strong>Competências:</strong> ${vaga.competencias}</p>
                <p><strong>Qualificações: </strong>${vaga.qualificacoes}</p>
                <span>
                    <a href="#" class="card-link"><i class="bi bi-x-circle" style="color: darkred;"></i></a>
                    <a href="#" class="card-link"><i class="bi bi-check-circle" style="color: green"></i></a>
                </span>
            </div>
        `;

        vagasContainer.appendChild(vagaDiv);
    });

    return vagasContainer;
}

document.addEventListener("DOMContentLoaded", () => {
    renderizarVagas();
});