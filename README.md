# Crud Backend Spring Boot

# Objetivo

Projeto de backend utlizando a linguagem de programação Java e o framework Spring Boot.

# Desafio da empresa ESIG

- Atendimento ao **ITEM A** - Aplicação backend com Spring Boot;
- Atendimento ao **ITEM B** - Persistencia de dados com o banco de dados
[PostgresSql](https://www.postgresql.org/);
- Atendimento ao **ITEM D** - Utilização de testes na camada de serviços com a ferramenta [Junit5](https://junit.org/junit5/);
- Obs: Enrequecimento da apliaçação com a automatização da [documentacão](http://104.131.187.117:8080/swagger-ui.html) utilizando o 
[Swagger](https://swagger.io/).
- Deploy da apliacação gerando um FATJAR utilizando o [Docker](https://www.docker.com/).

# Primeiros Passos: configurando o projeto para desenvolvimento

Esta sessão especifica os passos necessários para que o desenvolvedor possa executar o projeto em seu ambiente
de desenvolvimento.

- Instalar o [Java](https://www.java.com/pt-BR/) versão 8 mais estável;
- Definir variáveis de ambiente JAVA_HOME de acordo com o sistema operacional;
- Utilizar a IDE de sua escolha;
- Instalar o banco de dados Postgres (pode ser com o docker com o seguinte comando 
```docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres```)