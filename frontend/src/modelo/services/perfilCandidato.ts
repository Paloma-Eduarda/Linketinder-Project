import {vagas} from "./listaDeVagas";

function renderVagas() {
    const listaVagas = document.getElementById('lista-vagas');

    if (listaVagas) {
        vagas.forEach(vaga => {
            const vagasDiv = document.createElement('div');
            vagasDiv.classList.add('vaga');
            vagasDiv.innerHTML = `<br><div class="card card border-light mb-3" 
                    style="max-width: 50rem; text-align: center;
                     padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
            <div >
                    <h4 class="card-header" style="background-color: #863b67; color: white">Vaga</h4>
                    <h2>${vaga.titulo}</h2>
                    <p><strong>Formato: </strong>${vaga.formato}</p>
                    <p><strong>Local: </strong>${vaga.local}</p>
                    <p><strong>Descrição:</strong> ${vaga.descricao}</p>
                    <p><strong>Competências:</strong> ${vaga.competencias.join(', ')}</p>
                    <p><strong>Qualificações:</strong>${vaga.qualificacoes}</p>
                    <spa><a href="#" class="card-link"><i class="bi bi-x-circle" style="color: darkred;"></i></a>
                    <a href="#" class="card-link"><i class="bi bi-check-circle" style="color: green"></i></a>
                    </spa>
                </div>
              </div>     
            </div><br>`;

            listaVagas.appendChild(vagasDiv);
        });
    }
}

renderVagas();