"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.candidatos = void 0;
const candidato_1 = require("../classes/candidato");
exports.candidatos = [
    new candidato_1.Candidato("João Silva", "joao.silva@email.com", "São Paulo", "01001-000", "Desenvolvedor Full Stack com 5 anos de experiência.", "JavaScript, TypeScript, Node.js, React", 28, "123.456.789-00", "Bacharelado em Ciência da Computação", "Português, Inglês"
    //["Desenvolvedor na Empresa X", "Estagiário na Empresa Y"]
    ),
    new candidato_1.Candidato("Maria Oliveira", "maria.oliveira@email.com", "Rio de Janeiro", "20010-001", "Especialista em análise de dados e automação.", "Python, SQL, Power BI", 32, "987.654.321-00", "Mestrado em Engenharia de Software", "Português, Espanhol"),
    new candidato_1.Candidato("Carlos Souza", "carlos.souza@email.com", "Minas Gerais", "30130-002", "Engenheiro de software focado em desenvolvimento backend.", "Java, Spring Boot, Docker", 35, "456.789.123-00", "Bacharelado em Engenharia da Computação", "Português, Inglês, Alem")
];
