import {Candidato} from "../classes/candidato";

export const candidatos: Candidato[] = [
    new Candidato(
        "João Silva",
        "joao.silva@email.com",
        30,
        "123.456.789-10",
        "SP",
        "01000-000",
        "Desenvolvedor Front-End com experiência em TypeScript.",
        ["HTML", "CSS", "JavaScript", "TypeScript", "React"]
    ),
    new Candidato(
        "Maria Oliveira",
        "maria.oliveira@email.com",
        28,
        "987.654.321-00",
        "RJ",
        "20000-000",
        "Desenvolvedora Full-Stack com foco em Java e Angular.",
        ["Java", "Angular", "Spring Boot", "SQL"]
    ),
    new Candidato(
        "Carlos Souza",
        "carlos.souza@email.com",
        35,
        "147.258.369-00",
        "MG",
        "30000-000",
        "Engenheiro de software com habilidades em cloud computing.",
        ["AWS", "Docker", "Kubernetes", "Node.js"]
    ),
    new Candidato(
        "Ana Martins",
        "ana.martins@email.com",
        40,
        "321.654.987-00",
        "RS",
        "90000-000",
        "Gerente de projetos com experiência em metodologias ágeis.",
        ["Scrum", "Kanban", "Jira", "Gestão de Equipes"]
    ),
    new Candidato(
        "Lucas Fernandes",
        "lucas.fernandes@email.com",
        25,
        "159.753.486-00",
        "SP",
        "04567-890",
        "Desenvolvedor Mobile com experiência em Flutter e Kotlin.",
        ["Flutter", "Kotlin", "Swift", "Firebase"]
    )
];