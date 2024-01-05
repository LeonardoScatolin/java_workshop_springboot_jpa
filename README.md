# Projeto Spring Boot de Gerenciamento de Pedidos

## Descrição do Projeto

Este projeto é uma aplicação Spring Boot que demonstra uma implementação básica de um sistema de gerenciamento de pedidos (orders), produtos (products), categorias (categories) e usuários (users). A estrutura do projeto inclui entidades, repositórios, serviços e recursos REST para cada entidade.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Banco de Dados: H2 (em memória)
- Maven

## Estrutura do Projeto

O projeto está organizado em diferentes pacotes:

- `com.leonardo.spring.config`: Configurações para inicializar dados de teste.
- `com.leonardo.spring.entities`: Entidades como User, Product, Order, etc.
- `com.leonardo.spring.repositories`: Repositórios JPA para cada entidade.
- `com.leonardo.spring.services`: Serviços para cada entidade.
- `com.leonardo.spring.resources`: Controladores REST para cada entidade.

## Endpoints Disponíveis

### Users

- GET `/users`: Retorna todos os usuários.
- GET `/users/{id}`: Retorna um usuário específico por ID.
- POST `/users`: Cria um novo usuário.
- DELETE `/users/{id}`: Exclui um usuário por ID.
- PUT `/users/{id}`: Atualiza um usuário por ID.

### Products

- GET `/products`: Retorna todos os produtos.
- GET `/products/{id}`: Retorna um produto específico por ID.

### Categories

- GET `/categories`: Retorna todas as categorias.
- GET `/categories/{id}`: Retorna uma categoria específica por ID.

### Orders

- GET `/orders`: Retorna todos os pedidos.
- GET `/orders/{id}`: Retorna um pedido específico por ID.
