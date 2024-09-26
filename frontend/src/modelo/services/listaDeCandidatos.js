"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.candidatos = void 0;
const candidato_1 = require("../classes/candidato");
exports.candidatos = [
    new candidato_1.Candidato("João Silva", "joao.silva@email.com", 30, "123.456.789-10", "SP", "01000-000", "Desenvolvedor Front-End com experiência em TypeScript.", ["HTML", "CSS", "JavaScript", "TypeScript", "React"]),
    new candidato_1.Candidato("Maria Oliveira", "maria.oliveira@email.com", 28, "987.654.321-00", "RJ", "20000-000", "Desenvolvedora Full-Stack com foco em Java e Angular.", ["Java", "Angular", "Spring Boot", "SQL"]),
    new candidato_1.Candidato("Carlos Souza", "carlos.souza@email.com", 35, "147.258.369-00", "MG", "30000-000", "Engenheiro de software com habilidades em cloud computing.", ["AWS", "Docker", "Kubernetes", "Node.js"]),
    new candidato_1.Candidato("Ana Martins", "ana.martins@email.com", 40, "321.654.987-00", "RS", "90000-000", "Gerente de projetos com experiência em metodologias ágeis.", ["Scrum", "Kanban", "Jira", "Gestão de Equipes"]),
    new candidato_1.Candidato("Lucas Fernandes", "lucas.fernandes@email.com", 25, "159.753.486-00", "SP", "04567-890", "Desenvolvedor Mobile com experiência em Flutter e Kotlin.", ["Flutter", "Kotlin", "Swift", "Firebase"])
];
