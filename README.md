# Java API Authentication BFF

## Projeto de Processo de Seleção do Itaú

### Resumo do Projeto:

Este projeto foi desenvolvido com o objetivo de atender à premissas de um processo seletivo, promovido pelo Itaú Unibanco. O intuito é demonstrar habilidades, competências técnicas e comportamentais, que são necessárias para a posição, destacando a capacidade de desenvolver soluções eficazes e inovadoras para os clientes do Squad.

### Apresentação:

Sou **Letícia Bernal**, estudante de Tecnologia da Informação 
LinkedIn: https://www.linkedin.com/in/lelebernal/

### Tecnologias:

- Java 21 -> Linguagem de programação
- Spring boot 3.2.5 -> Framework
- Apache Maven 3.9.6 -> Gerenciador de pacotes

### Etapas:

- Fiz a instalação do JDK através do site: 
https://www.oracle.com/br/java/technologies/downloads/

- Configurei as variáveis de ambiente do Java (JAVA_HOME) usando como referência o vídeo:
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

Por ser um projeto simples e objetivo, não se fez necessário criar a camada de infrastructure, domain e etc.

- Como dependências, usei as seguintes:

spring-boot-starter-web </br>
spring-boot-devtools <br>
spring-boot-starter-test <br>
logback-classic <br>
springdoc-openapi-starter-webmvc-ui <br>

- Para buildar meu projeto usei o comando Maven:

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

Para sugerir uma arquitetura eu precisei fazer um estudo e usei vários vídeos como referência, destaco os links: <br>
https://www.youtube.com/watch?v=C8Z8XrGTicQ&ab_channel=S3CloudHub

https://docs.aws.amazon.com/pt_br/apigateway/latest/developerguide/http-api-private-integration.html

![Texto Alternativo](https://docs.aws.amazon.com/pt_br/apigateway/latest/developerguide/images/private-integration.png)

- O cliente faz uma requisição que bate em API Gateway
- O VPC link fica responsável pela comunicação
- O Load Balance fica responsável por selecionar qual container da api será enviado a requisição
- E o Fargate disponibilizará a gestão dos container que a api está hospedada

### Conclusão

Agradeço imensamente a oportunidade que estou tendo de participar desse processo e estou estudando com muita dedicação para conhecer outras abordagens de hospedar a API na AWS e também para aplicar com consistências boas práticas de orientação a objeto, Cleand Code e etc no desenvolvimento dos meus projetos.

<hr>
