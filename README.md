# Documentação do Projeto

## Descrição
Este projeto foi desenvolvido como parte de um teste técnico, utilizando Java 17 e Spring Boot para a construção do backend. O banco de dados utilizado é MySQL e a IDE escolhida para o desenvolvimento foi o IntelliJ IDEA.

O sistema implementa o gerenciamento de Subestações e Redes de Média Tensão (redeMT), onde uma Subestação pode conter diversas Redes, estabelecendo assim um relacionamento OneToMany entre essas entidades.

Atualmente, foram implementadas apenas as funcionalidades de listagem e salva de registros, conforme solicitado no teste. O projeto segue o padrão **Domain-Driven Design (DDD)**.
Foi criada uma entrada de dados que permite salvar uma subestação e, utilizando Hibernate, o ID é automaticamente setado, realizando o join com as redes, que podem ser uma ou uma lista.

## Tecnologias Utilizadas
- **Linguagem**: Java 17
- **Framework**: Spring Boot
- **Banco de Dados**: MySQL
- **IDE**: IntelliJ IDEA
- **Documentação da API**: Swagger

## Estrutura do Projeto

O projeto segue o padrão **DDD (Domain-Driven Design)**, organizado da seguinte forma:

&#x20; /src

&#x20; /main

&#x20;   /java/com/seuapp

&#x20;     /domain       # Contém as entidades e regras de negócio

&#x20;     /infrastructure # Contém as configurações e exceções

&#x20;     /application  # Contém os serviços

&#x20;   /resources

&#x20;     /application.yml # Configurações da aplicação

## Endpoints Disponíveis
### Subestacao Controller
- **GET /subestacoes** - Lista todas as subestações cadastradas
- **POST /subestacoes** - Salva uma nova subestação

### RedeMT Controller
- **GET /redes** - Lista todas as redes cadastradas
- **POST /redes** - Salva uma nova rede

### EntradaDadosController
- **POST /entrada** - Salva uma subestação e as redes

## Configuração do Banco de Dados (application.yml)
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/seubanco
    username: seuusuario
    password: suasenha
  jpa:
    hibernate:
      ddl-auto: update
```

## Como Rodar o Projeto
1. Clonar o repositório:
   ```sh
   git clone https://github.com/seuusuario/seurepositorio.git
   ```
2. Acessar o diretório do projeto:
   ```sh
   cd seurepositorio
   ```
3. Configurar o banco de dados no arquivo `application.yml`
4. Executar o projeto:
   ```sh
   mvn spring-boot:run
   ```
5. A API estará disponível em `http://localhost:8080`

## Documentação da API com Swagger
O Swagger foi utilizado para documentar a API. Após iniciar o projeto, acesse a documentação interativa em:
```
http://localhost:8080/swagger-ui.html
```

## Considerações Finais
Este projeto foi desenvolvido com foco nas funcionalidades essenciais requeridas pelo teste. Caso haja necessidade de melhorias ou novas funcionalidades, futuras versões poderão ser implementadas.

