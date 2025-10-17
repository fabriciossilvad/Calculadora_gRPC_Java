# Calculadora gRPC em Java 21

Este projeto implementa uma **calculadora distribuída** usando **gRPC** e **Protocol Buffers**.  
O projeto foi migrado de RPC tradicional para gRPC, aproveitando a definição de serviços via `.proto` e serialização eficiente.

## Estrutura do Projeto

- `GrpcServer.java` – Classe principal que inicia o servidor gRPC.
- `CalcServer.java` – Implementação dos métodos da calculadora.
- `InterfaceCalculadora.java` – Interface com métodos padrão de cálculo.
- `proto/` – Arquivos `.proto` que definem os serviços e mensagens.
- `.gitignore` – Ignora arquivos temporários e pastas de build.

## Tecnologias Utilizadas

- Java 21
- Maven
- gRPC
- Protocol Buffers
- Postman (para testar os serviços)
## Como Rodar
1. Compilar o servidor
```bash
mvn clean compile
Rodar a aplicação GrpcServer

2. Consumir o Serviço

Criar um novo workspace no Postman para invocar serviços gRPC, definir a Url como 0.0.0.0:50051 e importar o arquivo .proto
Selecionar método que deseja invocar e selecionar a opção de "Use Example Message" para manipular requests e responses 
