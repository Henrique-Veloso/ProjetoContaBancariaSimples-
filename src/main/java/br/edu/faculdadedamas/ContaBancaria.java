package br.edu.faculdadedamas;

public class ContaBancaria {
    private String titular; 
    private double saldo;

    public ContaBancaria(String titularConta, double saldoInicial) throws Exception{
        if (saldoInicial <= 0.0) {
            throw new Exception("Não é possivél criar conta com saldo negativo.");
        }
        this.titular = titularConta;
        this.saldo = saldoInicial;
    }

    public double exibirSaldo(){
        return saldo;
    }

    public void depositar(double valorDepositar) throws Exception{
        if (valorDepositar > 0){
            this.saldo = this.saldo + valorDepositar;
        }
        if (valorDepositar <= 0){
            throw new Exception("Não é possivél fazer deposito com valor negativo.");
        }
    }

    public void saque(double valorSacar){
        if ((valorSacar > 0) && (valorSacar <= this.saldo)){
            this.saldo = this.saldo - valorSacar;
        }
    }
}
