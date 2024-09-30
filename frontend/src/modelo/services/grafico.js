"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const chart_js_1 = require("chart.js");
chart_js_1.Chart.register(chart_js_1.BarController, chart_js_1.BarElement, chart_js_1.CategoryScale, chart_js_1.LinearScale);
function exibirCandidatosPorComp() {
    const ctx = document.getElementById('grafico_candidato');
    new chart_js_1.Chart(ctx, {
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
