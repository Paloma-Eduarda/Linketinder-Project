"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const listaDeCandidatos_1 = require("./listaDeCandidatos");
function renderCandidatos() {
    const candidatoList = document.getElementById('candidato-list');
    if (candidatoList) {
        listaDeCandidatos_1.candidatos.forEach(candidato => {
            const candidatoDiv = document.createElement('div');
            candidatoDiv.classList.add('candidato');
            candidatoDiv.innerHTML = `<br><div class="card card border-light mb-3" 
                    style="max-width: 50rem; text-align: center;
                     padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
            <div >
                    <h4 class="card-header" style="background-color: #863b67; color: white">Candidato</h4>
                    <h2>${candidato.nome}</h2>
                    <p><strong>Descrição:</strong> ${candidato.descricao}</p>
                    <p><strong>Competências:</strong> ${candidato.competencias.join(', ')}</p>
                    <spa><a href="#" class="card-link"><i class="bi bi-x-circle" style="color: darkred;"></i></a>
                    <a href="#" class="card-link"><i class="bi bi-check-circle" style="color: green"></i></a>
                    </spa>
                </div>
              </div>     
            </div><br>`;
            candidatoList.appendChild(candidatoDiv);
        });
    }
}
renderCandidatos();
