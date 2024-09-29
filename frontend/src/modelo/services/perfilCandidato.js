"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const listaDeVagas_1 = require("./listaDeVagas");
const candidato_1 = require("../classes/candidato");
function renderCandidatos() {
    console.log('Renderizando Vagas...');
    const vagas = JSON.parse(localStorage.getItem('vagas') || '[]');
    const listaDeVagas = document.getElementById('lista-vagas');
    if (listaDeVagas) {
        if (Array.isArray(vagas) && vagas.length > 0) {
            vagas.forEach((candidatoData) => {
                const candidato = new candidato_1.Candidato(candidatoData._nome, candidatoData._email, candidatoData._estado, candidatoData._cep, candidatoData._descricao, candidatoData._competencias, candidatoData._idade, candidatoData._cpf, candidatoData._formacao, candidatoData._idiomas);
                const candidatoDiv = document.createElement('div');
                candidatoDiv.classList.add('candidato');
                candidatoDiv.innerHTML = `
                    <br>
                    <div class="card card border-light mb-3" 
                        style="max-width: 50rem; text-align: center;
                        padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
                        <div>
                            <h4 class="card-header" style="background-color: #863b67; color: white">
                                Candidato Anônimo
                            </h4>
                            <p><strong>Formação: </strong>${candidato.formacao}</p>
                            <p><strong>Idiomas: </strong>${candidato.idiomas}</p>
                            <p><strong>Descrição: </strong>${candidato.descricao}</p>
                            <p><strong>Competências: </strong>${candidato.competencias}</p>
                            <span>
                                <a href="#" class="card-link">
                                    <i class="bi bi-x-circle" style="color: darkred;"></i>
                                </a>
                                <a href="#" class="card-link">
                                    <i class="bi bi-check-circle" style="color: green"></i>
                                </a>
                            </span>
                        </div>
                    </div>
                    <br>`;
                candidatoList.appendChild(candidatoDiv);
            });
        }
        else {
            console.log('Nenhum candidato disponível para renderizar.');
        }
    }
    else {
        console.error("Elemento com ID 'candidato-list' não encontrado.");
    }
}
function renderVagas() {
    const listaVagas = document.getElementById('lista-vagas');
    if (listaVagas) {
        listaDeVagas_1.vagas.forEach(vaga => {
            const vagasDiv = document.createElement('div');
            vagasDiv.classList.add('vaga');
            vagasDiv.innerHTML = `<br><div class="card card border-light mb-3" 
                    style="max-width: 50rem; text-align: center;
                     padding: 20px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
            <div >
                    <h4 class="card-header" style="background-color: #863b67; color: white">Vaga</h4>
                    <h2>Vaga de ${vaga.titulo}</h2>
                    <p><strong>Formato: </strong>${vaga.formato}</p>
                    <p><strong>Local: </strong>${vaga.local}</p>
                    <p><strong>Descrição:</strong> ${vaga.descricao}</p>
                    <p><strong>Competências:</strong> ${vaga.competencias}</p>
                    <p><strong>Qualificações: </strong>${vaga.qualificacoes}</p>
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
