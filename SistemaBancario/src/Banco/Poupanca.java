package Banco;

public class Poupanca extends Conta {

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInformacoesComuns();
        System.out.println();
    }
    
    // Método para render os juros da poupança
    public void renderJuros(double taxa) {
        if(taxa > 0) {
            double rendimento = this.saldo * taxa;
            this.saldo += rendimento;
            System.out.println(String.format("Rendimento aplicado: R$ %.2f", rendimento));
        } else {
            System.out.println("Taxa de juros inválida.");
        }
    }
}