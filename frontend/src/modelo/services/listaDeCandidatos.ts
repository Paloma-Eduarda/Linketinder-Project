import {Candidato} from "../classes/candidato";

export let candidatos: Candidato[];
candidatos = [
    new Candidato(
        "João Silva",
        "joao.silva@email.com",
        "São Paulo",
        "01001-000",
        "Desenvolvedor Full Stack com 5 anos de experiência.",
        "JavaScript, TypeScript, Node.js, React",
        28,
        "123.456.789-00",
        "Bacharelado em Ciência da Computação",
        "Português, Inglês"
        //["Desenvolvedor na Empresa X", "Estagiário na Empresa Y"]
    ),
    new Candidato(
        "Maria Oliveira",
        "maria.oliveira@email.com",
        "Rio de Janeiro",
        "20010-001",
        "Especialista em análise de dados e automação.",
        "Python, SQL, Power BI",
        32,
        "987.654.321-00",
        "Mestrado em Engenharia de Software",
        "Português, Espanhol",
        // ["Analista de Dados na Empresa Z", "Engenheira de Software na Empresa W"]
    ),
    new Candidato(
        "Carlos Souza",
        "carlos.souza@email.com",
        "Minas Gerais",
        "30130-002",
        "Engenheiro de software focado em desenvolvimento backend.",
        "Java, Spring Boot, Docker",
        35,
        "456.789.123-00",
        "Bacharelado em Engenharia da Computação",
        "Português, Inglês, Alem",
        //["Engenheiro de Software na Empresa A", "Desenvolvedor Backend na Empresa B"]
    )
];
