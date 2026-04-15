## 3. Padrões de Projeto (Design Patterns)
Para suportar a Arquitetura Hexagonal e garantir um código limpo, utilizaremos os seguintes padrões:
* **Injeção de Dependência:** Gerenciado nativamente pelo Spring Boot, garantindo o baixo acoplamento entre os adaptadores e o domínio.
* **Strategy:** Será aplicado no processamento da fila, permitindo que diferentes tipos de eventos (ex: nova consulta, cancelamento, remarcação) tenham estratégias de processamento isoladas.
* **Factory:** Utilizado para a criação de instâncias complexas das entidades de domínio (como a entidade `Consulta`), garantindo que elas nasçam em um estado válido.

## 4. Requisitos Não-Funcionais (RNF)
* **RNF01 - Resiliência:** O sistema não deve perder agendamentos caso o banco de dados fique indisponível, garantindo o enfileiramento das requisições via RabbitMQ.
* **RNF02 - Desempenho:** O tempo de resposta da API para a requisição inicial de agendamento não deve ultrapassar 500ms.
* **RNF03 - Segurança:** Todas as rotas de API devem trafegar via HTTPS e os dados sensíveis dos pacientes devem estar protegidos.

## 5. Plano de Testes
O planejamento de qualidade do software abrange três níveis de testes:
1. **Testes Unitários (JUnit + Mockito):** Foco exclusivo nas regras de negócio do Domínio (ex: um médico não pode ter duas consultas no mesmo horário).
2. **Testes de Integração:** Validação do fluxo de mensageria (se a mensagem está chegando na fila do RabbitMQ e sendo consumida pelo Worker) e acesso a dados (PostgreSQL).
3. **Testes E2E (End-to-End):** Validação do fluxo completo "Cadastro → Pedido" via interface web.