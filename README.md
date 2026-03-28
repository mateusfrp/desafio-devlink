# Desafio Backend - DEVLINK

Descrição

Este projeto foi desenvolvido como parte de um desafio técnico com o objetivo de simular o processamento de pedidos de clientes, aplicando regras de negócio para definir o status final de cada pedido.



Regras de negócio

* Pedidos sem itens são rejeitados
* Pedidos com valor total acima de 1000 ficam pendentes
* Clientes VIP têm aprovação automática para pedidos até 2000
* Pedidos com saldo insuficiente são rejeitados



Estrutura do projeto

* **model** → classes de dados (Cliente, Item, Pedido, enums)
* **service** → lógica de negócio (ProcessadorPedido)
* **main** → execução do sistema



Tecnologias utilizadas

* Java
* Programação Orientada a Objetos



Como executar

1. Clone o repositório:
   git clone <link-do-repositorio>

2. Abra o projeto no NetBeans

3. Execute a classe principal (DesafioBackend)



Observações

O projeto foi estruturado com foco em organização, separação de responsabilidades e clareza de código.
Foi utilizado `enum` para garantir maior segurança e evitar erros com valores inválidos.

---

Autor

Mateus Freitas Pereira
