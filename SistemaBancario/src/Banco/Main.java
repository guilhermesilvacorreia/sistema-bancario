package Banco;

public class Main {
    public static void main(String[] args) {
        // Criação de clientes
        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("Maria Oliveira");
        
        // Criação de contas
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new Poupanca(cliente2);
        
        // Operações na conta corrente
        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
        contaCorrente.transferir(200, contaPoupanca);
        contaCorrente.imprimirExtrato();
        
        // Operações na conta poupança
        contaPoupanca.depositar(300);
        // Render juros na conta poupança, por exemplo, 1% de rendimento
        ((Poupanca) contaPoupanca).renderJuros(0.01);
        contaPoupanca.imprimirExtrato();
    }
}