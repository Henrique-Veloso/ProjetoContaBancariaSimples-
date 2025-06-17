package br.edu.faculdadedamas;

public class App 
{
    public static void main( String[] args )
    {
        try {
        ContaBancaria cont1 = new ContaBancaria("Henrique", 10000.00);

        System.out.println("Saldo da conta: " + cont1.exibirSaldo());

        cont1.depositar(2000);

        System.out.println("Seu saldo após deposito: "+ cont1.exibirSaldo());

        cont1.saque(5000);

        System.out.println("Seu saldo após saque: "+ cont1.exibirSaldo());
        } catch (Exception e){
            System.err.println("Houve um erro!" + e.getMessage());
        }
    }
} 
