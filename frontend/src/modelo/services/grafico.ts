import { BarController, BarElement, CategoryScale, LinearScale, Chart } from 'chart.js';

Chart.register(BarController, BarElement, CategoryScale, LinearScale);

function exibirCandidatosPorComp(){

    const ctx = (document.getElementById('grafico_candidato') as HTMLCanvasElement)

    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
            datasets: [{
                label: '# of Votes',
                data: [12, 19, 3, 5, 2, 3],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}