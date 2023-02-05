# Spring-Ecom

## Api de um E-commerce fictício onde tem CRUD de usuarios, e buscar categorias, usuarios e pedidos.

## rodar a aplicação

certifique-se de ter o docker e o docker-compose instalado no seu ambiente local.

execute o comando docker-compose up -D pra levantar o banco de dados.

e depois os comandos docker build -t ecommerce . para criar uma imagen e docker run -p 8080:8080 ecommerce pra rodar a imagem que acabamos de criar na porta 8080.

ai é só usar o postman ou o insomnia para fazer as requisições http nos endpoints definidos nos controllers.
