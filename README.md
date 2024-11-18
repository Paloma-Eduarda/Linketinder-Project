# Linketinder

## Descrição

O **Linketinder** é uma aplicação Groovy que combina a funcionalidade de Match do Tinder, com o campo individual de competências do Linkedin. 

## Funcionalidades
- **CRUD**:

    **Candidatos**: Criar, listar, atualizar e remover candidatos.
  
    **Competências**: Gerenciar as competências dos candidatos e vagas, criar, listar, atualizar e remover.
  
    **Vagas**: Gerenciar as vagas oferecidas pelas empresas, criar, listar, atualizar e remover.
  
    **Empresas**: Gerenciar informações das empresas, criar, listar, atualizar e remover.

Persistência de Dados: Todos os dados são armazenados em um banco de dados PostgreSQL.

## Tecnologias

- **Back-End:** Groovy e Servlet.
- **Front-End:** TypeScript,JavaScritp, HTML, CSS e Bootstrap 
- **IDE:** IntelliJ IDEA ou qualquer IDE compatível com Groovy.
- **Banco de dados:** PostgreSQL (Persistência de Dados)
- **Modelagem:** Workbench (Criação de modelo)
- **Servidor:** Tomcat 8


## Como Executar

1. Clone o repositório ou baixe o código-fonte.
2. Compile e execute a classe `Linketinder.com.acelerazg.Main`.
3. Utilize o menu principal no console.
4. Configure o banco de dados PostgreSQL e insira as credenciais no arquivo de configuração.
5. Inicie o servidor Tomcat e implante o arquivo .war.
6. Use ferramentas como Postman ou o console da aplicação para interagir com os endpoints.

## Endpoints da API

**Base URL:** http://localhost:8080/Linketinder

### **Candidatos**

#### **1. Criar Candidato**
- **Método:** `POST`
- **Endpoint:** `/candidato`
- **Corpo da Requisição (JSON):**

  ```json
  {
    "cep": "12345678",
    "descricao": "Descrição do candidato",
    "email": "email@dominio.com",
    "senha": "senha123",
    "nome": "Nome do Candidato",
    "pais": 1,
    "cpf": "123.456.789-00",
    "sobrenome": "Sobrenome",
    "data": "2001-11-15"
  }
  
#### **2. Listar Candidatos**
- **Método:** `GET`
- **Endpoint:** `/candidato`


#### **3. Atualizar Candidato**
- **Método:** `PUT`
- **Endpoint:** `/candidato`
- **Descrição:** Atualiza um candidato.
- - **Corpo da Requisição (JSON):**

  ```json
  {
    "id": 1 
    "cep": "12345678",
    "descricao": "Descrição do candidato",
    "email": "email@dominio.com",
    "senha": "senha123",
    "nome": "Nome do Candidato",
    "pais": 1,
    "cpf": "123.456.789-00",
    "sobrenome": "Sobrenome",
    "data": "2001-11-15"
  }
  
#### **4. Excluir Candidato**
- **Método:** `DELETE`
- **Endpoint:** `/candidato?id={id}`
- **Descrição:** Deleta um candidato. 


  ### **Empresa**

#### **1. Criar uma Empresa**
- **Método:** `POST`
- **Endpoint:** `/empresa`
- **Corpo da Requisição (JSON):**

  ```json
  {
    "cep": "12345678",
    "descricao": "Descrição da Empresa",
    "email": "email@dominio.com",
    "senha": "senha123",
    "nome": "Nome da Empresa",
    "pais": 1,
    "cnpj": "123.456.789-00"
  }
  
#### **2. Listar Empresas**
- **Método:** `GET`
- **Endpoint:** `/empresa`


#### **3. Atualizar Empresa**
- **Método:** `PUT`
- **Endpoint:** `/empresa`
- **Descrição:** Atualiza uma Empresa.
- - **Corpo da Requisição (JSON):**

  ```json
  {
    "id": 1 
    "cep": "12345678",
    "descricao": "Descrição da Empresa",
    "email": "email@dominio.com",
    "senha": "senha123",
    "nome": "Nome da Empresa",
    "pais": 1,
    "cnpj": "123.456.789-00"
  }
  
#### **4. Excluir Empresa**
- **Método:** `DELETE`
- **Endpoint:** `/empresa?id={id}`
- **Descrição:** Deleta uma empresa. 
  
  
Desenvolvido por Paloma Eduarda
