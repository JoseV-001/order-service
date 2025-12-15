# Componentes e Injeção de Dependência

Este projeto é uma aplicação Spring Boot, o objetivo principal é demonstrar o uso de componentes e a correta aplicação de injeção de dependência.

##  Sobre

O sistema consiste em calcular o valor total de um pedido, considerando uma porcentagem de desconto e o valor do frete. A lógica foi implementada seguindo o paradigma de componentes, onde cada serviço possui uma responsabilidade única.

### Regra de Negócio para o Frete

| Valor Básico do Pedido (sem desconto) | Valor do Frete |
| :--- | :--- |
| Abaixo de R$ 100,00 | R$ 20,00 |
| De R$ 100,00 até R$ 200,00 (exclusive) | R$ 12,00 |
| R$ 200,00 ou mais | Grátis |

##  Estrutura do Projeto

A aplicação foi estruturada da seguinte forma para garantir a separação de responsabilidades:

* **Entities**: Contém a classe `Order`, que representa os dados do pedido.
* **Services**: 
    * `OrderService`: Responsável por calcular o valor total (Valor Básico - Desconto + Frete).
    * `ShippingService`: Responsável por aplicar as regras de cálculo de frete baseadas no valor bruto.
* **Application**: Classe principal (`OrderServiceApplication`) que gerencia a entrada de dados e exibe o resultado no console.



---

##  Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.5.8**
* **Maven** (Gerenciador de dependências)

---
**Desenvolvido por:** [JoseV-001]

