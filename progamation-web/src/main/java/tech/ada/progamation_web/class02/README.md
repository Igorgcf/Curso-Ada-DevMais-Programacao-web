# 🧩 Exercício – Client REST CRUD com Java Nativo

## 🎯 Objetivo
Implementar um **cliente REST CRUD em Java nativo**, utilizando apenas as bibliotecas padrão do Java (sem frameworks externos), para consumir a API pública:

🔗 https://dummyjson.com/products

## 🧠 Descrição
O aluno deverá implementar uma aplicação Java capaz de realizar as operações básicas de um CRUD:

- **GET**: listar todos os produtos (`/products`)
- **GET by ID**: buscar um produto específico (`/products/{id}`)
- **POST**: adicionar um novo produto (`/products/add`)
- **PUT**: atualizar um produto (`/products/{id}`)
- **DELETE**: remover um produto (`/products/{id}`)

## 🧱 Requisitos
- Utilizar apenas `java.net.HttpURLConnection` ou `java.net.http.HttpClient` (Java 11+).
- Implementar uma classe `ProductClient` responsável pelas requisições REST.
- Criar uma classe `Main` com o menu de testes chamando cada operação.
- Tratar exceções e exibir mensagens adequadas ao usuário.
- Exibir o código de status HTTP retornado.

## 🚀 Tarefas
1. Criar o método para listar produtos.
2. Criar o método para buscar produto por ID.
3. Criar o método para adicionar novo produto.
4. Criar o método para atualizar produto.
5. Criar o método para excluir produto.
6. Criar um menu simples no terminal com as opções acima.

## 💡 Dica
Utilize `HttpRequest` e `HttpResponse` (Java 11) para enviar e receber dados JSON.  
Para converter JSON em String, use `String.format` e manipulação manual de texto.

---
**Exemplo de chamada GET:**

```java
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://dummyjson.com/products"))
    .GET()
    .build();
```

---
**Desafio extra:** implementar parsing do JSON de resposta para exibir os produtos de forma formatada.
