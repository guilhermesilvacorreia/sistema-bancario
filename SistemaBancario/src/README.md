# Simulação de Banco - Projeto Java

Este projeto é um exemplo simplificado de uma simulação bancária em Java. Ele demonstra operações básicas, como depósitos, saques, transferências e o rendimento de uma conta poupança. O sistema utiliza conceitos de orientação a objetos para modelar entidades como Banco, Cliente, e Conta, subdividindo essa última em Conta Corrente e Poupança.

## Estrutura do Projeto

* **Banco**
    * Representa o banco e contém atributos básicos, como o nome do banco.
* **Cliente**
    * Modelo para clientes do banco. Cada cliente possui nome e pode estar associado a uma ou mais contas.
* **Conta (Classe Abstrata)**
    * Define atributos e métodos comuns a todas as contas (como saque, depósito e transferência). Contém também um método para imprimir informações gerais da conta.
    * Essa classe é implementada pela interface **IConta** que padroniza as operações bancárias.
* **ContaCorrente**
    * Extensão de **Conta** que representa uma conta corrente. Possui um método de impressão de extrato específico.
* **Poupanca**
    * Extensão de **Conta** que representa uma conta poupança. Além das operações comuns, inclui um método `renderJuros` que simula o rendimento dos juros aplicados à conta.
* **Main**
    * Classe principal que inicializa clientes e contas, executa as operações bancárias (depósito, saque, transferência e rendimento) e exibe os extratos no console.

## Funcionalidades

* **Operações Bancárias Básicas:**
    * Permite realizar depósitos, saques e transferências entre contas.
* **Rendimento na Poupança:**
    * A conta poupança pode render juros, simulando o crescimento do saldo conforme a taxa informada.
* **Impressão de Extratos:**
    * Cada tipo de conta imprime um extrato detalhado, mostrando informações como titular, número da conta, agência e saldo.

## Como Executar

1.  **Clone o Repositório:**
    ```bash
    git clone <https://github.com/guilhermesilvacorreia/sistema-bancario>
    ```
2.  **Importe o Projeto no Eclipse:**
    * Abra o Eclipse e vá em `File > Import... > Existing Projects into Workspace`.
    * Selecione a pasta onde o projeto foi clonado e importe-o.
3.  **Compile e Execute:**
    * Execute a classe `Main.java` para simular as operações bancárias. O resultado será exibido no console.

## Requisitos

* **Java JDK 8 ou Superior**
* **IDE de sua preferência:**
    * Recomenda-se o Eclipse, que já possui integração com Git por meio do plugin EGit.

## Melhorias Futuras

* **Interface Gráfica:**
    * Desenvolvimento de uma interface visual para facilitar a interação do usuário com o sistema.
* **Persistência de Dados:**
    * Integração com um banco de dados para armazenar informações de clientes e contas.
* **Segurança:**
    * Implementação de autenticação e autorização para as operações bancárias.
* **Testes Automatizados:**
    * Criação de testes unitários para assegurar a qualidade e estabilidade do código.