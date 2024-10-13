-- -----------------------------------------------------
-- Table `linketinder`.`Candidato`
-- -----------------------------------------------------
CREATE TABLE pais(
	id SERIAL NOT NULL PRIMARY KEY,
    nome VARCHAR(100),
    codigo CHAR(2)
)

CREATE TABLE candidato(
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  sobrenome VARCHAR(100) NOT NULL,
  data_nascimento DATE NOT NULL,
  email VARCHAR(255) NOT NULL,
  cpf VARCHAR(20) NOT NULL,
  cep VARCHAR(10) NOT NULL,
  descricao TEXT NOT NULL,
  senha VARCHAR(255) NOT NULL,
  id_pais INT REFERENCES pais(id) NOT NULL
 )
 
 CREATE TABLE empresa(
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(255) NOT NULL,
  cnpj VARCHAR(45) NOT NULL,
  descricao TEXT NULL,
  cep VARCHAR(10) NULL,
  senha VARCHAR(255) NOT NULL,
  id_pais INT REFERENCES pais(id) NOT NULL
)
CREATE TABLE estado (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(100) NULL,
  codigo CHAR(2) NULL
)
CREATE TABLE vagas (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  descricao TEXT NOT NULL,
  cidade VARCHAR(100) NULL,
  id_estado INT REFERENCES estado(id) NOT NULL,
  id_empresa INT REFERENCES empresa(id) NOT NULL
)
CREATE TABLE competencias(
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL
)
CREATE TABLE competencias_vagas(
  id_competencias INT REFERENCES competencias(id) NOT NULL,
  id_vagas INT REFERENCES vagas(id) NOT NULL
)
CREATE TABLE competencias_candidato(
  id_competencias INT REFERENCES competencias(id) NOT NULL,
  id_candidato INT REFERENCES candidato(id) NOT NULL
)

INSERT INTO pais(nome, codigo) VALUES ('Brasil', 'BR');
INSERT INTO pais(nome, codigo) VALUES ('Estados Unidos da América', 'US');
INSERT INTO pais(nome, codigo) VALUES ('Portugal', 'PT');
INSERT INTO pais(nome, codigo) VALUES ('Canadá', 'CA');

SELECT * FROM pais;

INSERT INTO estado(nome, codigo) VALUES ('São Paulo', 'SP');
INSERT INTO estado(nome, codigo) VALUES ('Rio de janeiro', 'RJ');
INSERT INTO estado(nome, codigo) VALUES ('Rio Grande do Norte', 'RN');
INSERT INTO estado(nome, codigo) VALUES ('Minas Gerais', 'MG');

SELECT * FROM estado;

INSERT INTO competencias(nome) VALUES ('Angular');
INSERT INTO competencias(nome) VALUES ('Spring framework');
INSERT INTO competencias(nome) VALUES ('Java');
INSERT INTO competencias(nome) VALUES ('Groovy');
INSERT INTO competencias(nome) VALUES ('HTML5');

SELECT * FROM competencias;

INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, cep, descricao, senha, id_pais)
VALUES ('João', 'Silva', '1990-05-12', 'joao.silva@gmail.com', '12345678901', '59000123', 'Desenvolvedor com 5 anos de experiência.', 'senhaSegura123', 1);

INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, cep, descricao, senha, id_pais)
VALUES ('Maria', 'Oliveira', '1988-07-22', 'maria.oliveira@hotmail.com', '23456789012', '59010234', 'Analista de sistemas com foco em BI.', 'senhaSegura456', 1);

INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, cep, descricao, senha, id_pais)
VALUES ('Pedro', 'Santos', '1995-11-05', 'pedro.santos@gmail.com', '34567890123', '59020345', 'Desenvolvedor front-end especializado em React.', 'senhaSegura789', 1);

INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, cep, descricao, senha, id_pais)
VALUES ('Ana', 'Costa', '1992-03-15', 'ana.costa@gmail.com', '45678901234', '59030456', 'Especialista em UX/UI design com experiência em projetos mobile.', 'senhaSegura101', 3);

INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, cep, descricao, senha, id_pais)
VALUES ('Lucas', 'Ferreira', '1998-12-30', 'lucas.ferreira@hotmal.com', '56789012345', '59040567', 'Engenheiro de software com conhecimento em arquitetura de microsserviços.', 'senhaSegura202', 1);

SELECT * FROM candidato;

INSERT INTO empresa (nome, cnpj, email, descricao, cep, senha, id_pais)
VALUES ('Tech Innovators', '12345678000199', 'contact@techinnovators.com', 'Empresa de desenvolvimento de software focada em inovação tecnológica.', '59000123', 'senhaSeguraEmpresa1', 1);

INSERT INTO Empresa (nome, cnpj, email, descricao, cep, senha, id_pais)
VALUES ('Green Solutions', '23456789000188', 'info@greensolutions.com', 'Consultoria em soluções sustentáveis para empresas de diversos setores.', '59010234', 'senhaSeguraEmpresa2', 2);

INSERT INTO Empresa (nome, cnpj, email, descricao, cep, senha, id_pais)
VALUES ('Global Tech', '34567890000177', 'support@globaltech.com', 'Multinacional especializada em soluções em cloud computing.', '59020345', 'senhaSeguraEmpresa3', 1);

INSERT INTO Empresa (nome, cnpj, email, descricao, cep, senha, id_pais)
VALUES ('EducaTech', '45678901000166', 'hello@educatech.com', 'Plataforma de educação online para profissionais de tecnologia.', '59030456', 'senhaSeguraEmpresa4', 4);

INSERT INTO Empresa (nome, cnpj, email, descricao, cep, senha, id_pais)
VALUES ('Health Solutions', '56789012000155', 'contact@healthsolutions.com', 'Empresa focada em desenvolvimento de softwares para a área de saúde.', '59040567', 'senhaSeguraEmpresa5', 3);

SELECT * FROM empresa;

INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa)
VALUES ('Desenvolvedor Backend', 'Responsável pelo desenvolvimento de APIs e integração com serviços externos.', 'Natal', 3, 1);

INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa)
VALUES ('Analista de Dados', 'Análise de dados e geração de relatórios para tomada de decisões.', 'São Paulo', 1, 1);

INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa)
VALUES ('Designer UX/UI', 'Desenvolvimento de interfaces e experiências do usuário para aplicações web.', 'Rio de Janeiro', 2, 3);

INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa)
VALUES ('Gerente de Projetos', 'Gerenciamento de projetos de software, incluindo planejamento e execução.', 'Belo Horizonte', 4, 1);

INSERT INTO vagas (nome, descricao, cidade, id_estado, id_empresa)
VALUES ('Especialista em Marketing Digital', 'Desenvolvimento e execução de estratégias de marketing digital.', 'Natal', 3, 3);

SELECT * FROM vagas;

INSERT INTO competencias_candidato(id_competencias, id_candidato) VALUES (2, 1);
INSERT INTO competencias_candidato(id_competencias, id_candidato) VALUES (3, 1);

INSERT INTO competencias_candidato(id_competencias, id_candidato) VALUES (2, 2);

INSERT INTO competencias_candidato(id_competencias, id_candidato) VALUES (6, 3);
INSERT INTO competencias_candidato(id_competencias, id_candidato) VALUES (5, 3);

INSERT INTO competencias_candidato(id_competencias, id_candidato) VALUES (6, 4);


INSERT INTO competencias_vagas(id_competencias, id_vagas) VALUES (2, 1);
INSERT INTO competencias_vagas(id_competencias, id_vagas) VALUES (3, 2);
INSERT INTO competencias_vagas(id_competencias, id_vagas) VALUES (5, 3);

SELECT c.nome, comp.nome, cc.id_candidato, cc.id_competencias
FROM candidato AS c, competencias AS comp, competencias_candidato AS cc
WHERE c.id = cc.id_candidato AND comp.id = cc.id_competencias




 