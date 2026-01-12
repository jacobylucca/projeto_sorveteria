# IceCream Management API

Uma API REST desenvolvida para o gerenciamento técnico de inventário e catálogo de produtos para o setor de gelataria. Este sistema foca no controle rigoroso de estoque, precificação e rastreabilidade de produtos.

## 💻 Sobre o Projeto
O objetivo deste sistema é fornecer uma interface robusta para operações de back-end, permitindo a manutenção de dados sensíveis como datas de validade, custos de produção e níveis de estoque em tempo real.

## 🛠️ Tecnologias e Ferramentas
* **Linguagem:** Java 21 (ou a versão que você estiver usando)
* **Framework:** Spring Boot 3
* **Persistência de Dados:** Spring Data JPA / Hibernate
* **Banco de Dados:** MySQL
* **Gerenciamento de Dependências:** Maven
* **Produtividade:** Lombok
* **Testes de API:** Postman

## 📊 Estrutura de Dados (Model)
O sistema gerencia as seguintes informações técnicas:
- **ID:** Identificador único (Long)
- **Sabor/Descrição:** Identificação do produto
- **Marca:** Fabricante ou linha de produção
- **Preços:** Gestão de Custo e Venda (Double)
- **Estoque:** Controle de unidades em inventário (Integer)
- **Validade:** Controle de perecíveis (LocalDate)
- **Auditoria:** Data e hora de criação automática (LocalDateTime)

## 📡 Endpoints Principais
- `GET /sorvete` - Lista todos os produtos cadastrados.
- `POST /sorvete` - Registra um novo item no sistema.
- `PUT /sorvete/{id}` - Atualiza dados técnicos de um item existente.
- `DELETE /sorvete/{id}` - Remove um registro do banco de dados.

---
Desenvolvido por **Lucca Jacoby** para fins de portfólio técnico.