# API reativa de gerenciamento de livros utilizando Spring Webflux

Neste projeto foi desenvolvida uma API de gerenciamento de livros utilizando Spring Webflux junto com a library reativa Reactor, que atualmente é mantida pela Vmware. A API fornece as quatro operações básicas de armazenamento persistente - Create, Read, Update, Delete (CRUD). Para isso, foi utilizado localmente o banco de dados NoSQL DynamoDB. Além dos testes da API, o Postman também foi utilizado para gerar uma documentação simples.

## Sobre a programação reativa: 

- https://medium.com/@michellibrito/spring-webflux-f611c8256c53

Quando se utiliza o Spring Webflux, há duas maneiras de se criar componentes Web Server-Side. A primeira é a forma tradicional, utilizando anotações, assim como utiliza-se com o Spring MVC na criação de Controllers. A segunda maneira, que foi a utilizada neste projeto, de se criar componentes Web Server-Side é utilizando o novo estilo funcional (Serviço reativo funcional), onde os componentes são declarados via funções para rotear e manipular solicitações. Para isso é preciso criar dois componentes, Handler e Router. O Handler é onde manipula-se as requisições e defini-se os retornos como status HTTP, Content-Type e Body da resposta. Já o Router é o componente onde defini-se as rotas por meio de funções, recebendo como argumento do método o Handler já pré-definido para especificar o retorno para cada rota criada. 

## Tecnologias utilizadas:

- Sistema Operacional: Ubuntu 20.04.3 LTS;
- Versionamento: Git/GitHub;
- Linguagem de programação: Java 11;
- Banco de dados: DynamoDB Local;
- IDE: IntelliJ Community;
- Testes e documentação da API: Postman.

## Configuração do DynamoDB local:

Para executar o DynamoDB localmente, é necessário seguir alguns passos:

1. Criar uma conta gratuita na AWS: <https://portal.aws.amazon.com/billing/signup?nc2=h_ct&src=header_signup&redirect_url=https%3A%2F%2Faws.amazon.com%2Fregistration-confirmation&language=pt_br#/start>;
2. Download AWS CLI versão 2 (Linux): <https://docs.aws.amazon.com/pt_br/cli/latest/userguide/install-cliv2-linux.html>;
3. Configurar a AWS CLI: <https://docs.aws.amazon.com/pt_br/cli/latest/userguide/cli-configure-quickstart.html>;
4. Instalação: <https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/DynamoDBLocal.DownloadingAndRunning.html>.

## Documentação simples por meio do Postman:

- <https://documenter.getpostman.com/view/17879678/UVR4MVGL>