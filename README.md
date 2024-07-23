# Workshop Spring Boot 2

Este projeto é um workshop sobre o desenvolvimento de aplicações RESTful utilizando Spring Boot 2 JPA e Hibernate


## Tecnologias Utilizadas

- **Spring Boot 2**
- **Spring Data JPA**
- **H2 Database**
- **Swagger**
- **Maven**


## Praticas adotadas

- **SOLID**
- **DRY**
- **YAGNI**
- **KISS**


## API

A API oferece operações CRUD para gerenciamento de recursos. A documentação completa da API pode ser acessada via Swagger. [Swagger UI](http://localhost:8082/swagger-ui/index.html) 


### Endpoints Principais

- **GET USERS**
- `http://localhost:8082/users` - Lista todos os usuários

- **POST USERS**
- `http://localhost:8082/users` - Criar usuário

- **POST USERS**
- `http://localhost:8082/users/1` - Atualizar usuário

- **DELETE USERS**
- `http://localhost:8082/users/1` - Deletar usuário


## Como Rodar a Aplicação

1. **Clone o repositório:**
 - git clone https://github.com/Guilherme0035/workshop-springboot2.git

2. **Entrar na pasta:**
 - cd workshop-springboot2

3. **Compile a aplicação:**
 - mvn spring-boot:run


## Como Testar os Endpoints

1. **Via Swagger:**
 - Acesse a documentação interativa do Swagger em [Swagger UI](http://localhost:8082/swagger-ui/index.html) para testar os endpoints da API.

2. **Via Postman ou outra ferramenta de sua preferência:**
- Configure os endpoints e envie requisições para os URLs listados na seção de endpoints principais.
