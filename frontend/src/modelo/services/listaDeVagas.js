"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.vagas = void 0;
const vaga_1 = require("../classes/vaga");
exports.vagas = [
    new vaga_1.Vaga("Empresa ABC", "Desenvolvedor Front-end", "Remoto", "São Paulo", "Desenvolver interfaces web modernas", ["HTML", "CSS", "JavaScript", "React"], "Graduação em Ciência da Computação"),
    new vaga_1.Vaga("Empresa XYZ", "Analista de Dados", "Presencial", "Rio de Janeiro", "Análise de grandes volumes de dados", ["SQL", "Python", "PowerBI"], "Experiência em análise de dados"),
    new vaga_1.Vaga("Tech Solutions", "Engenheiro de Software", "Híbrido", "Belo Horizonte", "Desenvolver e manter sistemas de alta performance", ["Java", "Spring Boot", "Docker"], "Mestrado em Engenharia de Software")
];
