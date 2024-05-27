# Java API Authentication BFF

## Projeto de Processo de Seleção do Itaú

### Resumo do Projeto:

Este projeto foi desenvolvido com o objetivo de atender à premissas de um processo seletivo, promovido pelo Itaú Unibanco. O intuito é demonstrar habilidades, competências técnicas e comportamentais, que são necessárias para a posição, destacando a capacidade de desenvolver soluções eficazes e inovadoras para a empresa.

### Apresentação:

Olá! Me chamo **Letícia Bernal**, tenho 22 anos, sou estudante de Gestão de Tecnologia da Informação na UNICID e estou no 2°semenstre.
LinkedIn: https://www.linkedin.com/in/lelebernal/

### Tecnologias usadas:

- Java 21 -> Linguagem de programação
- Spring boot 3.2.5 -> Framework
- Apache Maven 3.9.6 -> Gerenciador de pacotes

### Etapas:

- Instalação do JDK através do site: 
https://www.oracle.com/br/java/technologies/downloads/

- Configurei as variáveis de ambiente do Java (JAVA_HOME), usando como referência o vídeo:
https://www.youtube.com/watch?v=bUnUtt-fe3s&ab_channel=OSTechHelp

- Validei a instalação, através do prompt, usando o comando:

```
java -version
```

- Validei a configuração da variável de ambiente JAVA_HOME, através do cmd:

```
echo $JAVA_HOME
```

- Fiz a instalação do gerenciador de pacotes Maven e configuração através do link: <br>
https://www.youtube.com/watch?v=-ucX5w8Zm8s&ab_channel=LoianeGroner

- Baixei a extensão Spring Boot Extension Pack para VS Code: <br>
https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack

- Para criar o projeto, utilizei o site Start Spring: <br>
https://start.spring.io/

Organizei o meu projeto usando a seguinte estrutura:<br>

```
src/
|-- main/
|   |-- java/
|   |   |-- com/
|   |       |-- project/
|   |           |-- application/
|   |           |   |-- dtos/
|   |           |   |-- useCases/
|   |           |-- presentation/
|   |           |   |-- controllers/
|-- resources/
|   |-- application.properties
|-- ...
```

Por ser um projeto objetivo, não se fez necessário criar a camada de infrastructure, domain e etc.

- Como dependências, usei as seguintes:

spring-boot-starter-web </br>
spring-boot-devtools <br>
spring-boot-starter-test <br>
logback-classic <br>
springdoc-openapi-starter-webmvc-ui <br>

- Para build, comando Maven:

```
mvn clean package
```

- Para rodar os testes rodei o comando Maven:

```
mvn test
```

- Para rodar o projeto usei o comando Maven:

```
mvn spring-boot:run
```

A url para acessar a documentação OpenApi Swagger: <br>
http://localhost:8080/swagger-ui/index.html

### Arquitetura AWS:

Para sugerir uma arquitetura, precisei fazer um estudo e usei vários vídeos como referência, destaco os links: <br>
https://www.youtube.com/watch?v=C8Z8XrGTicQ&ab_channel=S3CloudHub

https://docs.aws.amazon.com/pt_br/apigateway/latest/developerguide/http-api-private-integration.html

<img width="5184" alt="aws" src="https://github.com/leticiabernaldev/itau-java-api-authentication-bff/assets/170205092/9a90c864-fe75-440d-96e4-dc95f3b3d1e3">

- O cliente faz uma requisição transferindo para API Gateway
- VPC link pondera comunicação
- Load Balance fica responsável por selecionar qual container da api será enviado a requisição
- Fargate disponibilizará a gestão dos container que a api está hospedada

### Conclusão
Este template foi baseado em meus breves estudos em API, AWS, aplicação com consistências, boas práticas de orientação a objeto, Cleand Code entre outros...
Desde já agradeço a oportunidade!

<hr>
