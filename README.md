<h2>Projeto Bootcamp GFT / BootCamp Santander - Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Foram desenvolvidas aulas pela plataforma DIO - Digital Innovation One onde desenvolveu um pequeno sistema para o 
gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.


Na plataforma da Dio foi passado o conteúdo para aprender a construir do zero uma API REST com Spring Boot para 
cadastro e gerenciamento de pessoas de uma organização, até o Deploy na nuvem (Heroku). Onde foi Praticado os principais
conceitos do estilo arquitetural REST envolvidos durante o desenvolvimento do projeto.

Implementei o campo email para a entidade pessoa, onde uma pessoa pode ter varios emails.


Durante a sessão, serão desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```


São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Muita vontade de aprender e compartilhar conhecimento :)
